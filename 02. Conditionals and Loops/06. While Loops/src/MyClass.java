/*
while Loops

A loop statement allows to repeatedly execute a statement or group of statements.

A while loop statement repeatedly executes a target statement as long as a given condition is true.

Example:
int x = 3;

while(x > 0) 
{
   System.out.println(x);
   x--;
}
Outputs
  3
  2
  1

Try It Yourself

The while loops check for the condition x > 0. If it evaluates to true, it executes the statements within its body. Then it checks for the statement again and repeats.
Notice the statement x--. This decrements x each time the loop runs, and makes the loop stop when x reaches 0.
Without the statement, the loop would run forever.

When the expression is tested and the result is false, the loop body is skipped and the first statement after the while loop is executed.

Example:
int x = 6;

while( x < 10 )
{
  System.out.println(x);
  x++;
}
System.out.println("Loop ended");


6
7
8
9
Loop ended

Notice that the last print method is out of the while scope.
*/
public class MyClass 
{
	public static void main(String[] args) 
	{
		int x = 3;

		while(x > 0) 
		{
		   System.out.println(x);
		   x--;
		}
		/* 
		Outputs
		  3
		  2
		  1
		*/
		
		int y = 6;

		while( y < 10 )
		{
		  System.out.println(y);
		  y++;
		}
		System.out.println("Loop ended");
	}
}
