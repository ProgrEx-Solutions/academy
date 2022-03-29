package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PruebaDate {

	public static void main(String[] args) throws ParseException {		
		System.out.println("\t\t\t++++++++++++ Crear fechas ++++++++++++");
		
		//fecha y hora corriente
		Date now = new Date();
		System.out.println("La fecha y hora corriente es:\t\t\t\t" + now);
		
		//calculo de milisegundos
		long millisecInADay = 24 * 60 * 60 * 1000;
		long epochYears = 52 * 365 * millisecInADay;
		long epochMonths = 2 * 30 * millisecInADay;
		
		//fecha a partir del 1 de enero de 1970 + milisegundos
		Date d2 = new Date(epochYears + epochMonths);
		System.out.println("La fecha y hora creada a partir de un long es:\t\t" + d2);
		
		//fecha personalizada a través de un String
		String stringDate = "25/06/2022";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d3 = null;
		try {
			d3 = sdf.parse(stringDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("La fecha y hora creada a partir de un String es:\t" + d3);
		
		System.out.println("\n\t\t\t++++++++++++ Cambiar formato ++++++++++++");
		//cambio de formato
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String f1 = sdf1.format(now);
		System.out.println("La fecha corriente en formato \"dd/MM/yyyy\":\t\t" + f1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String f2 = sdf2.format(d2);
		System.out.println("La fecha 2 en formato \"yyyy-MM-dd HH:mm:ss\":\t\t" + f2);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSSZ");
		String f3 = sdf3.format(d3);
		System.out.println("La fecha 3 en formato UTC :\t\t\t\t" + f3);
		
		System.out.println("\n\t\t\t++++++++++++ Comparación ++++++++++++");
		//Comparación entre fechas
		boolean isD2Future = d2.after(now);
		boolean isD2Past = d2.before(now);
		boolean isD2EqualsD3 = d2.equals(d3);
		System.out.println("La fecha d2 es una fecha futura?:\t\t\t" + isD2Future);
		System.out.println("La fecha d2 es una fecha pasada?:\t\t\t" + isD2Past);
		System.out.println("La fecha d2 es igual a la fecha 3?:\t\t\t" + isD2EqualsD3);
		
		System.out.println("\n\t\t\t++++++++++++ Calendar ++++++++++++");
		//Uso del calendar
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar sin fecha: " + c);
		
		String stringStartDate = "31/12/2021 15:32:25";
		SimpleDateFormat sdfc = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date startDate = sdfc.parse(stringStartDate);
		
		c.setTime(startDate);
		c.add(Calendar.DAY_OF_MONTH, 1);
		Date endDate = c.getTime();
		String stringEndDate = sdfc.format(endDate);
		System.out.println("La fecha final es :\t\t\t\t\t" + stringEndDate);
		
		
		
		
		
	}
}
