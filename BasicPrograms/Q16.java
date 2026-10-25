package BasicPrograms;

// Program to find and display all odd numbers between 1 and 20
class OddNumbers
{
public static void main(String[] args)
{
// loop runs from 1 to 20 to check each number
for(int i = 1; i <= 20; i++)
{
// a number is odd when its remainder after division by 2 is not zero
if(i % 2 != 0)
{
// printing the number if it is odd
System.out.println(i);
}
}
}
}