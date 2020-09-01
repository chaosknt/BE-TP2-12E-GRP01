package ar.edu.ort.tp2.ej02;

public class NumeroTelefonico {
	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private Linea tipoLinea;
	
	public NumeroTelefonico() 
	{
		caracteristica = 0;
		numeroDeAbonado = 0;
		codigoDePais = 0;
		tipoLinea = null;
	}
	
	public NumeroTelefonico(int caracteristica, int numeroDeAbonado, int codigoPais, Linea tipoLinea) 
	{
		this.caracteristica = caracteristica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.codigoDePais = codigoPais;
		this.tipoLinea = tipoLinea;
	}
	
	public String getValor() 
	{		
		return tipoLinea+ ": (+"+ codigoDePais + ") " + caracteristica + "-"+ numeroDeAbonado;
	}
		

	@Override
	public String toString() {
		return getValor();
	}

	public int getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(int caracteristica) {
		this.caracteristica = caracteristica;
	}

	public int getNumeroDeAbonado() {
		return numeroDeAbonado;
	}

	public void setNumeroDeAbonado(int numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}

	public int getCodigoDePais() {
		return codigoDePais;
	}

	public void setCodigoDePais(int codigoDePais) {
		this.codigoDePais = codigoDePais;
	}

	public Linea getTipoLinea() {
		return tipoLinea;
	}

	public void setTipoLinea(Linea tipoLinea) {
		this.tipoLinea = tipoLinea;
	}
	
}
