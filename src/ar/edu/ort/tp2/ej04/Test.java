package ar.edu.ort.tp2.ej04;

public class Test {

	public static void main(String[] args) {
		
		Edificio ob1 = new Edificio("Libertador", "2000");
		
		ob1.agregarVivienda("pb", "A");
		ob1.agregarVivienda("pb", "A");
		ob1.agregarVivienda("1", "C");		
		
		ob1.agregarPersona("pb", "A", "Sofia", "Pagani", "31");
		ob1.agregarPersona("pb", "A", "Patricio", "Pagani", "31");
		ob1.agregarPersona("pb", "A", "Mariano", "Pagani", "31");
		
		ob1.agregarMueble("pb", "A", "Mesa", "madera", Color.BLANCO);
		ob1.agregarMueble("pb", "A", "Cama", "madera", Color.BLANCO);
		ob1.agregarMueble("pb", "A", "Silla", "madera", Color.BLANCO);
		ob1.mostrarViviendas();		
		
		ob1.realizarMudanza("pb", "A", "1", "C");
		
		ob1.mostrarViviendas();
		

	}

}
