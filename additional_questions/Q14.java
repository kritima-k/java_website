package additional_questions;
class area
{
// area of square 
void area (int s)
{
System.out.println("area of Square:"+(s*s));
}
// area of rectangle 
void area(int l , int b)
{
System.out.println("area of rectangle :"+(l*b)) ;   
}
// area of circle 
void area(double r)
{
System.out.println("area of circle"+(3.14*r*r));    
}    
}
public class Q14
{
public static void main(String[] args)    
{
area a = new area();
a.area(5);
a.area(2,4);
a.area(4);    
}
}

