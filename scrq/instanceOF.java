package scrq;

class Person{}
class Student extends Person{}
class Researcher extends Student{}
class professor extends Researcher{}

public class instanceOF {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Student)
			System.out.print("student ");
		if(p instanceof professor)
			System.out.println("professor ");
		System.out.println();
	}
	public static void main(String[]args) {
		System.out.print("student -> "); print(new Student());
		System.out.print("Researcher -> "); print(new Researcher());
		System.out.print("professor -> "); print(new professor());
		}
	
}


