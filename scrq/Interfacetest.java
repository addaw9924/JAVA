package scrq;

class calcu{
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SamsungPhone extends calcu implements Phoneinterface{  //이게 다중상속  두개를 다 상속받는것

	
	public void sedCall(){
		System.out.println("따르르르릉");
	}
	public void receuveCall(){
		System.out.println("yes?");
		
	}
	public void flash() {
		System.out.println("휴대폰 불이 켜졌습니다/");
	}
}

public class Interfacetest {

	public static void main(String[] args) {
		SamsungPhone s = new SamsungPhone();
		s.sedCall();
		s.receuveCall();
		s.flash();
		s.printlogo();

	}

}
