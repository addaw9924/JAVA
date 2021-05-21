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
		p.draw(); //다양성
	}
	public static void main(String[] args) {
		LINE line = new LINE();
		print(line); // 실행하니까 LIne가 실행됨
		print(new LINE());
		print(new Shape());
		print(new Circle1());
		print(new Rect());
		
		//업캐스팅 자식이 부모로 간것이니 ?
	}

}
