
public class ForEachEx {

	public static void main(String[] args) {
		int intArray[]= {5,2,1,145,23};
		String strArray[] = {"ap" , "ba", "ma","or","ch"};
		int count = 0; int sum=0;
		for(int i:intArray)
		{
			System.out.print(i);
			sum +=i;
			count++;
			if(count <intArray.length)
				System.out.print("+");
			else
				System.out.print("=");
		}
		System.out.print(sum); System.out.println("ЦђБе = " + (double)sum/count);
		for(String str:strArray)
			System.out.println(str);

	}

}
