package factorial;



public class Fibonacci 
{
	
	public int fibonacci(int i, String type) 
	{
	
		
		if(type.equals("recursive"))
		{
			 return fibonacci_recursive(i);
		}
		
		if(type.equals("iterative"))
		{
			  return fibonacci_iterative(i);
		}
		
		return 0;
		
	
	}
	
	public int fibonacci_recursive(int i) 
	{
		if( i == 0)
		{
			return 0;
		}
		else if (i ==1)
		{
			return 1;
		}
		return fibonacci_recursive(i-1) + fibonacci_recursive(i-2);
		// TODO Auto-generated method stub

	}

	public int fibonacci_iterative(int expectedValues)
	{
			if(expectedValues <= 1) 
			{
				return 1;
			}
			int init = 1;
			int prev = 1;
			for(int z=2; z<expectedValues; z++) 
			{
				int temp = init;
				init+= prev;
				prev = temp;
			}
			return init;
	}
}

