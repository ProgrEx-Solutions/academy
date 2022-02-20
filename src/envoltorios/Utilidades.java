package envoltorios;

import java.util.Comparator;

public class Utilidades {

	public static <T> void visualiza(T[] o) {
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i].toString());
		}
	}
	
	public static <T extends Comparable<T>> T[] ordena(T[] o) {
		boolean ordenada = false;
		T aux = null;
		while(!ordenada) {			
			ordenada = true;
			for (int i = 0; i < o.length-1; i++) {
				if(o[i].compareTo(o[i+1]) < 0) {
					ordenada = false;
					aux = o[i+1];
					o[i+1] = o[i];
					o[i] = aux;
				}
			}
		}
		return o;
	}

	public static <T> T[] ordena(T[] o, Comparator<? super T> c) {
		boolean ordenada = false;
		T aux = null;
		while(!ordenada) {			
			ordenada = true;
			for (int i = 0; i < o.length-1; i++) {
				if(c.compare(o[i], o[i+1]) < 0) {
					ordenada = false;
					aux = o[i+1];
					o[i+1] = o[i];
					o[i] = aux;
				}
			}
		}
		return o;
	}
}
