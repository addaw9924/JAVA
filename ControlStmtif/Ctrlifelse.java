package controlStmtif;

import java.util.Scanner;

public class Ctrlifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int years;
		
		System.out.println("년도 : ");
		years = sc.nextInt();
		//4의 배수이고 100의 배수는 아니고 400의 배수이면 윤년
		
		if(years%4==0 && years%100!=0 || years%400==0)
			System.out.println(years + "년은 윤년입니다.");
		else
			System.out.println(years + "년은 평년입니다.");
		
		sc.close();
		
	}

}
