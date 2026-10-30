package additional_questions ;

interface Printable
{
void print();
}

interface Showable
{
void show();
}

public class Q30 implements Printable, Showable
{
public void print()
{
System.out.println("This is printable interface");
}

public void show()
{
System.out.println("This is showable interface");
}

public static void main(String[] args)
{
Q30 obj = new Q30();
obj.print();
obj.show();
}
}


