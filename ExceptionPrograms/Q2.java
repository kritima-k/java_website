package exception_handling;
//this class checks if a number is odd, and throws an error if it is
public class Q2
{
 //this method takes a number and throws an exception if it's odd
static void Q2(int num)
{
if(num %2 !=0)
{
throw new ArithmeticException("number " + num + " is odd not allowed");
}
System.out.println(num + " is even");
}
public static void main(String[] args) {
//try block calling the method that might throw an exception
try
{
Q2(7);  
//passing an odd num
}
//catch block catching the exception we manually threw above
catch (ArithmeticException e) 
{
System.out.println("Caught an error: " + e.getMessage());
}

}
}