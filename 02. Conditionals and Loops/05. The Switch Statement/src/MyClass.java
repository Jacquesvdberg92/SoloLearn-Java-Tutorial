/*
The switch Statement

A switch statement tests a variable for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case.
Syntax: 
switch (expression) 
{
   case value1 :
     //Statements
     break; //optional
   case value2 :
     //Statements
     break; //optional
    //You can have any number of case statements.
    default : //Optional
       //Statements
}
- When the variable being switched on is equal to a case, the statements following that case will execute until a break statement is reached.
- When a break statement is reached, the switch terminates, and the flow of control jumps to the next line after the switch statement.
- Not every case needs to contain a break. If no break appears, the flow of control will fall through to subsequent cases until a break is reached.

The example below tests day against a set of values and prints a corresponding message.
int day = 3;

switch(day) 
{
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
}
// Outputs "Wednesday"

You can have any number of case statements within a switch. Each case is followed by the comparison value and a colon.

The default Statement

A switch statement can have an optional default case.
The default case can be used for performing a task when none of the cases is matched.

For example:
int day = 3;

switch(day) 
{
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
  default:
    System.out.println("Weekday");
}
// Outputs "Weekday"
Try It Yourself

No break is needed in the default case, as it is always the last statement in the switch 
 
 */
public class MyClass 
{
	public static void main(String[] args) 
	{
		int day = 3;

		switch(day) 
		{
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		}
		
		day = 3;

		switch(day) 
		{
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default:
		    System.out.println("Weekday");
		}
	}
}
