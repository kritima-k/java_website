package multidimensionalarrays;

import java.util.Scanner;

class OddEvenFrequency
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// Taking the number of rows and columns from the user
System.out.print("Enter number of rows: ");
int rows = sc.nextInt();

System.out.print("Enter number of columns: ");
int columns = sc.nextInt();

// Creating a 2d  array to store the matrix
int[][] matrix = new int[rows][columns];

// Variables to count how many odd and even numbers are present
int even = 0;
int odd = 0;

// Taking the elements of the matrix from the user
System.out.println("Enter elements of the matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
matrix[i][j] = sc.nextInt();
}
}

// Checking every element of the matrix
for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
// If the remainder after dividing by 2 is 0,
// the number is even.
if(matrix[i][j] % 2 == 0)
{
even++;
}
else
{
// If the number is not divisible by 2 it is odd.
odd++;
}
}
}

// Displaying the matrix
System.out.println("The matrix is:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
System.out.print(matrix[i][j] + " ");
}

System.out.println();
}

// Displaying the frequency of even and odd numbers
System.out.println("Frequency of even numbers: " + even);
System.out.println("Frequency of odd numbers: " + odd);

sc.close();
}
}