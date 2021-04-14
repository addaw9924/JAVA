import java.util.Scanner;

public class TowDimEx {

	public static void main(String[] args) {
		int twodim[][]= new int[3][4];
		int twodim1[][] = {{1,2,3,4,},{2,4,5,1},{5,6,7,8}};
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<twodim.length; i++) { //3들어감
			System.out.println(i);
		}
		for(int i = 0; i<twodim[0].length; i++) {
			System.out.println(i);
		}
		for(int i =0; i<twodim.length; i++){
			for(int j=0; j<twodim[0].length; j++)
				twodim[i][j] = sc.nextInt();
		}
		
		for(int i =0; i<twodim1.length; i++){
			for(int j=0; j<twodim1[0].length; j++)
				System.out.printf("%3d" , twodim1[i][j]);
			System.out.println(); //값이 있으니 굳이 입력받지 않아도 되는것
		}
	}

}
