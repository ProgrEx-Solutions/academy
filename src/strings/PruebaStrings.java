package strings;

public class PruebaStrings {

	public static void main(String[] args) {
		
		//String como literal
		String str1 = "Hola";
		
		//String usando uno de sus constructores
		String str2 = new String("mundo");
		
		//String a partir de un array de caracteres
		char[] charArray = { 'J', 'a', 'v','a'};
		String str3 = new String(charArray);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("----------");
		
		String concat1 = str1 + " " + str2 + " " + str3; 
		System.out.println("usando el más: " + concat1);

		String concat2 = str1.concat(" ").concat(str2).concat(" ").concat(str3); 
		System.out.println("usando el concat: " + concat2);

		StringBuilder builder = new StringBuilder();
		builder.append(str1).append(" ").append(str2).append(" ").append(str3);
		String concat3 = builder.toString(); 
		System.out.println("usando el append: " + concat3);

		System.out.println("----------");
		
		String escape = "Mi frase empieza aqui:\nluego a nueva línea, " + 
						"\"texto entre comillas\" " +
						"y \\texto entre barras\\."; 
		System.out.println(escape);

		System.out.println("----------");
		
		String vacio = "";
		String nulo = null;
		String conTexto = "texto";
		
		System.out.println("El string vacio: " + vacio 
				+ ", y tiene longitud: " + vacio.length());
//		System.out.println("El string nulo: " + nulo 
//				+ ", y tiene longitud: " + nulo.length());
		System.out.println("El string conTexto: " + conTexto
				+ ", y tiene longitud: " + conTexto.length());

		System.out.println("----------");
		
		/*IBAN de España
		 * 2 - país
		 * 2 - código control
		 * 4 - código del banco
		 * 4 - código de la sucursal
		 * 2 - código control
		 * 10 - código cuenta
		*/
		String iban = "ES1236857492327394000381";
		String cuenta = iban.substring(14);
		String sucursal = iban.substring(8, 12);
		
		System.out.println("iban completo: " + iban);
		System.out.println("num cuenta: " + cuenta);
		System.out.println("sucursal: " + sucursal);

		System.out.println("----------");
		
		String nombreCompleto = "apellido1, apellido2, nombre";
		String[] split = nombreCompleto.split(",");
		System.out.println("el nombre es: " + split[2] + ", los apellidos son: " + split[0] + " " + split[1]);
		System.out.println("----------");
		
		// 0-2 -> código1 (CA, CO, CE)
		// 2-6 -> código2 (0010, 0011, 0012)
		// 6-8 -> código3 (RF, RC, RV)		
		String str4 = "CA0012RF";
		boolean startWithCA = str4.startsWith("CA");
		boolean endWithRC = str4.endsWith("RC");
		boolean contains0012 = str4.contains("0012");
		System.out.println("el código empieza por CA? " + startWithCA); 
		System.out.println("el código termina por RC? " + endWithRC);
		System.out.println("el código contiene la secuencia 0012? " + contains0012);
		
//		si quieres profundizar más, mirate las regex
		
		

	}

}
