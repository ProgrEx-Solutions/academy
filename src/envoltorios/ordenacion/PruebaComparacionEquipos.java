package envoltorios.ordenacion;

import java.util.Comparator;

import envoltorios.Equipo;
import envoltorios.ordenacion.comparators.DiferenciaGolesComparator;
import envoltorios.ordenacion.comparators.EquipoComparatorUtils;
import envoltorios.ordenacion.comparators.GolesContraComparator;
import envoltorios.ordenacion.comparators.GolesMarcadosComparator;
import envoltorios.ordenacion.comparators.PuntosComparator;

public class PruebaComparacionEquipos {

	public static void main(String[] args) {
		
		Equipo e1 = new Equipo("Equipo1", 15, 10, 5);
		Equipo e2 = new Equipo("Equipo2", 13, 9, 6);
		Equipo e3 = new Equipo("Equipo3", 17, 11, 7);
		Equipo e4 = new Equipo("Equipo4", 10, 14, 4);
		Equipo e5 = new Equipo("Equipo5", 14, 7, 3);
		
		Equipo[] liga = {e1, e2, e3, e4, e5};
		System.out.println("Liga sin ordenar:");
		visualiza(liga);
		
		System.out.println("-------");
		System.out.println("Liga ordenada por puntos descendientes:");
		Equipo[] ligaOrdPuntos =  ordena(liga, EquipoComparatorUtils.PUNTOS, EquipoComparatorUtils.ORDENA_DESC);
		visualiza(ligaOrdPuntos);

		System.out.println("-------");
		System.out.println("Liga ordenada por goles marcados descendientes:");
		Equipo[] ligaOrdGolesMarcados =  ordena(liga, EquipoComparatorUtils.GOLES_MARCADOS, EquipoComparatorUtils.ORDENA_DESC);
		visualiza(ligaOrdGolesMarcados);
		
		System.out.println("-------");
		System.out.println("Liga ordenada por goles en contra ascendientes:");
		Equipo[] ligaOrdGolesContra =  ordena(liga, EquipoComparatorUtils.GOLES_EN_CONTRA, EquipoComparatorUtils.ORDENA_ASC);
		visualiza(ligaOrdGolesContra);
		
		System.out.println("-------");
		System.out.println("Liga ordenada por diferencia goles descendientes:");
		Equipo[] ligaOrdDiffGoles =  ordena(liga, EquipoComparatorUtils.DIFERENCIA_GOLES, EquipoComparatorUtils.ORDENA_DESC);
		visualiza(ligaOrdDiffGoles);

	}
	
	private static void visualiza(Equipo[] e) {
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].toString());
		}
	}
	
	private static Equipo[] ordena(Equipo[] e, String criterio, String order) {
		
		Comparator<Equipo> c = selectComparator(criterio);
		
		boolean ordenada = false;

		if(order.equals(EquipoComparatorUtils.ORDENA_ASC)) {				
			ordenaAsc(e, c, ordenada);
		} else {			
			ordenaDesc(e, c, ordenada);
		}
		return e;
	}

	private static Comparator<Equipo> selectComparator(String criterio) {
		Comparator<Equipo> c = new PuntosComparator();
		
		if(criterio.equals(EquipoComparatorUtils.GOLES_MARCADOS)) {
			c = new GolesMarcadosComparator();			
		} else if(criterio.equals(EquipoComparatorUtils.GOLES_EN_CONTRA)) {
			c = new GolesContraComparator();						
		} else if(criterio.equals(EquipoComparatorUtils.DIFERENCIA_GOLES)) {
			c = new DiferenciaGolesComparator();									
		}
		return c;
	}

	private static void ordenaAsc(Equipo[] e, Comparator<Equipo> c, boolean ordenada) {
		Equipo aux;
		while(!ordenada) {			
			ordenada = true;
				for (int i = 0; i < e.length-1; i++) {
					if(c.compare(e[i], e[i+1]) > 0) {
						ordenada = false;
						aux = e[i+1];
						e[i+1] = e[i];
						e[i] = aux;
					}
				}
		}
	}

	private static void ordenaDesc(Equipo[] e, Comparator<Equipo> c, boolean ordenada) {
		Equipo aux;
		while(!ordenada) {			
			ordenada = true;
			for (int i = 0; i < e.length-1; i++) {
				if(c.compare(e[i], e[i+1]) < 0) {
					ordenada = false;
					aux = e[i+1];
					e[i+1] = e[i];
					e[i] = aux;
				}
			}
		}
	}

}
