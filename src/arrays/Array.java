package arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] arr = new int[10];

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		arr[0] = 2;
		
		int longitud = arr.length;
		
		arr[longitud - 1] = 3;
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
