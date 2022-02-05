package bucles.salidasAnticipadas;

public class Break {

	public static void main(String[] args) {
		int i = 1;
		while(i < 10) {
		   if( i == 5 ) {
			   break;
		   }
		   System.out.println("iteracion " + i);
		   i++;
		}
		
	}

}
