package envoltorios.casting;

import envoltorios.Estudiante;
import envoltorios.Persona;

public class CastingIncorrecto {

	public static void main(String[] args) {
		//Casting impl�cito (incorrecto)
		Persona pers = new Persona("Jos�", 28);
		Estudiante est = pers; //ERROR de compilaci�n
		System.out.println("primera persona creada : " + pers.toString());

		//Casting expl�cito (incorrecto)
		Persona pers2 = new Persona("Mar�a", 25);
		Estudiante est2 = (Estudiante) pers2; //ERROR en fase de ejecuci�n
		System.out.println("primera persona creada : " + est2.toString());


	}

}
