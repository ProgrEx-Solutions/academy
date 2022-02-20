package envoltorios.casting;

import envoltorios.Estudiante;
import envoltorios.Persona;

public class CastingCorrecto {

	public static void main(String[] args) {
		//Casting implícito (correcto)
		Estudiante est = new Estudiante(new Persona("José", 28), "1234", 8.5);
		Persona pers = est;
		System.out.println("primera persona creada : " + pers.toString());

		//Casting explícito (correcto)
		Persona pers2 = new Estudiante(new Persona("María", 25), "5678", 9.0);
		Estudiante est2 = (Estudiante) pers2;
		System.out.println("segunda persona creada : " + est2.toString());

	}
}
