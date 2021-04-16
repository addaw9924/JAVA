import java.util.InputMismatchException;
import java.util.Scanner;

public class inputinception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =0, sum = 0;
		System.out.print("정수 세개를 입력하시오");
		for(int i =0; i<3; i++)
		{		
			try {
				n=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.print("정수를 입력하세요 : ");
				sc.next();
				i--;
				continue;
			}
			
		}
		System.out.print("정수의 합은 : "  + sum+n);
		sc.close();
	}

}
