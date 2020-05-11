/*
Strings

A String is an object that represents a sequence of characters.
For example, "Hello" is a string of 5 characters.

For example:
String s = "SoloLearn";
 
You are allowed to define an empty string. 
For example, String str = "";

String Concatenation

The + (plus) operator between strings adds them together to make a new string. This process is called concatenation.
The resulted string is the first string put together with the second string.
For example:
String firstName, lastName;
firstName = "David";
lastName = "Williams";

System.out.println("My name is " + firstName +" "+lastName);
        
// Prints: My name is David Williams

The char data type represents a single character. 

*/
public class MyClass 
{

	public static void main(String[] args) 
	{
		String s = "SoloLearn";
		
		String firstName, lastName;
		firstName = "David";
		lastName = "Williams";

		System.out.println("My name is " + firstName +" "+lastName); // Prints: My name is David Williams
	}

}
