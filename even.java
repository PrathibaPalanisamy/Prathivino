package samp;

import java.util.Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		Scanner sc=new Scanner(System.in);
	num1=sc.nextInt();
	num2=sc.nextInt();
	for(int i=num1;i<=num2;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
sc.close();
	}


