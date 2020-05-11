/*
Getting User Input

While Java provides many different methods for getting user input, the Scanner object is the most common, and perhaps the easiest to implement. Import the Scanner class to use the Scanner object, as seen here:
import java.util.Scanner;
 
In order to use the Scanner class, create an instance of the class by using the following syntax:
Scanner myVar = new Scanner(System.in);

You can now read in different kinds of input data that the user enters.
Here are some methods that are available through the Scanner class:
Read a byte - nextByte()
Read a short - nextShort()
Read an int - nextInt()
Read a long - nextLong()
Read a float - nextFloat()
Read a double - nextDouble()
Read a boolean - nextBoolean()
Read a complete line - nextLine()
Read a word - next()

Example of a program used to get user input:
import java.util.Scanner;

class MyClass 
{
  public static void main(String[ ] args) 
  {
    Scanner myVar = new Scanner(System.in);
    System.out.println(myVar.nextLine());        
  }
}

*/

import java.util.Scanner;
public class MyClass 
{
	public static void main(String[] args) 
	{
		Scanner myVar = new Scanner(System.in);
		System.out.println(myVar.nextLine());
		
	}

}
