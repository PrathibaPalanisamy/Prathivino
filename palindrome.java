import java.util.Scanner;


public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String Str=scan.nextLine();
StringBuffer sb=new StringBuffer(Str);
sb.reverse();
String revstr=sb.toString();
if (Str.equals(revstr))
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not Palnidrome");
}
scan.close();
	}

}
