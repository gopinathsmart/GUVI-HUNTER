import java.util.Scanner;

public class GuviHunter3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String out="";
		while(!s1.equals("")) {
			out+=s1.charAt(0)+"";
			s1=s1.replace(s1.charAt(0)+"","");
		}
		System.out.println(out);
	}

}
