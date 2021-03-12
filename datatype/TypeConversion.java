package projectfile;

public class TypeConversion {

	public static void main(String[] args) {
		byte b = 125;
		int c = 100;
		
		System.out.println(b+c);
		System.out.println(10/4);
		System.out.println(10/4.0);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+c));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)1.9+(int)1.8);
	}

}
