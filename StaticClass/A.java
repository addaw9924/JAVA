
public class A {
	int aaa;
	public A() {
		aaa=4;
		System.out.println("나는 A 클리스의 생성자 입니다.");
	}
	public A(int aaa) {
		this.aaa = aaa;
		System.out.println("나는 클래스의 인자가 하나인 생성자 입니다.");
	}
}
