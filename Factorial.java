package factorial;

public class Factorial 
{	


	public int factorial(int i, String type) 
	{

		if(type.equals("recursive"))
		{
			 return factorial_recursive(i);
		}
		
		if(type.equals("iterative"))
		{
			  return factorial_iterative(i);
		}

		return 0;
	}
	
	public int factorial_recursive(int i) 
	{
		if( i == 1)
		{
			return i;
		}
		if(i == 0)
		{
			return 1;
		}
		
		return i*factorial_recursive(i-1);
		
	}
	
	public int factorial_iterative(int i)
	{
		int temp = 1;
		
		if(i == 0 )
		{
			return i;
		}
		else if(i == 1)
		{
		return i;
		}
		
		for(int a = i; a > 0; a--)
		{
			temp = temp*a;
		}
		return temp;		
	}
}
