package ar.edu.ort.tp2.ej04;

import java.util.ArrayList;

public class Edificio {
	private Direccion direccion;
	private ArrayList<Vivienda> edificio;
	
	public Edificio(String calle, String altura)
	{
		direccion = new Direccion(calle, altura);
		edificio = new ArrayList<Vivienda>();
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public void agregarVivienda(String piso, String dpto) 
	{
		if(buscarDestino(piso,dpto) == null) 
		{
			edificio.add(new Vivienda(piso, dpto));
			System.out.println("Se ha dado de alta la vivienda");
		}else {
			System.out.println("La vivienda ya existe");
		}
		
	}
	
	public void mostrarViviendas() 
	{
		if(edificio.size() > 0) 
		{
			for(Vivienda e: edificio)
			{
				e.mostrarTodo();
				System.out.println("-----------");
			}
		}else 
		{
			System.out.println("No se han dado de alta viviendas");
		}
		
	}
	
	public void agregarPersona(String piso, String dpto, String nombre, String apellido, String edad) 
	{
		Vivienda casa = buscarDestino(piso, dpto);
		if(casa != null)
		{
			casa.agregarPersona(nombre, apellido, edad);
			System.out.println("Se agrego la persona");
		}else
		{
			System.out.println("No se encontro el dpto");
		}
	}
	
	public void agregarMueble(String piso, String dpto, String nombre, String material, Color color) 
	{
		Vivienda casa = buscarDestino(piso, dpto);
		
		if(casa != null)
		{
			casa.agregarMueble(nombre, material, color);
			System.out.println("Se agrego el mueble");
		}else
		{
			System.out.println("No se encontro el dpto");
		}
	}
	
	public boolean realizarMudanza(String oPiso, String oDpto, String dPiso, String dDpto) 
	{
		boolean retorno = false;
		Mudanza origen = buscarOrigen(oPiso, oDpto);
		Vivienda destino = buscarDestino(dPiso, dDpto);
		
		//System.out.println(origen);
		//System.out.println(destino);
		if(origen == null || destino == null) 
		{
			System.out.println("No se realizo la mudanza");
			
		}else 
		{
			System.out.println(origen);
			//retorno = true;
			//destino.agregarMudanza(origen.getpersonas(), origen.getMuebles());
			System.out.println("Se realizo la mudanza");
		}
		
		return retorno;
	}
	
	private Mudanza buscarOrigen(String piso, String dpto) 
	{
		Mudanza retorno = null;
		int indice = 0;
		while(indice < edificio.size() && !edificio.get(indice).getPisoYAltura().getPiso().equals(piso) 
									   && !edificio.get(indice).getPisoYAltura().getDpto().equals(dpto)) 
		{
			indice++;
		}
		
		if(indice < edificio.size())
		{
			retorno = edificio.get(indice).mudar();
		}
		return retorno;
	}
	
	public Vivienda buscarDestino(String piso, String dpto) 
	{
		Vivienda retorno = null;
		int indice = 0;
		while(indice < edificio.size() && !edificio.get(indice).getPisoYAltura().getPiso().equals(piso) 
									   && !edificio.get(indice).getPisoYAltura().getDpto().equals(dpto)) 
		{
			indice++;
		}
		
		if(indice < edificio.size()) 
		{
			retorno = edificio.get(indice);
		}
		return retorno;
	}
	
	
}
