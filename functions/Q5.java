package functions;
public class Q5
{
static void count(int num)
{
int count = 0;

while(num > 0)
{
int digit = num % 10;

if(digit == 2)
{
count++;
}
num = num / 10;
}
System.out.println("Number of 2s: "+count);
}

public static void main(String[] args)
{
count(12232);
}
}
