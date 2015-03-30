package org.code.tutorials.variables;

public class VariablesExample
{
	static long startTime = 0L;

	public static void main(String[] args)
	{
		long endTime = 0L;
		
		startTime = System.currentTimeMillis();
		
		killSomeTime();
		
		endTime = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		
		System.out.println("Total time: " + totalTime);
		
	}
	
	private static void killSomeTime()
	{		
		//using i here is acceptable since it is just used as an index
		for(int i = 0; i < 10; i++)
		{
			long timeSleep = i * 100;
			try
			{
				System.out.println("Sleeping for " + timeSleep + "ms");
				Thread.sleep(timeSleep);
			}
			catch(InterruptedException e)
			{
				System.err.println("Interrupted.");
			}
		}
		
		//timeSleep is 'out of scope' since it was defined within the above for loop block. so it can no longer be accessed
//		System.out.println("timeSleep: " + timeSleep);
		
		
		//startTime is a global variable for this class so we can access it here
		System.out.println("startTime: " + startTime);
		
		//endTime was declared in the main() method so it can only be accessed there
//		System.out.println("endTime: " + endTime);
	}

}
