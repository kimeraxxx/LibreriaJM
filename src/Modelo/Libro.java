package Modelo;

public class Libro {
	private String ISBN;
	private String title;
	private String autor;
	private String editorial;
	private float price;
	private String format;
	private String state;

	public Libro(String iSBN, String title, String autor, String editorial, float price, String format,
			String state) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.autor = autor;
		this.editorial = editorial;
		this.price = price;
		this.format = format;
		this.state = state;
	}

	private String getFormat() {
		return format;
	}

	private String getState() {
		return state;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public float getPrice() {
		return price;
	}

	public String toString() {
		return "ISBN: " + ISBN + "\nTitulo: " + title + "\nAutor: " + autor + "\nEditorial: " + editorial + "\nFormato"+format+"\nEstado"+state+"\nPrecio: "
				+ price;

	}
}
