package additional_questions;
class static_var
{
static int count = 0 ;
static_var()
{
count ++ ;    
}
static void display()
{
System.out.println("Count: " + count);
}
}
public class Q15 
{


public static void main(String[] args)
{
static_var s1 = new  static_var();
static_var s2 = new  static_var();
static_var s3 = new  static_var();
static_var.display();
}
}