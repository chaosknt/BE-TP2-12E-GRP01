package ar.edu.ort.tp2.ej02;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numerosTelefonicos;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	
	public Persona(String nombre, String apellido)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		numerosTelefonicos = new ArrayList<NumeroTelefonico>();		
		emails = new ArrayList<Email>();	
		mascotas = new ArrayList<Mascota>();
	}	
	
	public Persona(String nombre, String apellido, int caracteristica, int numeroDeAbonado, int codigoDePais, Linea linea, String correo, String nombreMascota, String tipoMascota)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		numerosTelefonicos = new ArrayList<NumeroTelefonico>();
		numerosTelefonicos.add(new NumeroTelefonico(caracteristica, numeroDeAbonado, codigoDePais, linea));
		emails = new ArrayList<Email>();
		emails.add(new Email(correo));	
		mascotas = new ArrayList<Mascota>();
		mascotas.add(new Mascota(nombreMascota, tipoMascota));
	}
	
	public void agregarTelefono(int caracteristica, int numeroDeAbonado, int codigoDePais, Linea linea) 
	{		
		numerosTelefonicos.add(new NumeroTelefonico(caracteristica, numeroDeAbonado, codigoDePais, linea));
		
	}
	
	public void agregarEmail(String correo)
	{
		emails.add(new Email(correo));
	}
			
	public void agregarMascota(String nombre, String tipo) 
	{
		mascotas.add(new Mascota(nombre, tipo));
	}
	
	public boolean borrarTelefono(int numero) 
	{
		boolean retorno = false;
		int i = 0;
		while(i < numerosTelefonicos.size() && numerosTelefonicos.get(i).getNumeroDeAbonado() != numero) 
		{
			i++;
		}
		
		if(i < numerosTelefonicos.size()) {
			numerosTelefonicos.remove(i);
			retorno = true;
		}
		return retorno;		
	}
	
	public boolean borrarEmail(String correo) 
	{
		boolean retorno = false;
		int i = 0;
		while(i < emails.size() && !emails.get(i).getValor().equals(correo)) 
		{
			i++;
		}
		
		if(i < emails.size()) {
			emails.remove(i);
			retorno = true;
		}
		return retorno;	
	}
	
	public boolean borrarMascota(String nombre) 
	{
		boolean retorno = false;
		int i = 0;
		while(i < mascotas.size() && !mascotas.get(i).getNombre().equals(nombre)) 
		{
			i++;
		}
		
		if(i < mascotas.size()) {
			mascotas.remove(i);
			retorno = true;
		}
		return retorno;	
	}	
	
	public void mostrarTodo() 
	{
		String general = "No se han dado de alta ";
		String msgTel = "Numeros telefonicos ";
		String msgEmail = "Emails";
		String msgMasc = "Mascotas";
		System.out.println("[Nombre: " + nombre + " Apellido: " + apellido +"]");
		System.out.println("");
						
		if(numerosTelefonicos.size() > 0)
		{
			recorrer(numerosTelefonicos,msgTel);
		}else 
		{
			System.out.println(general + msgTel);
		}
		
		if(emails.size() > 0) 
		{
			recorrer(emails, msgEmail);
		}else
		{
			System.out.println(general + msgEmail);
		}
		
		if(mascotas.size() > 0 ) 
		{
			recorrer(mascotas, msgMasc);
		}else 
		{
			System.out.println(general + msgMasc);
		}
	}
	
	public <T> void recorrer(ArrayList<T> lista, String titulo)
	{
		System.out.println(titulo);
		for(T t: lista) 
		{
			System.out.println(t.toString());
		}
	}
	
		
	
	
	
}
