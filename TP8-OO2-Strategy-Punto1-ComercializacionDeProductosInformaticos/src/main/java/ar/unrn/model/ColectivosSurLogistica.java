package ar.unrn.model;

public class ColectivosSurLogistica extends Logistica {

	public ColectivosSurLogistica() {
	}

	@Override
	protected double precioFijoCapitalFederal() {
		return 1000;
	}

	@Override
	protected double precioFijoGranBuenosAires() {
		return 1500;
	}

	@Override
	protected double precioFijoInterior() {
		return 3000;
	}

	@Override
	protected double extraPeso(double peso) {
		if (peso < 5) {
			return 0;
		}
		if (peso <= 30) {
			return 500;
		}
		return 2000;
	}

	@Override
	protected double extraDistancia(double distancia) {
		return 0;
	}
}
