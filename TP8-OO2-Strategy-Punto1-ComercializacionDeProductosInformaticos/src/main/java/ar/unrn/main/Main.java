package ar.unrn.main;

import java.util.ArrayList;
import java.util.List;

import ar.unrn.model.CalculadorDistancia;
import ar.unrn.model.CarritoDeCompras;
import ar.unrn.model.Compra;
import ar.unrn.model.InteriorDestino;
import ar.unrn.model.Producto;
import ar.unrn.model.ProductoInformatico;

public class Main {

	public static void main(String[] args) {
		List<Producto> listaDeProductos = new ArrayList<Producto>();
		listaDeProductos.add(new ProductoInformatico("Microprocesador", 150000, 0.5));
		listaDeProductos.add(new ProductoInformatico("Motherboard", 50000, 1));

		CarritoDeCompras carrito = new CarritoDeCompras(listaDeProductos);

		Compra nuevaCompra = new Compra(new CalculadorDistancia(), carrito);
		System.out.println(nuevaCompra.calcularEnvioColectivoSurA(new InteriorDestino()));
//		System.out.println(nuevaCompra.calcularEnvioCorreoArgentinoA(new InteriorDestino()));
	}

}
