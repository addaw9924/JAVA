package projectfile;

import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		int a,b;
		System.out.print("A�� ���� : ");
		a = Sc.nextInt();
		System.out.print("B�� ���� : ");
		b = Sc.nextInt();
		
		System.out.printf( "%d + %d = %d\n" , a, b ,a+b);
		System.out.printf( "%d - %d = %d\n" , a, b ,a-b);
		System.out.printf( "%d * %d = %d\n" , a, b ,a*b);
		System.out.printf( "%d / %d = %.2f\n" , a, b ,(double)a/b);

	}

}
