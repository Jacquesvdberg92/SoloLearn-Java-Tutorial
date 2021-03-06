/**
Your First Java Program

Let's start by creating a simple program that prints �Hello World� to the screen.
class MyClass {
  public static void main(String[ ] args) {
    System.out.println("Hello World");
  }
}

In Java, every line of code that can actually run needs to be inside a class.
In our example, we named the class A_Hello_World_Program. You will learn more about classes in the upcoming modules.

In Java, each application has an entry point, or a starting point, which is a method called main. Along with main, the keywords public and static will also be explained later.
As a summary:
- Every program in Java must have a class.
- Every Java program starts from the main method.
 
 */
public class A_Hello_World_Program 
{
public static void main(String[] args) {
	System.out.println("Hello World");
}
}

/*
 The main Method

To run our program, the main method must be identical to this signature:public static void main(String[ ] args)
- public: anyone can access it
- static: method can be run without creating an instance of the class containing the main method
- void: method doesn't return any value
- main: the name of the method

For example, the following code declares a method called test, which does not return anything and has no parameters:void test()
The method's parameters are declared inside the parentheses that follow the name of the method.
For main, it's an array of strings called args. We will use it in our next lesson, so don't worry if you don't understand it all now.

System.out.println()

Next is the body of the main method, enclosed in curly braces: {
   System.out.println("Hello World!");
}
The println method prints a line of text to the screen.
The System class and its out stream are used to access the println method.
In classes, methods, and other flow-control structures code is always enclosed in curly braces { }.

Semicolons in Java

You can pass a different text as the parameter to the println method to print it.
class MyClass {
  public static void main(String[ ] args) {
    System.out.println("I am learning Java");
  }
}

In Java, each code statement must end with a semicolon.
Remember: do not use semicolons after method and class declarations that follow with the body defined using the curly braces.
 */
