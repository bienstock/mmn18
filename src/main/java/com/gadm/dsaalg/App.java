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
        System.out.print("Please enter a line of text: " );
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
		String x = sc.nextLine();
        	System.out.println( x );
	}
	System.out.println("End of input.");
    }
}
