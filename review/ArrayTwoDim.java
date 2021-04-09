package review;

public class ArrayTwoDim {

	public static void main(String[] args) {
		double score[][] = {{4.3,4.2},{3.1,3.2},{4.2,4.2},{3.2,3.5}};
		double sum = 0;
		for(int year = 0; year<score.length; year++)
		{
			for(int term = 0; term<score[0].length; term++) {
				sum+=score[year][term];
			}
		}
		int count = score.length * score[0].length;
		System.out.println("ЦђБе = " + sum/count);

	}

}
