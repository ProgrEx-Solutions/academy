package envoltorios.ordenacion;

import envoltorios.Estudiante;
import envoltorios.Persona;

public class PruebaComparacionEstudiante {

	public static void main(String[] args) {
		Estudiante est1 = new Estudiante(new Persona("Pilar", 21), "123", 8.0);
		Estudiante est2 = new Estudiante(new Persona("José", 20), "123", 8.2);
		Estudiante est3 = new Estudiante(new Persona("María", 19), "123", 9.0);
		Estudiante est4 = new Estudiante(new Persona("Enrique", 20), "123", 7.5);
		Estudiante est5 = new Estudiante(new Persona("Nora", 18), "123", 8.6);
		
		Estudiante[] clase = {est1, est2, est3, est4, est5};
		System.out.println("Clase sin ordenar:");
		visualiza(clase);
		
		System.out.println("-------");
		System.out.println("Clase ordenada por nota media:");
		Estudiante[] claseOrd = ordena(clase);
		visualiza(claseOrd);

	}
	
	private static void visualiza(Estudiante[] e) {
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].toString());
		}
	}
	
	private static Estudiante[] ordena(Estudiante[] e) {
		boolean ordenada = false;
		Estudiante aux = null;
		while(!ordenada) {			
			ordenada = true;
			for (int i = 0; i < e.length-1; i++) {
				if(e[i].compareTo(e[i+1]) < 0) {
					ordenada = false;
					aux = e[i+1];
					e[i+1] = e[i];
					e[i] = aux;
				}
			}
		}
		return e;
	}

}
