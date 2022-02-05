package bucles.buclesFor;

public class ScopeError {
	public static void main(String[] args) {
		int i = 0;
		
		for(; i < 4; i++) {
		   System.out.println("iteración " + i);
		   
		   i = i+i;
		   i = i*2;
		}
		
		System.out.println("valor final de i : " + i);
	}
}
