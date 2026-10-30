package additional_questions;
import java.util.Scanner;
public class Q5
{
public static void main(String[] args ) 
{
//creating scanner objects 
Scanner sc = new Scanner(System.in);

System.out.print("enter your name :");
String name = sc.nextLine();
System.out.println("Name: " + name);    
sc.close();
}   
}