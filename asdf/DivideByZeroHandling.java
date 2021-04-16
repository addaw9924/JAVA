import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		int dividend, divisor;
		Scanner sc = new Scanner(System.in);

		System.out.print("나뉨수 입력 : ");
		dividend = sc.nextInt();
		System.out.println("나눗수 입력 :");
		divisor = sc.nextInt();
		try {
		System.out.println(dividend + " 를" + divisor + "로 나오면" + dividend/divisor);}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		finally {
			
		}
		sc.close();
	}

}
