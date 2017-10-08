import java.util.Scanner;

public class Hunt5_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
	    int count=0;  
	    int div=sc.nextInt();
	    int dividedby=sc.nextInt();  
	    while(div>=0)
	    {
	      div=div-dividedby;
	      System.out.println(div);
	      count ++;
	      System.out.println(count+"..");
	    }
	    System.out.println(count-1);
	}

}
