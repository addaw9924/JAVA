package controlStmtif;

import java.util.Scanner;

public class CtrlSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("���� : ");
		score = sc.nextInt();
		switch(score/10) {
		case 10: 
		case 9:
			System.out.println("����� ����� A �Դϴ�."); break;
		case 8:
			System.out.println("����� ����� B �Դϴ�."); break;
		case 7:
			System.out.println("����� ����� C �Դϴ�."); break;
		case 6:
			System.out.println("����� ����� D �Դϴ�."); break;
		default:
    		System.out.println("����� ����� A �Դϴ�."); break;
		}
	}

}
