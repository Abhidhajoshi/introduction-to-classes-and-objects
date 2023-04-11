/*Function is a block of code , which contains executable instructions. we need method because it resuce complexity , provide simple interface and is reusable.
SYNTAX: [<access specifier>][<modifier>]return-type function-name ([<parameter-list>])
        { body of the method} , where access specifier  can be public,protedted and private or static.
for eg:*/
public class Main
{
	public static void main(String[] args){  // this is a function having public as access specifier
		System.out.println("Hello World");
	}
}
/*static is used to specify that the method belongs to class and not the instance of it.
Function calling: if a function is defined earlier and we need that block of code in our program at any point of time we can use the feature of function calling. following example tells us the concept of function calling*/
class Main
{
    static void sum(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("Sum= "+c);
    }
    public static void main(String[] args)
    {
        sum(10,9); // function calling
    }
}
/*Depending upon what value a function is going to return, Java functions can be classified under the following three categories:
1. Computational Functions : These functions return a computed or calculated result . for example Math.pow()
2. Manipulative Functions: These functions manipulate a value and return a success or a failure code.for example equals() check whether two Strings are same or not.
3. Procedural Functions: These functions perform an action but don't have any explicit return value,void is used to indicate this type of function .void tells the compiler that no value is going to return. 
FORMAL and ACTUAL parameters: formal parameters are group of variables and its datatypes that is used to identify what data is to be passed to the function. ACTUAL parameter refers to the actual values that are being passed to the function.compiler checks with the compatibility of the actual argument list with the formal parameter.*/
class Main
{
    static void show(int a,int b)//formal parameters
    {
        System.out.println(a+" "+b);
    }
    public static void main(String[] args)
    {
        int c=5;
        int d=15;
        show(c,d);// actual parameters
    }
}
/* Funtion signature and Function Prototype 
Function prototype refers to the return type,function name and the parameter list.
Function signature on the hand refers to the parameter list,i.e., the data types that comprise the parameter list,the number of variables and their order.
The Return type is responsible for specifying what type of data the function is going to return back.*/
public class Main
{
    static float average(int a,int b)
    {
        float d;
        d=(float) (a+b)/2;
        return d;
    }
    public static void main(String[] args)
    {
        float c;
        c=average(12,3);
        System.out.println("Average ="+c);
    }
}
