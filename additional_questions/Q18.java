package additional_questions;

class Sample
{
protected void finalize()
{
System.out.println("Finalize method called");
}
}

public class Q18
{
public static void main(String[] args)
{
Sample s = new Sample();
s = null;
System.gc();
}
}
