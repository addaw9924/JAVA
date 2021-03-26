import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		int i,num = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(i=1; i<=9; i++)
		{
			num = n*i;
			System.out.println(num);
		}

	}

}
