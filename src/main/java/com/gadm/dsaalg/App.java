package com.gadm.dsaalg;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a line of text: " );
	while (sc.hasNext()) {
		String x = sc.nextLine();
        	System.out.println( x );
        	System.out.print("Please enter a line of text: " );
	}
	System.out.println();
	System.out.println("End of input.");
    }
}
