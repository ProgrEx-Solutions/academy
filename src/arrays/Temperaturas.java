package arrays;

public class Temperaturas {

	public static void main(String[] args) {
		
		double[] temperaturas = {15.4, 16.5, 17.9, 15.8, 18.1, 17.7, 16.6};
		
		temperaturaMedia(temperaturas);
		
		temperaturaMaxima(temperaturas);

	}
	
	private static void temperaturaMedia(double[] temperaturas) {
		double suma = 0;
		double media = 0;
		
		for(int i = 0; i < temperaturas.length; i++) {
			suma += temperaturas[i];
		}
		
		media = suma / temperaturas.length;
		media = Math.round(media * 100.0)/100.0;
		
		System.out.println("la temperatura media de esta semana es: " + media);
	}

	private static void temperaturaMaxima(double[] temperaturas) {
		double max = Double.MIN_VALUE;
		
		for(int i = 0; i < temperaturas.length; i++) {
			if(temperaturas[i] > max) {
				max = temperaturas[i];
			}
		}
		
		System.out.println("la temperatura máxima de esta semana ha sido: " + max);
	}

}
