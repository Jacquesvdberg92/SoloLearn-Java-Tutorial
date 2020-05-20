/*
Value Types

Value types are the basic types, and include byte, short, int, long, float, double, boolean, and char.
These data types store the values assigned to them in the corresponding memory locations.
So, when you pass them to a method, you basically operate on the variable's value, rather than on the variable itself.
Example:
public class MyClass {
  public static void main(String[ ] args) 
  {
    int x = 5;
    addOneTo(x);
    System.out.println(x);       
  }
  static void addOneTo(int num) {
    num = num + 1;
  }
}
// Outputs "5"

The method from the example above takes the value of its parameter, which is why the original variable is not affected and 5 remains as its value.

Reference Types

A reference type stores a reference (or address) to the memory location where the corresponding data is stored.
When you create an object using the constructor, you create a reference variable.
For example, consider having a Person class defined:
public class MyClass {
  public static void main(String[ ] args) {
    Person j;
    j = new Person("John");
    j.setAge(20);
    celebrateBirthday(j);
    System.out.println(j.getAge());
  }
  static void celebrateBirthday(Person p) {
    p.setAge(p.getAge() + 1);
  }
}
//Outputs "21"
Try It Yourself

The method celebrateBirthday takes a Person object as its parameter, and increments its attribute.
Because j is a reference type, the method affects the object itself, and is able to change the actual value of its attribute.
Arrays and Strings are also reference data types.

 */
public class MyClass 
{
	public static void main(String[] args) 
	{
		int x = 5;
	    addOneTo(x);
	    System.out.println(x);       
	}
	
	  static void addOneTo(int num) 
	  {
	    num = num + 1;
	  }
}
