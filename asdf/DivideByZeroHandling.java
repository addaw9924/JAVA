import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		int dividend, divisor;
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		dividend = sc.nextInt();
		System.out.println("������ �Է� :");
		divisor = sc.nextInt();
		try {
		System.out.println(dividend + " ��" + divisor + "�� ������" + dividend/divisor);}
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		finally {
			
		}
		sc.close();
	}

}
