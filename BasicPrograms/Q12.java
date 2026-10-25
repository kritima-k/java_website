package BasicPrograms;

import java.util.Scanner;

// Program to count letters, spaces, numbers and other characters
class CountCharacters
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking string as input
System.out.println("Enter a string:");
String str = sc.nextLine();

int letters = 0;
int spaces = 0;
int numbers = 0;
int others = 0;

// counting different characters
for(int i = 0; i < str.length(); i++)
{
char ch = str.charAt(i);

if(Character.isLetter(ch))
{
letters++;
}
else if(Character.isDigit(ch))
{
numbers++;
}
else if(ch == ' ')
{
spaces++;
}
else
{
others++;
}
}

// displaying the counts
System.out.println("Letters = " + letters);
System.out.println("Spaces = " + spaces);
System.out.println("Numbers = " + numbers);
System.out.println("Other characters = " + others);

sc.close();
}
}