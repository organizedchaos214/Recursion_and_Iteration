/**
 * @author Shane Anderson
 * 
 * Generates the nth fibonacci number
 */
import java.util.*;

public class fibonacci 
	{
	public int fib (int n)
		{
		if (n == 0)
			{
			return 0;
			}
		
		if (n == 1)
			{
			return 1;
			}
		
		else
			{
			return fib(n-1) + fib(n-2);
			}
		}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
		{
		int n;	
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter Value of N. This program assumes counting from 0, not 1:");
	
		n = s.nextInt( );	
		fibonacci f = new fibonacci ( );
		f.fib (n);
		System.out.println("Value is: " + f.fib(n));
		}

}
