
public class CirckeTest {

	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radious = 20;
		pizza.name = "�ڹ� ����";
		double area = pizza.getArea();
		System.out.println(pizza.name + area);
		//Circle pizza; 
		
		Circle donut = new Circle();
		donut.radious = 5;
		donut.name = "�ڹٵ���";
		double area2= donut.getArea();
		System.out.print(donut.name + area2);
		//pizza = new Circle();

	}

}
