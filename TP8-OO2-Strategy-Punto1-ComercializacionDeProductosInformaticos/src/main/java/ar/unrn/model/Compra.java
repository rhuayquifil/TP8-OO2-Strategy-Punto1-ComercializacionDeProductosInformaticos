package ar.unrn.model;

// este es mi contexto
public class Compra {

	private CarritoDeCompras carrito;
	private CalculadorDistancia calculadorDistancia;

	public Compra(CalculadorDistancia calculadorDistancia, CarritoDeCompras carrito) {
		this.calculadorDistancia = calculadorDistancia;
		this.carrito = carrito;
	}

	public double calcularEnvioColectivoSurA(Destino destino) {
		return carrito.costoTotal() + destino.logisticaColectivoSur(carrito.pesoTotal());
	}

	public double calcularEnvioCorreoArgentinoA(Destino destino) {
		return carrito.costoTotal()
				+ destino.logisticaCorreoArgentino(calculadorDistancia.distanciaEntreCapitalFederalY(destino));
	}

}
