/*
The Return Type

The return keyword can be used in methods to return a value.
For example, we could define a method named sum that returns the sum of its two parameters.static int sum(int val1, int val2) {
   return val1 + val2;
}
Notice that in the method definition, we defined the return type before we defined the method name. For our sum method, it is int, as it takes two parameters of the type int and returns their sum, which is also an int.
The static keyword will be discussed in a future lesson.
Now, we can use the method in our main.
class MyClass {

static int sum(int val1, int val2) {
  return val1 + val2;
}

  public static void main(String[ ] args) {
    int x = sum(2, 5);
    System.out.println(x);
  }
}
// Outputs "7"

As the method returns a value, we can assign it to a variable.
When you do not need to return any value from your method, use the keyword void.
Notice the void keyword in the definition of the main method - this means that main does not return anything.


Take a look at the same code from our previous lesson with explaining comments, so you can better understand how it works: // returns an int value 5
static int returnFive() {
  return 5;
}

// has a parameter
static void sayHelloTo(String name) {
  System.out.println("Hello " + name);
}

// simply prints"Hello World!"
static void sayHello() {
  System.out.println("Hello World!");
}
Having gained knowledge of method return types and parameters, let's take another look at the definition of the main method. public static void main(String[ ] args)
This definition indicates that the main method takes an array of Strings as its parameters, and does not return a value


Let's create a method that takes two parameters of type int and returns the greater one, then call it in main:
public static void main(String[ ] args) {
  int res = max(7, 42);
  System.out.println(res); //42
}

static int max(int a, int b) 
{
  if(a > b) {
    return a;
  }
  else {
    return b;
  }
}


A method can have one type of parameter (or parameters) and return another, different type. For example, it can take two doubles and return an int.

 */
public class MyClass 
{
	static int sum(int val1, int val2) 
	{
		  return val1 + val2;
	}	
	
	static int max(int a, int b) 
	{
		  if(a > b) {
		    return a;
		  }
		  else {
		    return b;
		  }
	}
	
	
	public static void main(String[] args) 
	{
		int x = sum(2, 5);
	    System.out.println(x);
	    
	    int res = max(7, 42);
	    System.out.println(res);
	}

}
