/* Invoking or Calling a Function : A Function can be called by simply writing the function name followed by the parameter-list within parenthesis.*/
public class Main
{
	static void Name() // void means that it is not going to return any value
	{
		System.out.println("Hello World");
	}
	public static void main(String[] args)
	{
	    Name();
	}
}
/* There are two methods by which a function can be called:
1. CALL BY VALUE: In this method of calling,a copy of the actual parameters goes to the formal parameters and then the values are manipulated.Thus, changes in the formal parameters is not reflected in the actual parameters.*/
public class    Main
{
    static void byvalue(int c)
    {
        c=15;
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        int org=6;
        System.out.println(org);
        byvalue(org);
        System.out.println(org);
    }
}
/*output
15
6
call by value is possible only when the parameters are of primitive or fundanental types, i.e.., it works only with byte,short,int,long,,float,double,boolean and char.
2. CALL BY REFERENCE : the formal parameters become a reference to the actual parameters and therefore any change made to the values of the formal parameters get reflected back in actual parameters.*/
public class Main
{
    static int value;
    static void byreference(Main aliasObject)
    {
        aliasObject.value=14;
        System.out.println(aliasObject.value);
    }
    public static void main(String[] args)
    {
        Main orgobject=new Main();
        orgobject.value=9;
        System.out.println(orgobject.value);
        byreference(orgobject);
        System.out.println(orgobject.value);
    }
}
/* Usually arrays and objects are used during call by reference.
Based on the operational side effects ,functions can be classified as:
(i) Pure Function: These are those functions that do not change the state of an object.
(ii) Impure Function: These are functions that changes the state of an object.*/

