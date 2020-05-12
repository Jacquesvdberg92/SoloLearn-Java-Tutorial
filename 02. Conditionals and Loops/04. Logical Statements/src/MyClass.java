/*
Logical Operators

Logical operators are used to combine multiple conditions.

Let's say you wanted your program to output "Welcome!" only when the variable age is greater than 18 and the variable money is greater than 500.

One way to accomplish this is to use nested if statements:

if (age > 18) 
{
   if (money > 500) 
   {
      System.out.println("Welcome!");
   }
}

However, using the AND logical operator (&&) is a better way:

if (age > 18 && money > 500) 
{
   System.out.println("Welcome!");
}

If both operands of the AND operator are true, then the condition becomes true.

The OR Operator

The OR operator (||) checks if any one of the conditions is true.
The condition becomes true, if any one of the operands evaluates to true.
For example:

int age = 25;
int money = 100;
if (age > 18 || money > 500) 
{
   System.out.println("Welcome!");
}
//Outputs "Welcome!"

The code above will print "Welcome!" if age is greater than 18 or if money is greater than 500.

The NOT (!) logical operator is used to reverse the logical state of its operand. If a condition is true, the NOT logical operator will make it false.
Example:
int age = 25;
if(!(age > 18)) 
{
   System.out.println("Too Young");
} else {
   System.out.println("Welcome");
}
//Outputs "Welcome"

!(age > 18) reads as "if age is NOT greater than 18".
 */
public class MyClass 
{
	public static void main(String[] args) 
	{
		int a = 11; int b = 12;
		int c = 40;
		if (a > 100 || b > 3) {
		  System.out.println(a); 
		} else {
		  System.out.println(c);
		}

	}

}
