package ar.unrn.model;

public class CalculadorDistancia {

	public CalculadorDistancia() {
	}

	public double distanciaEntreCapitalFederalY(Destino destino) {
		if (destino.equals(new CapitalFederalDestino())) {
			return 0;
		}
		return 100;
	}

}
