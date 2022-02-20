package envoltorios.ordenacion.comparators;

import java.util.Comparator;

import envoltorios.Equipo;

public class GolesContraComparator implements Comparator<Equipo>{
	
	@Override
	public int compare(Equipo o1, Equipo o2) {
		if(o1.getGolesEnContra() < o2.getGolesEnContra()) {
			return -1;
		} else if(o1.getGolesEnContra() > o2.getGolesEnContra()) {
			return 1;
		} else {			
			return 0;
		}
	}
}
