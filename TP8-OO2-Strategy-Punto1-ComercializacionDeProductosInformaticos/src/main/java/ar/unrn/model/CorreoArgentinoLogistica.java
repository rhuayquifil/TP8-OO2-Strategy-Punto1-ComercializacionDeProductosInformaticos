package ar.unrn.model;

public class CorreoArgentinoLogistica extends Logistica {

	@Override
	protected double precioFijoCapitalFederal() {
		return 500;
	}

	@Override
	protected double precioFijoGranBuenosAires() {
		return 800;
	}

	@Override
	protected double precioFijoInterior() {
		return 800;
	}

	@Override
	protected double extraPeso(double pesoDelPaquete) {
		return 0;
	}

	@Override
	protected double extraDistancia(double distancia) {
		return 5 * distancia;
	}
}
