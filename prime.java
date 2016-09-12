
public class Primedigit {
	public static void main(String[] args) {
int input1=11;
int input2=37;
int flag = 0;
for(int i=input1;i<=input2;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j == 0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
		
if(flag == 1)
{
	System.out.println("prime num");
}
else
{
	System.out.println("not a prime num");
}
	}
	}
		}
		
	

	

