package StringPrograms ;
import java.util.Scanner ;
class check_digits 
{
public static void main(String[] args ) 
{
//creating object of scanner class    
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
// using matches function it checks whether it matches the expression
if(str.matches("[0-9]+"))
{
System.out.println("string contain only digits ");
}
else 
{
System.out.println("string does not contain  only digits") ;   
}   
sc.close();
}   
}