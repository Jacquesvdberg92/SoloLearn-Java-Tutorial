/*
else if Statements

Instead of using nested if-else statements, you can use the else if statement to check multiple conditions.
For example:
int age = 25;

if(age <= 0) {
   System.out.println("Error");
} else if(age <= 16) {
   System.out.println("Too Young");
} else if(age < 100) {
   System.out.println("Welcome!");
} else {
   System.out.println("Really?");
}
//Outputs "Welcome!"

The code will check the condition to evaluate to true and execute the statements inside that block.
You can include as many else if statements as you need.
 */
public class MyClass 
{
	public static void main(String[] args) 
	{
		int age = 25;

		if(age <= 0) {
		   System.out.println("Error");
		} else if(age <= 16) {
		   System.out.println("Too Young");
		} else if(age < 100) {
		   System.out.println("Welcome!");
		} else {
		   System.out.println("Really?");
		}
		//Outputs "Welcome!"
	}

}
