import java.util.InputMismatchException;
import java.util.Scanner;

public class inputinception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =0, sum = 0;
		System.out.print("���� ������ �Է��Ͻÿ�");
		for(int i =0; i<3; i++)
		{		
			try {
				n=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.print("������ �Է��ϼ��� : ");
				sc.next();
				i--;
				continue;
			}
			
		}
		System.out.print("������ ���� : "  + sum+n);
		sc.close();
	}

}
