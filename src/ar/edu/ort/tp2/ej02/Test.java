package ar.edu.ort.tp2.ej02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Persona ob1 = new Persona("Mariano", "Pagani", 11, 35889858, 54, Linea.CELULAR, "mariano@oxxon-cd.com","mishu", "gato" );
			
			
			
			ob1.agregarTelefono(11, 78458758, 54, Linea.FIJO);
			
			ob1.mostrarTodo();
			
			System.out.println("----------------------------");
			
			Persona ob2 = new Persona("Diego", "Maradona",22, 58774587, 325, Linea.FIJO, "Diego@dios.com", "dogui", "perro");
			
			ob2.mostrarTodo();
			
			System.out.println("----------------------------");
			
			Persona ob3 = new Persona("Zinedine", "Zidane");
			
			ob3.mostrarTodo();
			
			System.out.println(ob1.borrarMascota("mishu"));
			ob1.mostrarTodo();
			
			ob1.agregarMascota("firulais", "T-Rex");
			
			ob1.mostrarTodo();
	}

}
