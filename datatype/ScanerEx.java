package projectfile;

import java.util.Scanner;

public class ScanerEx {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		String name;
		System.out.print("당신의 이름은 : ");
		name = Sc. next();
		System.out.println(name);
		
		String city;
		System.out.print("당신이 사는 도시는 :");
		city = Sc.next();
		System.out.println(city);
		
		int AGE;
		System.out.print("당신의 나이는 : ");
		AGE = Sc.nextInt();
		System.out.println(AGE);
		
		double Weight;
		System.out.print("당신의 체중은 : ");
		Weight = Sc.nextDouble();
		System.out.println(Weight);
		
		boolean single;
		System.out.print("당신은 결혼하셨습니까? : ");
		single = Sc.nextBoolean();
		System.out.println(single);
		
	}

}
