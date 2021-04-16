
public class CirckeTest {

	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radious = 20;
		pizza.name = "자바 피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + area);
		//Circle pizza; 
		
		Circle donut = new Circle();
		donut.radious = 5;
		donut.name = "자바도넛";
		double area2= donut.getArea();
		System.out.print(donut.name + area2);
		//pizza = new Circle();

	}

}
