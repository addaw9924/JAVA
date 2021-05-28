
public class Caller {

	public static void main(String[] args) {
		Basic bas = new Basic();
		Basic bas2 = new Basic();
		
		bas.setHeight(10);
		bas.setWidth(20);
		bas2.setHeight(41);
		bas2.setWidth(1444);
		System.out.println("사각형의 높이= " + bas.getHeight());
		System.out.println(bas);
		 
		
		int a = 10;
		Integer b = 20;
		
		System.out.println(a + b);
		
	}

}
