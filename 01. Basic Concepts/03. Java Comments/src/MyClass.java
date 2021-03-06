/*
Comments

The purpose of including comments in your code is to explain what the code is doing.
Java supports both single and multi-line comments. All characters that appear within a comment are ignored by the Java compiler.

A single-line comment starts with two forward slashes and continues until it reaches the end of the line.
For example:
// this is a single-line comment

Adding comments as you write code is a good practice, because they provide clarification and understanding when you need to refer back to it, as well as for others who might need to read it.

Multi-Line Comments

Java also supports comments that span multiple lines.
You start this type of comment with a forward slash followed by an asterisk, and end it with an asterisk followed by a forward slash.

Note that Java does not support nested multi-line comments.
However, you can nest single-line comments within multi-line comments. This is a single-line comment:

    // a single-line comment

Another name for a Multi-Line comment is a Block comment.

Documentation Comments

Documentation comments are special comments that have the appearance of multi-line comments, with the difference being that they generate external documentation of your source code. These begin with a forward slash followed by two asterisks, and end with an asterisk followed by a forward slash.
For example:
/** This is a documentation comment */

/** This is also a
    documentation comment */
//Javadoc is a tool which comes with JDK and it is used for generating Java code documentation in HTML format from Java source code which has required documentation in a predefined format.

//When a documentation comment begins with more than two asterisks, Javadoc assumes that you want to create a "box" around the comment in the source code. It simply ignores the extra asterisks.
//For example: 
/**********************

This is the start of a method

***********************/
//This will retain just the text "This is the start of a method" for the documentation.

//*/
public class MyClass {

	public static void main(String[] args) 
	{
		int x;
		x = 5; // a single-line comment after code

	}

}
