/*
Type Casting

Assigning a value of one type to a variable of another type is known as Type Casting.

To cast a value to a specific type, place the type in parentheses and position it in front of the value.
Example:
int a = (int) 3.14;
System.out.println(a);
//Outputs 3


The code above is casting the value 3.14 to an integer, with 3 as the resulting value.
Another example:
double a = 42.571;
int b = (int) a;
System.out.println(b);
//Outputs 42


Java supports automatic type casting of integers to floating points, since there is no loss of precision.
On the other hand, type casting is mandatory when assigning floating point values to integer variables.



 */
public class MyClass 
{
	public static void main(String[] args) 
	{
		int a = (int) 3.14;
		System.out.println(a);
		
		double x = 42.571;
		int b = (int) x;
		System.out.println(b);		
	}
}
