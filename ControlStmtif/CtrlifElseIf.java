package controlStmtif;

import java.util.Scanner;

public class CtrlifElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Score;
		System.out.print("성적 입력 : ");
		
		Score = sc.nextInt();
		
		if(Score>90)
			System.out.println("당신의 등급은 A 입니다.");
		else if(Score>80)
			System.out.println("당신의 등급은 B 입니다.");
		else if(Score>70)
			System.out.println("당신의 등급은 C 입니다.");
		else if(Score>60)
			System.out.println("당신의 등급은 D 입니다.");
		else
			System.out.println("당신의 등급은 F 입니다.");

	}

}
