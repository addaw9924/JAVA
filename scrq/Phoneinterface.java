package scrq;

public interface Phoneinterface {
	final int TIMEOUT = 10000;
	void sedCall(); //�߻�޼���
	void receuveCall();
	default void printlogo() {
		System.out.println("** Phone **");
	}
	
}
