package envoltorios.casting;

import envoltorios.Estudiante;
import envoltorios.Persona;

public class CastingIncorrecto {

	public static void main(String[] args) {
		//Casting implícito (incorrecto)
		Persona pers = new Persona("José", 28);
		Estudiante est = pers; //ERROR de compilación
		System.out.println("primera persona creada : " + pers.toString());

		//Casting explícito (incorrecto)
		Persona pers2 = new Persona("María", 25);
		Estudiante est2 = (Estudiante) pers2; //ERROR en fase de ejecución
		System.out.println("primera persona creada : " + est2.toString());


	}

}
