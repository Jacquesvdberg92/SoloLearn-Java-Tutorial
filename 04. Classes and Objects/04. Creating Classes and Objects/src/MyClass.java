/*
Creating Classes

In order to create your own custom objects, you must first create the corresponding classes. This is accomplished by right clicking on the src folder in Eclipse and selecting Create->New->Class. Give your class a name and click Finish to add the new class to your project:
As you can see, Eclipse has already added the initial code for the class.
Now lets create a simple method in our new class.
Animal.java public class Animal {
  void bark() {
    System.out.println("Woof-Woof");
  }
}
We declared a bark() method in our Animal class.
Now, in order to use the class and it's methods, we need to declare an object of that class.

Let's head over to our main and create a new object of our class.
MyClass.java
class MyClass {
  public static void main(String[ ] args) {
    Animal dog = new Animal();
    dog.bark();
  }
}
// Outputs "Woof-Woof"

Now, dog is an object of type Animal. Thus we can call its bark() method, using the name of the object and a dot.
The dot notation is used to access the object's attributes and methods.
You have just created your first object!

 */
public class MyClass 
{
	public static void main(String[] args)
	{
		Animals dog = new Animals();
		dog.bark();
	}

}
