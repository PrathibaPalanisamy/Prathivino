public class add {

	public static void main(String[] args) {
		int a=1235,r,sum=0,count=0;
		while(a!=0)
		{
			r=a%10;
			sum=sum+r;
			count++;
			a=a/10;
		}
		System.out.println(count);
		
	}
}
