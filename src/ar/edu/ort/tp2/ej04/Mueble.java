package ar.edu.ort.tp2.ej04;

public class Mueble {
	private String nombre;
	private String material;
	private Color color;
	
	public Mueble(String nombre, String material, Color color)
	{
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	public void getMueble() 
	{
		System.out.println(nombre + " de "+ material + " Color: " + color);
	}
	
	
}
