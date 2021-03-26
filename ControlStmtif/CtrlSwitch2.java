package controlStmtif;

import java.util.Scanner;

public class CtrlSwitch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("달 (1-12) : " );
		
		month = sc.nextInt();
		
		switch(month) {
		case 3: 
		case 4: 
		case 5:
			System.out.println("봄입니다.");
		case 6: 
		case 7: 
		case 8:
			System.out.println("여름입니다.");
		case 9: 
		case 10: 
		case 11:
			System.out.println("가을입니다.");
		case 12: 
		case 1:   
		case 2:
			System.out.println("겨울입니다.");
		default :
			System.out.println("입력이 잘못되었습니다.");
		
		
		}
	}

}
