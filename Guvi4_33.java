import java.util.Scanner;

public class Guvi4_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int rem=0;
		String output="";
		while(n != 0) {
			rem=n%10;
			n=n/10;
			switch(rem) {
			case 1:{
				output+="Null"+" ";
				break;
			}
			case 2:{
				output+="ABC"+" ";
				break;
			}
			case 3:{
				output+="DEF"+" ";
				break;
			}
			case 4:{
				output+="GHI"+" ";
				break;
			}
			case 5:{
				output+="JKL"+" ";
				break;
			}
			case 6:{
				output+="MNO"+" ";
				break;
			}
			case 7:{
				output+="PQRS"+" ";
				break;
			}
			case 8:{
				output+="TUV"+" ";
				break;
			}
			case 9:{
				output+="WXYZ"+" ";
				break;
			}case 0:{
				output+="Null"+" ";
				break;
			}default:System.out.println("Invalid key");
			
			}
		}
		System.out.println(output);
	}

}
