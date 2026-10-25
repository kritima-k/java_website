package multidimensionalarrays;

import java.util.Scanner;

class MatrixSubtraction
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// Taking the number of rows and columns from the user
System.out.print("Enter number of rows: ");
int rows = sc.nextInt();

System.out.print("Enter number of columns: ");
int columns = sc.nextInt();

// Creating two matrices to store the values  entered by the user
int[][] matrix1 = new int[rows][columns];
int[][] matrix2 = new int[rows][columns];

// This matrix will store the subtraction result
int[][] difference = new int[rows][columns];

// Taking elements of the first matrix
System.out.println("Enter elements of first matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
matrix1[i][j] = sc.nextInt();
}
}

// Taking elements of the second matrix
System.out.println("Enter elements of second matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
matrix2[i][j] = sc.nextInt();
}
}

// Subtracting the corresponding elements
// of the second matrix from the first matrix
for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
difference[i][j] = matrix1[i][j] - matrix2[i][j];
}
}

// Displaying the first matrix
System.out.println("First matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
System.out.print(matrix1[i][j] + " ");
}

System.out.println();
}

// Displaying the second matrix
System.out.println("Second matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
System.out.print(matrix2[i][j] + " ");
}

System.out.println();
}

// Displaying the subtraction result
System.out.println("Subtraction of two matrices:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
System.out.print(difference[i][j] + " ");
}

System.out.println();
}

sc.close();
}
}