package ar.unrn.model;

public class CapitalFederalDestino extends Destino {

	public CapitalFederalDestino() {
		super("Capital Federal", 1);
	}

	@Override
	public double logisticaColectivoSur(double pesoDelPaquete) {
		Logistica logistica = new ColectivosSurLogistica();
		return logistica.costoEnvioACapitalFederal(pesoDelPaquete);
	}

	@Override
	public double logisticaCorreoArgentino(double distancia) {
		Logistica logistica = new CorreoArgentinoLogistica();
		return logistica.costoEnvioACapitalFederal(distancia);
	}
}
