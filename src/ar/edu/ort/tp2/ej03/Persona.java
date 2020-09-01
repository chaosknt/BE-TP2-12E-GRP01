package ar.edu.ort.tp2.ej03;

public class Persona {
	private String nombre;
	private String apellido;
	private String edad;
	
	public Persona(String nombre, String apellido, String edad)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
	public void getDatos() 
	{
		System.out.print("Nombre: " + nombre + " "+ apellido + " Edad: " + edad + " ");
	}
	
	
	
}
