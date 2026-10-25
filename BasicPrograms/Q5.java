package BasicPrograms;

import java.util.Scanner;

// Program to calculate the average of five numbers
class AverageOfFiveNumbers
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking input from the user 
System.out.println("Enter five numbers:");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
int e = sc.nextInt();

// calculating 
double average = (a + b + c + d + e) / 5.0;

// displaying average
System.out.println("Average = " + average);

sc.close();
}
}