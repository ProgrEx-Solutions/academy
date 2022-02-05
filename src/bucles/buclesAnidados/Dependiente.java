package bucles.buclesAnidados;

public class Dependiente {

	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
		   	System.out.println("iteración " + i + " bucle externo");

		   	int j = i;
		   	while(j > 0) {
		   		System.out.println("la variable j vale : " + j);
		   		j--;
		   	}
		   		 
		   	System.out.println("fin iteración " + i + " bucle externo\n");  		 
		}
	}

}
