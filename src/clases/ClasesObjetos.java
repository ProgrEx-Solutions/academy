package clases;

public class ClasesObjetos {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("serpiente", 2, 0, "verde");
		System.out.println("características del primer animal: \n" + animal1.toString() + "\n");
		
		Animal animal2 = new Animal("gato", 5, 4, "gris");
		System.out.println("características del segundo animal: \n" + animal2.toString() + "\n");
		
		if(animal1.equals(animal2)) {
			System.out.println("Los dos animales son iguales\n");			
		} else {			
			System.out.println("Los dos animales son diferentes\n");			
		}

		System.out.println("El animal1 es de color: " + animal1.getColor() + "\n");
		System.out.println("El animal2 tiene " + animal2.getNumPatas() + " patas\n");
		
		animal2.setEdad(animal2.getEdad() + 1);
		System.out.println("El animal2 tiene " + animal2.getEdad() + " años\n");
		
	}

}
