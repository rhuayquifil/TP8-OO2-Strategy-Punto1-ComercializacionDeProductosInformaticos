package ar.unrn.model;

public abstract class Logistica {

	public Logistica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double costoEnvioACapitalFederal(double dato) {
		return precioFijoCapitalFederal() + extraPeso(dato) + extraDistancia(dato);
	}

	public double costoEnvioAGranBuenosAires(double dato) {
		return precioFijoGranBuenosAires() + extraPeso(dato) + extraDistancia(dato);
	}

	public double costoEnvioAInterior(double dato) {
		return precioFijoInterior() + extraPeso(dato) + extraDistancia(dato);
	}

	protected abstract double precioFijoCapitalFederal();

	protected abstract double precioFijoGranBuenosAires();

	protected abstract double precioFijoInterior();

	protected abstract double extraPeso(double pesoDelPaquete);

	protected abstract double extraDistancia(double distancia);
}
