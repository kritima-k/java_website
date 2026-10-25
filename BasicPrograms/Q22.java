package BasicPrograms;

import java.util.Scanner;

// Program to count the number of even and odd elements in an array
class CountEvenOddElements
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking the size of array as input
System.out.println("Enter the size of array:");
int n = sc.nextInt();

int[] arr = new int[n];
int even = 0;
int odd = 0;

// taking array elements as input
System.out.println("Enter array elements:");
for(int i = 0; i < n; i++)
{
arr[i] = sc.nextInt();
}

// checking each element to count even and odd numbers
for(int i = 0; i < n; i++)
{
if(arr[i] % 2 == 0)
{
even++;
}
else
{
odd++;
}
}

// displaying the count of even and odd elements
System.out.println("Number of even elements = " + even);
System.out.println("Number of odd elements = " + odd);

sc.close();
}
}