package operator;

public class Shift {

	public static void main(String[] args) {
		int a = 5 ,b= -8;
		 System.out.printf("%d >> %d = #d\n",a,2,(a<<2));
		 //2��n������ ���ѰͰ� ����
		 System.out.printf("%d << %d = #d\n",a,2,(a>>2));
		 //��� �����Ͱ� ����.
		 System.out.printf("%d >>> %d = #d\n",b,2,(b>>>2));
		 System.out.printf("%d << %d = #d\n",b,2,(b>>2));

	}

}
