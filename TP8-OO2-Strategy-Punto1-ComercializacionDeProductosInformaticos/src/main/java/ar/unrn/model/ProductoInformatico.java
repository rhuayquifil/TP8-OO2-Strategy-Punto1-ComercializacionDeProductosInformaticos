package ar.unrn.model;

public class ProductoInformatico implements Producto {

	private String nombre;
	private double precio;
	private double peso;

	public ProductoInformatico(String nombre, double precio, double peso) {
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
	}

	public String nombre() {
		return this.nombre;
	}

	public double precio() {
		return this.precio;
	}

	public double peso() {
		return this.peso;
	}

}
