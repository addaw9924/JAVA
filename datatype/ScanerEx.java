package projectfile;

import java.util.Scanner;

public class ScanerEx {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		String name;
		System.out.print("����� �̸��� : ");
		name = Sc. next();
		System.out.println(name);
		
		String city;
		System.out.print("����� ��� ���ô� :");
		city = Sc.next();
		System.out.println(city);
		
		int AGE;
		System.out.print("����� ���̴� : ");
		AGE = Sc.nextInt();
		System.out.println(AGE);
		
		double Weight;
		System.out.print("����� ü���� : ");
		Weight = Sc.nextDouble();
		System.out.println(Weight);
		
		boolean single;
		System.out.print("����� ��ȥ�ϼ̽��ϱ�? : ");
		single = Sc.nextBoolean();
		System.out.println(single);
		
	}

}
