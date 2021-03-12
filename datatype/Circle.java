package projectfile;
public class Circle{
	public static void main(String[]args) {
		final double PI = 3.14;
		double radios = 10.4;
		double circleArea = radios * radios * PI;
		double circleCir = 2 * PI * radios;
		
		System.out.println("원의 반지름 =" +radios);
		System.out.println("원의면적 = " + circleArea);
		System.out.println("원의둘레 = " + circleCir);
		
	
		
	}
}