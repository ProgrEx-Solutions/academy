package envoltorios.ejemposdeuso;

public class UsoEnvoltorios {

	public static void main(String[] args) {
		
		int entero1 = 0;
		Integer objEntero1 = new Integer(entero1);
		System.out.println("primer objeto entero: " + objEntero1.toString());
		
		Integer objEntero2 = new Integer("1");
		System.out.println("segundo objeto entero: " + objEntero2.toString());

		Integer objEntero3 = Integer.parseInt("-3");
		System.out.println("tercer objeto entero: " + objEntero3.toString());
		
		//calculo del máximo
		Integer[] arrayInts = {objEntero1, objEntero2, objEntero3, 9, -5, 8, -7, 25, -60};
		visualizaArray(arrayInts);
		
		Integer[] maxInfo = maxValueMaxPos(arrayInts);
		System.out.println("el máximo es " + maxInfo[0].toString() 
				+ " y su posición es " + maxInfo[1].toString());
		
		//conversion en hexadecimal
		String[] hexArray = convertToHex(arrayInts);
		visualizaArray(hexArray);
		
	}

	
	public static Integer[] maxValueMaxPos(Integer[] ints) {
		Integer max = Integer.MIN_VALUE;
		Integer maxPos = -1;
		
		for(int i = 0; i < ints.length; i++) {
			if(ints[i] > max) {
				max = ints[i];
				maxPos = i;
			}
		}
		
		Integer[] outputs = {max, maxPos};
		
		return outputs; 
	}
	
	public static String[] convertToHex(Integer[] ints) {
		String[] outputs = new String[ints.length];
		
		for(int i = 0; i < ints.length; i++) {
			outputs[i] = leftPadded(Integer.toHexString(ints[i]));
		}
		
		return outputs; 
	}

	private static void visualizaArray(Object[] hexArray) {
		String comma = ", ";
		System.out.print("[");
		for (int i = 0; i < hexArray.length; i++) {
			if(i == hexArray.length - 1) {
				comma = "";
			}
			System.out.print(hexArray[i].toString() + comma);
		}
		System.out.println("]");
	}
	
	private static String leftPadded(String value) {
		String paddedValue = value;
		
		while(paddedValue.length() < 8) {
			paddedValue = "0" + paddedValue;
		}
		
		return paddedValue;
	}
}
