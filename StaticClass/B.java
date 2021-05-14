
public class B extends A{
	int bbb;
	public B() {
		bbb=1;
		System.out.println("나는 비 클래스의 생성자입니다.");
	}
	public B(int bbb) {
		this.bbb = bbb;
		System.out.println("나는 클래스의 인자가 하나인 생성자 입니다.");
	}
}
