package review;

import java.util.Scanner;

public class arrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 500;
		int sum = 0;
		double avg;
		
		int array[] = new int[5];
		
		for(int i=0; i<array.length; i++)
		{
			array[i] = sc.nextInt();
			sum+=array[i];
			if(min>array[i])
			{
				min = array[i];
			}
			if(max<array[i]) {
				max = array[i];
			}
		}
		avg = (double)sum/array.length;
		System.out.print("�迭�� ���� = ");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]);
		
		
		System.out.println();
		System.out.println("�� = " + sum + ",��� = " + avg);
		System.out.println("���� ū �� ��"+max+"�Դϴ�." + "���� ���� ����" + min + "�Դϴ�");
		sc.close();
	}

}

