import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[];
		intArray = new int[5];
		int max = 0; int min = 12345;
		int sum = 0;
		System.out.println("���� 5�� �Է� : ");
		for(int i =0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
			if(intArray[i]>max)
				max=intArray[i];
			if(intArray[i]<min)
				min=intArray[i];
			}
		System.out.println("�Է��� �����߿� �ִ밪 =" + max);
		System.out.println("������ ��� : " + (double)sum/intArray.length);
		sc.close();
	}

}
