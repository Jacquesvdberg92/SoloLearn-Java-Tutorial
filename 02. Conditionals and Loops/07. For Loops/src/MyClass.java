/*
for Loops

Another loop structure is the for loop. A for loop allows you to efficiently write a loop that needs to execute a specific number of times.
Syntax: for (initialization; condition; increment/decrement) {
   statement(s)
}
Initialization: Expression executes only once during the beginning of loop
Condition: Is evaluated each time the loop iterates. The loop executes the statement repeatedly, until this condition returns false.
Increment/Decrement: Executes after each iteration of the loop.

The following example prints the numbers 1 through 5.
for(int x = 1; x <=5; x++) {
  System.out.println(x);
}

Outputs
1
2
3
4
5

This initializes x to the value 1, and repeatedly prints the value of x, until the condition x<=5 becomes false. On each iteration, the statement x++ is executed, incrementing x by one.
Notice the semicolon (;) after initialization and condition in the syntax.

You can have any type of condition and any type of increment statements in the for loop.
The example below prints only the even values between 0 and 10: 
 */
public class MyClass 
{
	public static void main(String[] args) 
	{
		for(int x = 1; x <=5; x++) 
		{
			  System.out.println(x);
		}

	}
}
