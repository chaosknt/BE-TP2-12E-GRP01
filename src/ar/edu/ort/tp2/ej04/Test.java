package ar.edu.ort.tp2.ej04;

public class Test {

	public static void main(String[] args) {
		
		Edificio ob1 = new Edificio("Libertador", "2000");
		
		ob1.agregarVivienda("pb", "A");
		ob1.agregarVivienda("pb", "A");
		
		ob1.agregarPersona("aasdsad", "a", "aa", "dd", "as");
		
		ob1.agregarPersona("pb", "A", "Mariano", "Pagani", "31");
		ob1.mostrarViviendas();
		
		
		//AGREGAR DEPARTAMENTE SINO EXISTE LO CREA SINO DEVUELVE ERROR
		//AGREGAR PERSONA BUSCA EL DPTARTAMENTO AL CUAL SE TIENE QUE AGREGAR, SINO EXISTE DEVUELVE ERROR
		
		//FALTA PROBAR AGREAR MUEBLE
		// Y HACER MUDANZA
		
		//System.out.println(ob1.getDireccion().toString());
		//ob1.mostrarViviendas();

	}

}
