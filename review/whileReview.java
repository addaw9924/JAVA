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
		System.out.println("������" + count + "�� �Է¹޾ҽ��ϴ�.");
		System.out.println("�����" + (sum/count) + "�Դϴ�.");
		
		sc.close();
	}

}
