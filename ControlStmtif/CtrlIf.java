package controlStmtif;

import java.util.Scanner;

public class CtrlIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("당신의 나이는 얼마입니까 : ");
		age = sc.nextInt();
		
		if(age > 19) 
			System.out.println("당신은 성인입니다.");
		
		sc.close();

	}

}
