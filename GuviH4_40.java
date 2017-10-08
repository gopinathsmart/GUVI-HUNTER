import java.util.Scanner;

public class GuviH4_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int original=n;
		int rem=0;
		int sum=0;
		while(n != 0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(sum==original) {
			System.out.println("sum of digit is palindrome");
		}else {
			System.out.println("sum of digit is not a palindrome");
		}
	}

}
