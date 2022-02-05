package envoltorios.ordenacion;

import envoltorios.Estudiante;
import envoltorios.Persona;

public class PruebaComparacion {

	public static void main(String[] args) {
		Estudiante est1 = new Estudiante(new Persona("Pilar", 21), "123", 8.0);
		Estudiante est2 = new Estudiante(new Persona("José", 20), "123", 8.2);
		Estudiante est3 = new Estudiante(new Persona("María", 19), "123", 9.0);
		Estudiante est4 = new Estudiante(new Persona("Enrique", 20), "123", 7.5);
		Estudiante est5 = new Estudiante(new Persona("Nora", 18), "123", 8.6);
		
		Estudiante[] clase = {est1, est2, est3, est4, est5};
		visualizaClase(clase);
		
		System.out.println("-------");
		
		Estudiante[] claseOrd = ordenaClase(clase);
		visualizaClase(claseOrd);

	}
	
	private static Estudiante[] ordenaClase(Estudiante[] c) {
		boolean ordenada = false;
		Estudiante aux = null;
		while(!ordenada) {			
			ordenada = true;
			for (int i = 0; i < c.length-1; i++) {
				if(c[i].compareTo(c[i+1]) < 0) {
					ordenada = false;
					aux = c[i+1];
					c[i+1] = c[i];
					c[i] = aux;
				}
			}
		}
		return c;
	}
	
	private static void visualizaClase(Estudiante[] es) {
		for (int i = 0; i < es.length; i++) {
			System.out.println(es[i].getNombre() + ": " + es[i].getNotaMedia());
		}
	}

}
