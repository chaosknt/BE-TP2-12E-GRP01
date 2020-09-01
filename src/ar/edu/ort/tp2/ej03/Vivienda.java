package ar.edu.ort.tp2.ej03;

import java.util.ArrayList;

public class Vivienda {	
	
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda(String calle, String altura, String piso, String dpto)
	{
		direccion = new Direccion(calle, altura, piso, dpto);
		personas = new ArrayList<Persona>();
		muebles = new ArrayList<Mueble>();
	}
	
	public void agregarPersona(String nombre, String apellido, String edad) 
	{
		personas.add(new Persona(nombre, apellido, edad));
	}
	
	public void agregarMueble(String nombre, String material, Color color)
	{
		muebles.add(new Mueble(nombre,material,color));
	}
	
	private <T> T buscar(String variable, ArrayList<T> lista)
	{		
		T retorno = null;	
		int i = 0;
		while(i < lista.size() && !lista.get(i).toString().equals(variable)) 
		{
			i++;
		}
		
		if(i < lista.size())
		{
			retorno = lista.get(i);
		}		
		return retorno;
	}
	
	public boolean eliminarPersona(String nombre) 
	{
		boolean retorno = false;
		Persona eliminar = buscar(nombre, personas);
		if(eliminar != null)
		{
			personas.remove(eliminar);
			retorno = true;
		}		
		return retorno;
	}
	
	public boolean eliminarMueble(String mueble)
	{
		boolean retorno = false;
		Mueble eliminar = buscar(mueble, muebles);
		if(eliminar != null)
		{
			muebles.remove(eliminar);
			retorno = true;
		}		
		return retorno;
	}
	
	public void mostrarTodo() 
	{
		String mensgPersona = "No hay personas";
		String msngMuebles = "No hay muebles";
		System.out.println(direccion);
		if(personas.size() > 0) 
		{
			System.out.println("Personas:");
			for(Persona p: personas)
			{
				p.getDatos();
			}
		}else
		{
			System.out.println(mensgPersona);
		}
		System.out.println("");
		if(muebles.size() > 0)
		{	
			System.out.println("Muebles:");
			for(Mueble m: muebles) 
			{
				m.getMueble();
			}
		}else 
		{
			System.out.println(msngMuebles);
		}		
		
	}
}
