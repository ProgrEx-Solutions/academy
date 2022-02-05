package funciones;

public class PotenciaCorrecto {

	public static void main(String[] args) {
		double x = 3;
		double y = 4;
		
		int exp = 2;

		double sum = potencia(x, exp) + potencia(y, exp);
		
		double hipotenusa = Math.sqrt(sum);
		System.out.print("La hipotenusa vale: " + hipotenusa);
	}
	
	private static double potencia(double base, int exp) {
		double prod = 1;
		for(int i = 0; i < exp; i++) {
			prod = prod * base;
		}
		return prod;
	}
}
