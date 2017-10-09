import java.util.Arrays;
import java.util.Scanner;

public class Hunt7_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[n-1]-a[0]+"thousand");
	}

}
