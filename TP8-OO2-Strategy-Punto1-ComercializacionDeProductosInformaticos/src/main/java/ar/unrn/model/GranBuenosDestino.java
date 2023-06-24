package ar.unrn.model;

public class GranBuenosDestino extends Destino {

	public GranBuenosDestino() {
		super("Gran Buenos Aires", 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double logisticaColectivoSur(double pesoDelPaquete) {
		Logistica logistica = new ColectivosSurLogistica();
		return logistica.costoEnvioAGranBuenosAires(pesoDelPaquete);
	}

	@Override
	public double logisticaCorreoArgentino(double distancia) {
		Logistica logistica = new CorreoArgentinoLogistica();
		return logistica.costoEnvioAGranBuenosAires(distancia);
	}

}
