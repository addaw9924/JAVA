import java.util.Scanner;

public class CtrlWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int i=1, sum = 0;
		
		while(i<=n)
		{
			sum+=i;
			System.out.print(i);
			
			if(i<= n-1)
			System.out.print("+");
			else
				System.out.print("=");
			}
		sum+=10;
		System.out.println(i+"="+sum);
	}

}
