package controlStmtif;

import java.util.Scanner;

public class CtrlifElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Score;
		System.out.print("���� �Է� : ");
		
		Score = sc.nextInt();
		
		if(Score>90)
			System.out.println("����� ����� A �Դϴ�.");
		else if(Score>80)
			System.out.println("����� ����� B �Դϴ�.");
		else if(Score>70)
			System.out.println("����� ����� C �Դϴ�.");
		else if(Score>60)
			System.out.println("����� ����� D �Դϴ�.");
		else
			System.out.println("����� ����� F �Դϴ�.");

	}

}
