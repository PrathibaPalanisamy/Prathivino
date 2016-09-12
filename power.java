public class power {

	
	public static void main(String[] args) {
		int a=12345,sum=0,res = 0,r;
		while(a!=0)
		{
			int i=0;
			r=a%10;
			res=res+r;
			
			sum=(int) (sum+Math.pow(r, i));
			i++;
			a=a/10;
		
		
		System.out.print(sum);
		}
		
	}
	

}
