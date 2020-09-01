package ar.edu.ort.tp2.ej01;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numerosTelefonicos;
	private ArrayList<Email> emails;
	
	public Persona(String nombre, String apellido)// esto es composicion porque es obligatorio
	{
		this.nombre = nombre;
		this.apellido = apellido;
		numerosTelefonicos = new ArrayList<NumeroTelefonico>();		
		emails = new ArrayList<Email>();		
	}	
	
	public Persona(String nombre, String apellido, int caracteristica, int numeroDeAbonado, int codigoDePais, Linea linea, String correo)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		numerosTelefonicos = new ArrayList<NumeroTelefonico>();
		numerosTelefonicos.add(new NumeroTelefonico(caracteristica, numeroDeAbonado, codigoDePais, linea));
		emails = new ArrayList<Email>();
		emails.add(new Email(correo));		
	}
	
	public void agregarTelefono(int caracteristica, int numeroDeAbonado, int codigoDePais, Linea linea) //esto es agregacion porque no es obligatorio
	{		
		numerosTelefonicos.add(new NumeroTelefonico(caracteristica, numeroDeAbonado, codigoDePais, linea));
		
	}
	
	public void agregarEmail(String correo)
	{
		emails.add(new Email(correo));
	}
	
	public void mostrarTodo() 
	{
		String general = "No se han dado de alta ";
		String msgTel = "Numeros telefonicos ";
		String msgEmail = "Emails";
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
