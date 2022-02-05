package depuracion;

public class DepuradorSuma {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		int suma = sumar(a, b);
		
		System.out.println(suma);

	}
	
	public static int sumar(int a, int b) {
		return a / b;
	}

}
