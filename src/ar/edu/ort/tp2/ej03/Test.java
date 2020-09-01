package ar.edu.ort.tp2.ej03;

public class Test {

	public static void main(String[] args) {
		
		Vivienda ob1 = new Vivienda("Libertador", "1987", "4", "B");
		
		
		
		ob1.agregarMueble("mesa", "madera", Color.MARRON);
		ob1.agregarPersona("Mariano", "Pagani", "4");
		ob1.agregarPersona("Diego", "Maradona", "65");
		ob1.mostrarTodo();
		
		System.out.println(ob1.eliminarPersona("Diego"));
		
		ob1.mostrarTodo();

	}

}
