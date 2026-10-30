package additional_questions ;
class p
{
void display()
{
System.out.println("this is a parent class");  
}    
}

class c extends p
{
void show()
{
System.out.println("this is child class");
}    
}

public class Q26
{
public static void main(String[] args)
{
c c1 = new c();
c1.display();
c1.show();    
}    
}


