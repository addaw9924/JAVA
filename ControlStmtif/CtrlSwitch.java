package controlStmtif;

import java.util.Scanner;

public class CtrlSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("성적 : ");
		score = sc.nextInt();
		switch(score/10) {
		case 10: 
		case 9:
			System.out.println("당신의 등급은 A 입니다."); break;
		case 8:
			System.out.println("당신의 등급은 B 입니다."); break;
		case 7:
			System.out.println("당신의 등급은 C 입니다."); break;
		case 6:
			System.out.println("당신의 등급은 D 입니다."); break;
		default:
    		System.out.println("당신의 등급은 A 입니다."); break;
		}
	}

}
