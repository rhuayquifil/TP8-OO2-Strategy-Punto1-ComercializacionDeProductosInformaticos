package ar.unrn.model;

import java.util.List;

public class CarritoDeCompras {

	private List<Producto> listaProductos;

	public CarritoDeCompras(List<Producto> listaDeProductos) {
		this.listaProductos = listaDeProductos;
	}

	public double costoTotal() {
		double costoTotal = 0;
		for (Producto producto : listaProductos) {
			costoTotal += producto.precio();
		}
		return costoTotal;
	}

	public double pesoTotal() {
		double pesoTotal = 0;
		for (Producto producto : listaProductos) {
			pesoTotal += producto.peso();
		}
		return pesoTotal;
	}

}
