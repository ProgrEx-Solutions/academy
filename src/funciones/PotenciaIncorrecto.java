package funciones;

public class PotenciaIncorrecto {

	public static void main(String[] args) {
		double x = 3;
		double y = 4;
		
		int exp = 2;
		
		double prodX = 1;
		for(int i = 0; i < exp; i++) {
			prodX = prodX * x;
		}
		
		double prodY = 1;
		for(int i = 0; i < exp; i++) {
			prodY = prodY * y;
		}
		
		double sum = prodX + prodY;
		
		double hipotenusa = Math.sqrt(sum);
		System.out.print("La hipotenusa vale: " + hipotenusa);
	}
}
