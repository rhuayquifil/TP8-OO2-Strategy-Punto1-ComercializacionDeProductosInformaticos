package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.unrn.model.CalculadorDistancia;
import ar.unrn.model.CapitalFederalDestino;
import ar.unrn.model.CarritoDeCompras;
import ar.unrn.model.Compra;
import ar.unrn.model.GranBuenosAiresDestino;
import ar.unrn.model.InteriorDestino;
import ar.unrn.model.Producto;
import ar.unrn.model.ProductoInformatico;

class PruebasUnitarias {

	@Test
	void EnvioConColectivoSurACapitalFederalMenosDe5kg() {
		List<Producto> listaDeProductos = new ArrayList<Producto>();
		listaDeProductos.add(new ProductoInformatico("Microprocesador", 150000, 0.5));
		listaDeProductos.add(new ProductoInformatico("Motherboard", 50000, 1));

		CarritoDeCompras carrito = new CarritoDeCompras(listaDeProductos);

		Compra nuevaCompra = new Compra(new CalculadorDistancia(), carrito);
		double resultado = nuevaCompra.calcularEnvioColectivoSurA(new CapitalFederalDestino());
		assertEquals(201000.0, resultado);
	}

	@Test
	void EnvioConCorreoArgentinoACapitalFederal() {
		List<Producto> listaDeProductos = new ArrayList<Producto>();
		listaDeProductos.add(new ProductoInformatico("Microprocesador", 150000, 0.5));
		listaDeProductos.add(new ProductoInformatico("Motherboard", 50000, 1));

		CarritoDeCompras carrito = new CarritoDeCompras(listaDeProductos);

		Compra nuevaCompra = new Compra(new CalculadorDistancia(), carrito);
		double resultado = nuevaCompra.calcularEnvioCorreoArgentinoA(new CapitalFederalDestino());
		assertEquals(200500.0, resultado);
	}

	@Test
	void EnvioConColectivoSurAGranBuenosAiresMasDe5kg() {
		List<Producto> listaDeProductos = new ArrayList<Producto>();
		listaDeProductos.add(new ProductoInformatico("Termotante", 80000, 15));
		listaDeProductos.add(new ProductoInformatico("Caños PVC", 20000, 5));

		CarritoDeCompras carrito = new CarritoDeCompras(listaDeProductos);

		Compra nuevaCompra = new Compra(new CalculadorDistancia(), carrito);
		double resultado = nuevaCompra.calcularEnvioColectivoSurA(new GranBuenosAiresDestino());
		assertEquals(102000.0, resultado);
	}

	@Test
	void EnvioConCorreoArgentinoAGranBuenosAires() {
		List<Producto> listaDeProductos = new ArrayList<Producto>();
		listaDeProductos.add(new ProductoInformatico("Termotante", 80000, 15));
		listaDeProductos.add(new ProductoInformatico("Caños PVC", 20000, 5));

		CarritoDeCompras carrito = new CarritoDeCompras(listaDeProductos);

		Compra nuevaCompra = new Compra(new CalculadorDistancia(), carrito);
		double resultado = nuevaCompra.calcularEnvioCorreoArgentinoA(new GranBuenosAiresDestino());
		assertEquals(101300.0, resultado);
	}

	@Test
	void EnvioConColectivoSurAInteriorMenos5kg() {
		List<Producto> listaDeProductos = new ArrayList<Producto>();
		listaDeProductos.add(new ProductoInformatico("Microprocesador", 150000, 0.5));
		listaDeProductos.add(new ProductoInformatico("Motherboard", 50000, 1));

		CarritoDeCompras carrito = new CarritoDeCompras(listaDeProductos);

		Compra nuevaCompra = new Compra(new CalculadorDistancia(), carrito);
		double resultado = nuevaCompra.calcularEnvioColectivoSurA(new InteriorDestino());
		assertEquals(203000.0, resultado);
	}

	@Test
	void EnvioConCorreoArgentinoAInterior() {
		List<Producto> listaDeProductos = new ArrayList<Producto>();
		listaDeProductos.add(new ProductoInformatico("Termotante", 80000, 15));
		listaDeProductos.add(new ProductoInformatico("Caños PVC", 20000, 5));

		CarritoDeCompras carrito = new CarritoDeCompras(listaDeProductos);

		Compra nuevaCompra = new Compra(new CalculadorDistancia(), carrito);
		double resultado = nuevaCompra.calcularEnvioCorreoArgentinoA(new InteriorDestino());
		assertEquals(101300.0, resultado);
	}
}
