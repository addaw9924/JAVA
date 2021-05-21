package scrq;

public interface Phoneinterface {
	final int TIMEOUT = 10000;
	void sedCall(); //추상메세지
	void receuveCall();
	default void printlogo() {
		System.out.println("** Phone **");
	}
	
}
