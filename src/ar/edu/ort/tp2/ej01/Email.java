package ar.edu.ort.tp2.ej01;
	
public class Email {
	private final String SEPARADOR = "@";
	
	private String cuenta;
	private String dominio;
	
	public Email(String correoElectronico)
	{
		String[] parts = correoElectronico.split(SEPARADOR);
		cuenta = parts[0];
		dominio = parts[1];
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
	public String getValor() 
	{
		return cuenta+SEPARADOR+dominio;
	}

	@Override
	public String toString() {
		return getValor();
	}
	
}
