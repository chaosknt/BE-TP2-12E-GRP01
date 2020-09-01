package ar.edu.ort.tp2.ej02;

public class Mascota {
	private String nombre;
	private String tipoAnimal;
	
	public Mascota(String nombre, String tipo) 
	{
		this.nombre = nombre;
		tipoAnimal = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	@Override
	public String toString() {
		return "Mascota [tipoAnimal=" + tipoAnimal + ", Nombre=" + nombre + "]";
	}
	
	
	
}
