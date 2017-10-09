import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class hunt7_68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int d=0;
		ArrayList<Integer>e=new ArrayList<Integer>();
		ArrayList<Integer>f=new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			d=a[i]-a[i+1];
			sum=Math.abs(d);
			e.add(sum);
		}
		for(int i=0;i<e.size();i++) {
			f.add(e.get(i));
		}
		Collections.sort(e);
		for(int i=0;i<f.size();i++) {
			if(e.get(e.size()-1)==f.get(i)) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
