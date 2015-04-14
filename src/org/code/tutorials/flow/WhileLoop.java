package org.code.tutorials.flow;

public class WhileLoop
{

	public static void main(String[] args)
	{
		int count = 0;
		
		while(count < 10)
		{
			System.out.println("count = " + count);
			
			//make sure that you always increment your counter otherwise you will get an infinite loop!
			count++;
		}
	}

}
