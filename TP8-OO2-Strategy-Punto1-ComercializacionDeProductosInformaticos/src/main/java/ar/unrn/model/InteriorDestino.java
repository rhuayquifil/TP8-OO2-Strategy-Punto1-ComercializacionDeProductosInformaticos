package ar.unrn.model;

public class InteriorDestino extends Destino {

	public InteriorDestino() {
		super("Interior", 3);
	}

	@Override
	public double logisticaColectivoSur(double pesoDelPaquete) {
		Logistica logistica = new ColectivosSurLogistica();
		return logistica.costoEnvioAInterior(pesoDelPaquete);
	}

	@Override
	public double logisticaCorreoArgentino(double distancia) {
		Logistica logistica = new CorreoArgentinoLogistica();
		return logistica.costoEnvioAInterior(distancia);
	}

}
