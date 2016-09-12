import java.util.Scanner;
public class SumNatural {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
Scanner sc=new Scanner(System.in);
int limit=sc.nextInt();
for(int i=1;i<=limit;i++)
{
	
	sum=sum+i;
	}
System.out.println(sum);
sc.close();
	}

}
