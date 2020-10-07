package Modelo;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Libreria {

	private ArrayList<Libro> arrayBook = new ArrayList<Libro>();

	public ArrayList<Libro> getArrayBook() {
		return arrayBook;
	}

	public void addBook(Libro libro) {
		arrayBook.add(libro);
	}

	public void delBook(int index) {
		arrayBook.remove(index);
	}

	public int getIDSelect(JTable tableRack) {
		for (int i = 0; i < arrayBook.size(); i++) {
			if (tableRack.getSelectedRow() == i) {
				return i;
			}
		}
		return -1;
	}

	public String getBook(String ISBN) {
		for (int i = 0; i < this.arrayBook.size(); i++) {
			if (this.arrayBook.get(i).getISBN().equals(ISBN)) {
				return arrayBook.get(i).getISBN();
			}
		}
		return ISBN;
	}

	public boolean checkIsbnExist(String ISBNsel) {
		boolean response = false;
		for (int i = 0; i < arrayBook.size(); i++) {
			if (this.arrayBook.get(i).getISBN().equals(ISBNsel)) {
				response = true;
			}
		}
		return response;
	}
	
	
	
//	 tableRack= new JTable() {
		 
	public boolean isCellEditable(int row, int column) {

		return false;
	}
//	};
}
//}
