package scrq;
class Shape{
	public void draw() {
		System.out.println("shape");
	}
}



class LINE extends Shape {
	public void draw() {
		System.out.print("LIne");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.print("rectangle");
	}	
}


class Circle1 extends Shape {
	public void draw() {
		System.out.print("Circle");
	}
}

public class OverridingRest {
	static void print(Shape p)
	{
		p.draw(); //�پ缺
	}
	public static void main(String[] args) {
		LINE line = new LINE();
		print(line); // �����ϴϱ� LIne�� �����
		print(new LINE());
		print(new Shape());
		print(new Circle1());
		print(new Rect());
		
		//��ĳ���� �ڽ��� �θ�� �����̴� ?
	}

}
