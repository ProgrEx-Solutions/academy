package herencia;

public class PruebaHerencia {
	
	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan", 25);
		System.out.println(persona1.toString());
		
		Persona persona2 = new Persona("Pilar", 28);
		System.out.println(persona2.toString());
		
		Empleado emp1 = new Empleado(persona2, "cod1", 2000);
		System.out.println(emp1.toString());
		
		Empleado emp2 = new Empleado(persona1, "cod2", 1500);
		System.out.println(emp2.toString());
		
		System.out.println("emp1 == emp2 ? : "+ emp1.equals(emp2));
		
		Empleado emp3 = new Empleado("enrique", 19, "cod2", 1500);
		System.out.println(emp3.toString());
		
		System.out.println("emp2 == emp3 ? : "+ emp2.equals(emp3));
		
	}
}
