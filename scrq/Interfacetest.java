package scrq;

class calcu{
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SamsungPhone extends calcu implements Phoneinterface{  //�̰� ���߻��  �ΰ��� �� ��ӹ޴°�

	
	public void sedCall(){
		System.out.println("����������");
	}
	public void receuveCall(){
		System.out.println("yes?");
		
	}
	public void flash() {
		System.out.println("�޴��� ���� �������ϴ�/");
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
