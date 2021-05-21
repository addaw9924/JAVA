package scrq;

public class Calc1 extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double avg(int[] a) {
		// TODO Auto-generated method stub
		double sum =0;
		for(int i=0; i<a.length; i++)
			sum +=a[i];
		return sum/a.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 c= new Calc1();
		System.out.println(c.add(1, 2));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.avg(new int[] {1,2,3,4}));
	}

}

