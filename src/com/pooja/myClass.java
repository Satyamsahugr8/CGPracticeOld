package com.pooja;

public class myClass {
	
	public static void main(String[] args) {
		int even =0,odd = 0;
		for(int i=0;i<5;i++) 
		{
			if(i%2==0) 
			{
				even+=2;
				System.out.println(i+1+"even");
			}
		else {
			odd+=2;
			System.out.println("odd"+i+1);
		}
		}
System.out.println(Math.max(even, odd));		
}
}