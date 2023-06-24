/* **FUNCTION OVERLOADING**
Function overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
funtion overloading is one of the way that java implements polymorphism.
When an overloaded function is invoked, Java uses the type and/or number of arguments as its guide to determine which version of the overloaded 
method to actually called.When Java encounters a call to an overloaded method, it simply executes the version of the method whose parameters match 
the arguments used in the call.*/

public class Main
{
    static void test()
    {
        System.out.println ("no parameters");
    }
    static void test(int a)
    {
        System.out.println ("one integer parameter : "+a);
    }
    static void test(float a,float b)
    {
        System.out.println ("two float parameters : "+a+" and "+b);
    }
  public static void main (String[]args)
  {
    test();
    test(4);
    test(3.5f,6.7f);
  }
}

/* **ACCESS SPECIFIERS**
The accessibility members within a class in  a function or another class or sub-class can be apecified using the access specifiers.

Java provides the following access specifiers:
1.Public, which allows any class, or data-member or functions to be accessible by classes within that package and outside the package.

2.Private, which allows data-members or functions to be accessible only within that class, where it is a member.

3.Protected, which allows data-members or functions to be accessible by both classes and sub-classes within the same package,but when used in a 
different package allows accessibility only within sub-classes.

4.Default or freindly, which is the default accessibility, i.e., if a function or data-member is not preceded with public,protected or private, it is 
said to be having default access.*/

/* **THE MAIN METHOD** 
The main method, in general, is from where a program execution begins in Java. This is why main() is also called the driver function. */
