package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;

import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JTextField textSerialNumber;
	protected JTextField textTitle;
	protected JTextField textAutor;
	protected JTextField textEditorial;
	protected JTextField textPrice;
	protected JTable tableRack;
	protected JButton btnSave;
	protected JButton btnDelete;
	protected JButton btnExit;
	protected JButton btnConsult;
	protected JRadioButton rdbtnPaperBoard;
	protected JRadioButton rdbtnRustic;
	protected JRadioButton rdbtnStapled;
	protected JRadioButton rdbtnSpiral;
	protected JRadioButton rdbtnNew;
	protected JRadioButton rdbtnReedition;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		panelNorth.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setBackground(new Color(25, 25, 112));
		
		
		JLabel lblnameLibrary = new JLabel("Libreria Papelon");
		lblnameLibrary.setForeground(SystemColor.scrollbar);
		lblnameLibrary.setFont(new Font("Arial Black", Font.PLAIN, 34));
		panelNorth.add(lblnameLibrary);
		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(new Color(255, 102, 102));
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		btnSave = new JButton("Guardar");
	
		
		btnExit = new JButton("Salir");
		
		btnDelete = new JButton("Borrar");
		
		btnConsult = new JButton("Consultar");
		
		ButtonGroup groupFormat = new ButtonGroup();
		groupFormat.add(rdbtnPaperBoard);
		groupFormat.add(rdbtnRustic);
		groupFormat.add(rdbtnSpiral);
		groupFormat.add(rdbtnStapled);
		
		ButtonGroup groupState = new ButtonGroup();
		groupState.add(rdbtnNew);
		groupState.add(rdbtnReedition);
		
		
		GroupLayout gl_panelSouth = new GroupLayout(panelSouth);
		gl_panelSouth.setHorizontalGroup(
			gl_panelSouth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSouth.createSequentialGroup()
					.addGap(22)
					.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addGap(120)
					.addComponent(btnConsult, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
					.addGap(39)
					.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
					.addGap(36)
					.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(243))
		);
		gl_panelSouth.setVerticalGroup(
			gl_panelSouth.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSouth.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panelSouth.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnExit)
						.addComponent(btnDelete)
						.addComponent(btnConsult))
					.addContainerGap())
		);
		panelSouth.setLayout(gl_panelSouth);
		
		JTabbedPane tabbedCenter = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedCenter, BorderLayout.CENTER);
		
		JPanel panelBook = new JPanel();
		panelBook.setBorder(new CompoundBorder());
		panelBook.setBackground(new Color(153, 255, 204));
		tabbedCenter.addTab("Libro", null, panelBook, null);
		tabbedCenter.setForegroundAt(0, Color.BLACK);
		tabbedCenter.setBackgroundAt(0, Color.WHITE);
		
		JLabel lblSerialNumber = new JLabel("ISBN:");
		
		JLabel lblTitle = new JLabel("Titulo");
		
		JLabel lblAutor = new JLabel("Autor");
		
		JLabel lblEdItorial = new JLabel("Editorial");
		
		JLabel lblPrice = new JLabel("Precio");
		
		textSerialNumber = new JTextField();
		textSerialNumber.setColumns(10);
		
		textTitle = new JTextField();
		textTitle.setColumns(10);
		
		textAutor = new JTextField();
		textAutor.setColumns(10);
		
		textEditorial = new JTextField();
		textEditorial.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		
		JLabel lblIconPng = new JLabel("");
		lblIconPng.setIcon(new ImageIcon(UI.class.getResource("/img/libro.png")));
		
		JPanel panelFormat = new JPanel();
		panelFormat.setBackground(new Color(153, 255, 255));
		panelFormat.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		JPanel panelState = new JPanel();
		panelState.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelState.setBackground(new Color(153, 255, 255));
		
		JLabel lblFormat = new JLabel("Formato");
		lblFormat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblStatus = new JLabel("Estado");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_panelBook = new GroupLayout(panelBook);
		gl_panelBook.setHorizontalGroup(
			gl_panelBook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBook.createSequentialGroup()
					.addGroup(gl_panelBook.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelBook.createSequentialGroup()
							.addGap(36)
							.addGroup(gl_panelBook.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelBook.createSequentialGroup()
									.addGroup(gl_panelBook.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSerialNumber, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panelBook.createParallelGroup(Alignment.LEADING)
										.addComponent(textAutor, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
										.addComponent(textSerialNumber, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
								.addGroup(gl_panelBook.createSequentialGroup()
									.addComponent(lblAutor, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textTitle, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
								.addGroup(gl_panelBook.createSequentialGroup()
									.addGroup(gl_panelBook.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panelBook.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblEdItorial, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
									.addGap(2)
									.addGroup(gl_panelBook.createParallelGroup(Alignment.LEADING)
										.addComponent(textPrice, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
										.addComponent(textEditorial, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblIconPng, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
						.addGroup(gl_panelBook.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelBook.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblFormat)
								.addComponent(lblStatus, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelBook.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panelState, GroupLayout.PREFERRED_SIZE, 578, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelFormat, GroupLayout.PREFERRED_SIZE, 578, GroupLayout.PREFERRED_SIZE))))
					.addGap(62))
		);
		gl_panelBook.setVerticalGroup(
			gl_panelBook.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBook.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_panelBook.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelBook.createSequentialGroup()
							.addGroup(gl_panelBook.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSerialNumber)
								.addComponent(textSerialNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panelBook.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTitle)
								.addComponent(textAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(25)
							.addGroup(gl_panelBook.createParallelGroup(Alignment.BASELINE)
								.addComponent(textTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAutor))
							.addGap(32)
							.addGroup(gl_panelBook.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEdItorial)
								.addComponent(textEditorial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_panelBook.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPrice)
								.addComponent(textPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblIconPng, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panelBook.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelBook.createSequentialGroup()
							.addGap(18)
							.addComponent(panelFormat, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelBook.createSequentialGroup()
							.addGap(44)
							.addComponent(lblFormat)))
					.addGroup(gl_panelBook.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panelBook.createSequentialGroup()
							.addGap(26)
							.addComponent(panelState, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGap(22))
						.addGroup(Alignment.TRAILING, gl_panelBook.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblStatus)
							.addGap(32))))
		);
		
	
		
		rdbtnReedition = new JRadioButton("Reedici\u00F3n\r\n");
		rdbtnReedition.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnReedition.setBackground(new Color(153, 255, 255));
		panelState.add(rdbtnReedition);
		
		rdbtnNew = new JRadioButton("Novedad");
		rdbtnNew.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNew.setBackground(new Color(153, 255, 255));
		panelState.add(rdbtnNew);
		
		rdbtnPaperBoard = new JRadioButton("Carton\u00E9");
		rdbtnPaperBoard.setBackground(new Color(153, 255, 255));
		rdbtnPaperBoard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelFormat.add(rdbtnPaperBoard);
		
		rdbtnRustic = new JRadioButton("R\u00FAstica");
		rdbtnRustic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnRustic.setBackground(new Color(153, 255, 255));
		panelFormat.add(rdbtnRustic);
		
		rdbtnStapled = new JRadioButton("Grapada");
		rdbtnStapled.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnStapled.setBackground(new Color(153, 255, 255));
		panelFormat.add(rdbtnStapled);
		
		rdbtnSpiral = new JRadioButton("Espiral");
		rdbtnSpiral.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnSpiral.setBackground(new Color(153, 255, 255));
		panelFormat.add(rdbtnSpiral);
		panelBook.setLayout(gl_panelBook);
		
		
		JPanel panelRack = new JPanel();
		panelRack.setBackground(new Color(135, 206, 250));
		tabbedCenter.addTab("Estanteria", null, panelRack, null);
		
		JScrollPane scrollRack = new JScrollPane();
		GroupLayout gl_panelRack = new GroupLayout(panelRack);
		gl_panelRack.setHorizontalGroup(
			gl_panelRack.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRack.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollRack, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelRack.setVerticalGroup(
			gl_panelRack.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRack.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollRack, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		
		tableRack = new JTable();
		scrollRack.setViewportView(tableRack);
		panelRack.setLayout(gl_panelRack);
	}
}
