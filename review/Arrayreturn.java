package review;

public class Arrayreturn {
	
	static int[] makearray() {
		int temp[] = new int[4];
		for(int i = 0; i<temp.length; i++)
		{
			temp[i] = i;
		}
		return temp;
	}
	static int[] makearray2(int n) {
		int temp[] = new int[n];
		for(int i = 0; i<temp.length; i++)
		{
			temp[i] = i; 
		}
		return temp;
	}
	public static void main(String[] args) {
		int array[], a[],b[];
		array = makearray();
		a= makearray2(7);
		b=makearray2(3);
		
		for(int i : array) {
			System.out.print(i+ " ");
		}

		for(int i : a) {
			System.out.print(i+ " ");
		}
		for(int i : b) {
			System.out.print(i+ " ");
		}
	}

}
