package ar.edu.ort.tp2.ej04;

import java.util.ArrayList;

public class Mudanza {
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Mudanza(ArrayList<Persona> p, ArrayList<Mueble> m) 
	{
		personas = p;
		muebles = m;
	}
	
	public ArrayList<Persona> getpersonas()
	{
		return personas;
	}
	
	public ArrayList<Mueble> getMuebles()
	{
		return muebles;
	}
}
