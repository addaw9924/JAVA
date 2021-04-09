package review;

import java.util.Scanner;

public class arrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 500;
		int sum = 0;
		double avg;
		
		int array[] = new int[5];
		
		for(int i=0; i<array.length; i++)
		{
			array[i] = sc.nextInt();
			sum+=array[i];
			if(min>array[i])
			{
				min = array[i];
			}
			if(max<array[i]) {
				max = array[i];
			}
		}
		avg = (double)sum/array.length;
		System.out.print("배열의 원소 = ");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]);
		
		
		System.out.println();
		System.out.println("합 = " + sum + ",평균 = " + avg);
		System.out.println("가장 큰 수 는"+max+"입니다." + "가장 작은 수는" + min + "입니다");
		sc.close();
	}

}

