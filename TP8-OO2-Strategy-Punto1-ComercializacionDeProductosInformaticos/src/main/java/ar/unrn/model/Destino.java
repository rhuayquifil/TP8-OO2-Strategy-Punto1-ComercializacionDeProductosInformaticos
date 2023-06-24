package ar.unrn.model;

public abstract class Destino {

//	protected double precioFijo;
	private String nombre;
	private int codigoPostal;

	public Destino(String nombre, int codigoPostal) {
		super();
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoPostal;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destino other = (Destino) obj;
		if (codigoPostal != other.codigoPostal)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public abstract double logisticaColectivoSur(double pesoDelPaquete);

	public abstract double logisticaCorreoArgentino(double distancia);
}
