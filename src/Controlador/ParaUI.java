package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import Modelo.Libro;
import Utiles.Validaciones;
import Vista.UI;
import Modelo.Libreria;

public class ParaUI extends UI {

	private Libro libro;
	Libreria libreria = new Libreria();

	public ParaUI() {
		btnSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (Validaciones.validateISBN(textSerialNumber.getText())
						&& Validaciones.validateLetters(textAutor.getText())
						&& Validaciones.validateLetters(textEditorial.getText())
						&& Validaciones.isNumberFloat(textPrice.getText())) {
					libro = new Libro(textSerialNumber.getText(), textTitle.getText(), textAutor.getText(),
							textEditorial.getText(), Float.parseFloat(textPrice.getText()), getRadioButtonFormat(),
							getRadioButtonState());
					if (!libreria.checkIsbnExist(textSerialNumber.getText())) {
						libreria.addBook(libro);
						fillTable(tableRack);
						vaciarCampos();
						JOptionPane.showMessageDialog(null, "Libro guardado correctamente");
					} else {
						JOptionPane.showMessageDialog(null, "ISBN existente");

					}
				} else {
					JOptionPane.showMessageDialog(null, "Campos erroneos");

				}
			}

		});
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i = libreria.getIDSelect(tableRack);
				libreria.delBook(i);
				fillTable(tableRack);
				JOptionPane.showConfirmDialog(null, "Libro borrado");
			}

		});

		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				;
			}
		});

		btnConsult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String ISBNsel = JOptionPane.showInputDialog("Introduce el ISBN");
				if (ISBNsel != null && !ISBNsel.isEmpty()) {
					JOptionPane.showMessageDialog(null, libreria.getBook(ISBNsel));
				} else {
					JOptionPane.showMessageDialog(null, "ISBN no existente");
				}
			}
		});

	}

	public void fillTable(JTable tableRack) {
		ArrayList<Libro> arrayBook = libreria.getArrayBook();
		String[] nameColumns = { "ISBN", "TITULO", "AUTOR", "EDITORIAL", "PRECIO" };
		String[][] rows = new String[arrayBook.size()][5];
		for (int i = 0; i < arrayBook.size(); i++) {
			rows[i][0] = arrayBook.get(i).getISBN();
			rows[i][1] = arrayBook.get(i).getTitle();
			rows[i][2] = arrayBook.get(i).getAutor();
			rows[i][3] = arrayBook.get(i).getEditorial();
			rows[i][4] = String.valueOf(arrayBook.get(i).getPrice());
		}
		DefaultTableModel tableComplete = new DefaultTableModel(rows, nameColumns);
		tableRack.setModel(tableComplete);
		
		DefaultTableCellRenderer align = new DefaultTableCellRenderer();
		align.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < tableRack.getColumnCount(); i++) {
			tableRack.getColumnModel().getColumn(i).setCellRenderer(align);
		}
	}




	private void vaciarCampos() {
		textSerialNumber.setText("");
		textPrice.setText("");
		textTitle.setText("");
		textEditorial.setText("");
		textAutor.setText("");

	}

	private void mostrarCampos(Libro libro) {
		textSerialNumber.setText(libro.getISBN());
		textPrice.setText(String.valueOf(libro.getPrice()));
		textTitle.setText(libro.getTitle());
		textEditorial.setText(libro.getEditorial());
		textAutor.setText(libro.getAutor());
	}

	public String getRadioButtonFormat() {
		if (rdbtnPaperBoard.isSelected()) {
			return rdbtnPaperBoard.getText();
		}
		if (rdbtnRustic.isSelected()) {
			return rdbtnRustic.getText();
		}
		if (rdbtnStapled.isSelected()) {
			return rdbtnStapled.getText();
		}
		if (rdbtnSpiral.isSelected()) {
			return rdbtnSpiral.getText();
		}
		return null;
	}

	public String getRadioButtonState() {
		if (rdbtnNew.isSelected()) {
			return rdbtnNew.getText();
		}
		if (rdbtnReedition.isSelected()) {
			return rdbtnReedition.getText();
		}
		return null;

	}
}
