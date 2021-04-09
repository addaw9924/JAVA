package review;

import java.util.Scanner;

public class whileReview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0,n;
		double sum = 0;
		
		while((n=sc.nextInt())!=0)
		{
			sum+=n;
			count++;
		}
		System.out.println("정수를" + count + "개 입력받았습니다.");
		System.out.println("평균은" + (sum/count) + "입니다.");
		
		sc.close();
	}

}
