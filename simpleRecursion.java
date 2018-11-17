/**
 * @author Shane Anderson
 *
 * Elementary Recursion Examples:
 */
import java.util.*;

public class simpleRecursion 
	{
	/*
	 * recursive method to count down 
	 * from n to 1 and stop:
	 */
	public static void countDown (int number)
		{
		System.out.println(number);
		
		if (number > 1)
			{
			countDown(number - 1);
			}
		}
	
	/*
	 * recursive method to count up
	 * from 1 to n:
	 */
	public static void countUp (int number)
		{
		if (number >= 1)
			{
			countUp (number - 1);
			
			System.out.println(number);
			}
		}
	
	
	/*
	 * recursive method to skip n
	 * lines of output:
	 */
	public static void skipNLines (int n)
		{
		if (n < 0)
			{
			System.out.println("ERROR: Negative Value Entered");
			
			System.exit(-1);
			}
		
		else if (n == 0)
			{
			System.out.println("Hello");
			}
		
		else
			{
			System.out.println( );
			
			skipNLines(n-1);
			}
		}
	
	
	@SuppressWarnings("resource")
	public static void main (String [ ] args)
		{
		int cDown, cUp, sLines;
		
		//For countDown:
		System.out.println("COUNTDOWN: Enter a Number Greater than 0: ");
		
		Scanner s = new Scanner (System.in);
		
		cDown = s.nextInt ( );
		
		countDown (cDown);
		
		
		//For skip N lines:
		System.out.println("SKIP_N_LINES: Enter Number of Lines to Skip: ");
			
		sLines = s.nextInt ( );
		
		skipNLines (sLines);
		
		
		//For countUp:
		System.out.println("COUNTUP: Enter Number to Stop CountUp: ");
						
		cUp = s.nextInt ( );
		
		countUp (cUp);
		}
	}
