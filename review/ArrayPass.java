package review;

import java.util.Scanner;

public class ArrayPass {
	static int sum(int x[]) {
		int hap = 0;
		for(int i = 0; i<x.length; i++)
			hap += x[i];
		return hap;
	}

	static int sum2(int x[][]) {
		int hap = 0;
		for(int i = 0; i<x.length; i++)
			for(int j = 0; j<x[0].length; j++)
				hap += x[i][j];
		return hap;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int array2[] = new int[3];
		int a[][] = {{1,2},{2,3},{3,4}};
		for(int i = 0; i<array.length; i++)
		{
			array[i] = sc.nextInt();
		}
		for(int i=0; i<array2.length; i++)
			array2[i]=sc.nextInt();
		System.out.println("배열의 합 = " + sum(array));
		System.out.println("배열의 합 = " + sum(array2));

		System.out.println("배열의 합 = " + sum2(a));
	}

}
