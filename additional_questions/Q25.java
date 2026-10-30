package additional_questions ;
public class Q25
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("hello");
System.out.println("orignal string :"+ sb);
sb.append("world");
System.out.println("After append: " + sb);
sb.insert(5, " Java");
System.out.println("After insert: " + sb);
sb.delete(5, 10);
System.out.println("After delete: " + sb);
}
}
