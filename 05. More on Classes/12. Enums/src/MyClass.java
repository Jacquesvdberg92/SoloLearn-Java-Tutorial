/*
Enums

An Enum is a special type used to define collections of constants.
Here is a simple Enum example: enum Rank {
  SOLDIER,
  SERGEANT,
  CAPTAIN
}
Note that the values are comma-separated.
You can refer to the constants in the enum above with the dot syntax. Rank a = Rank.SOLDIER;
Basically, Enums define variables that represent members of a fixed set.

After declaring an Enum, we can check for the corresponding values with, for example, a switch statement.
Rank a = Rank.SOLDIER;

switch(a) {
  case SOLDIER:
    System.out.println("Soldier says hi!");
    break;
  case SERGEANT:
    System.out.println("Sergeant says Hello!");
  break;
  case CAPTAIN:
    System.out.println("Captain says Welcome!");
    break;
}
//Outputs "Soldier says hi!"

Enums

You should always use Enums when a variable (especially a method parameter) can only take one out of a small set of possible values.
If you use Enums instead of integers (or String codes), you increase compile-time checking and avoid errors from passing in invalid constants, and you document which values are legal to use.
Some sample Enum uses include month names, days of the week, deck of cards, etc.

 */
public class MyClass {
	
	enum Rank 
	{
		  SOLDIER,
		  SERGEANT,
		  CAPTAIN
	}

	public static void main(String[] args) 
	{
		Rank a = Rank.SOLDIER;

		switch(a) {
		  case SOLDIER:
		    System.out.println("Soldier says hi!");
		    break;
		  case SERGEANT:
		    System.out.println("Sergeant says Hello!");
		  break;
		  case CAPTAIN:
		    System.out.println("Captain says Welcome!");
		    break;
		}

	}

}
