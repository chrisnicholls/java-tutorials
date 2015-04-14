package org.code.tutorials.flow;

public class DoWhile
{

	public static void main(String[] args)
	{
		int count = 10;
		
		while(count > 10 && count < 20)
		{
			System.out.println("In the while loop!");
			count++;
		}
		
		System.out.println("Past the while loop, count = " + count);
		
		//we always do at least one iteration of a do-while loop
		do
		{
			System.out.println("count = " + count);
			count++;
		} while(count > 10 && count < 20);
	}

}
