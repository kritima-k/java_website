package BasicPrograms;

import java.util.Scanner;
class SumOfNumberPattern
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking an integer as input
System.out.println("Enter a number:");
int n = sc.nextInt();

// calculating n, nn and nnn
int nn = n * 10 + n;
int nnn = n * 100 + n * 10 + n;

int sum = n + nn + nnn;

// displaying the result
System.out.println("Sum = " + sum);

sc.close();
}
}