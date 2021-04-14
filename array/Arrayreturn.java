
public class Arrayreturn {

	public static void main(String[] args) {
		int intarray[] = {1,2,3,4,5,6}; int intarray2[]= new int[4];
		int sum = 0;
		sum = hap(intarray);
		System.out.println("ÃÑÇÕ = " + sum);
		intarray2=hap2();
		for(int i =0; i< intarray2.length; i++)
			System.out.printf("%3d", intarray2[i]);
	}
	static int hap(int [] abc /*¹ŞÀº°Í*/) {
		int hap = 0;
		for(int i = 0; i<abc.length; i++)
		{
			hap+=abc[i];
		}
		return hap;
	}
	static int [] hap2() {
		int hap[] = {3,4,5,6};
		for(int i = 0; i<hap.length; i++)
			hap[i] = hap[i] +5;
		return hap;
	}

}
