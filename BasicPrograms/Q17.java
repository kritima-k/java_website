package BasicPrograms;

// Program to find and display all even numbers between 1 and 20
class EvenNumbers
{
public static void main(String[] args)
{
// loop runs from 1 to 20 to check each number
for(int i = 1; i <= 20; i++)
{
if(i % 2 == 0)
{
// printing the number if it is even
System.out.println(i);
}
}
}
}