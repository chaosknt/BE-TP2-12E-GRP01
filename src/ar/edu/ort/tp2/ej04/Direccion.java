package ar.edu.ort.tp2.ej04;

public class Direccion {
	private String calle;
	private String altura;
	
	
	public Direccion(String calle, String altura) 
	{
		this.calle = calle;
		this.altura = altura;
		
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}
		
	
	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Direccion " + calle + " " + altura;
				
	}

	
	
	
}
