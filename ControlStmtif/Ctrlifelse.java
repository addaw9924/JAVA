package controlStmtif;

import java.util.Scanner;

public class Ctrlifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int years;
		
		System.out.println("�⵵ : ");
		years = sc.nextInt();
		//4�� ����̰� 100�� ����� �ƴϰ� 400�� ����̸� ����
		
		if(years%4==0 && years%100!=0 || years%400==0)
			System.out.println(years + "���� �����Դϴ�.");
		else
			System.out.println(years + "���� ����Դϴ�.");
		
		sc.close();
		
	}

}
