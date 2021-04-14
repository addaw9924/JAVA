import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[];
		intArray = new int[5];
		int max = 0; int min = 12345;
		int sum = 0;
		System.out.println("정수 5개 입력 : ");
		for(int i =0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
			if(intArray[i]>max)
				max=intArray[i];
			if(intArray[i]<min)
				min=intArray[i];
			}
		System.out.println("입력한 정수중에 최대값 =" + max);
		System.out.println("정수의 평균 : " + (double)sum/intArray.length);
		sc.close();
	}

}
