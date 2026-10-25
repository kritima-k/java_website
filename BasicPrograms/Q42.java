package BasicPrograms;

import java.util.Scanner;

// Program to check whether a character is vowel or consonant
class VowelConsonant
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking character as input
System.out.println("Enter a character:");
char ch = sc.next().charAt(0);

// checking vowel or consonant
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
{
System.out.println("Vowel");
}
else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
{
System.out.println("Consonant");
}
else
{
System.out.println("Not an alphabet");
}

sc.close();
}
}