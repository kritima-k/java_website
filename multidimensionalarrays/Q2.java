package multidimensionalarrays;

import java.util.Scanner;

class MatrixAddition
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// Taking rows and columns from the user
System.out.print("Enter number of rows: ");
int rows = sc.nextInt();

System.out.print("Enter number of columns: ");
int columns = sc.nextInt();

// Making three matrices.
// matrix1 and matrix2 will store the values entered by the user.
// sum will store the answer after adding both matrices.
int[][] matrix1 = new int[rows][columns];
int[][] matrix2 = new int[rows][columns];
int[][] sum = new int[rows][columns];

// Taking values for the first matrix
System.out.println("Enter elements of first matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
matrix1[i][j] = sc.nextInt();
}
}

// Taking values for the second matrix
System.out.println("Enter elements of second matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
matrix2[i][j] = sc.nextInt();
}
}

// Adding the corresponding elements of both matrices
// For example, first element of matrix1 is added
// with the first element of matrix2.
for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
sum[i][j] = matrix1[i][j] + matrix2[i][j];
}
}

// Printing the first matrix
System.out.println("First matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
System.out.print(matrix1[i][j] + " ");
}

System.out.println();
}

// Printing the second matrix
System.out.println("Second matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
System.out.print(matrix2[i][j] + " ");
}

System.out.println();
}

// Printing the  sum of matrix
System.out.println("Sum of two matrices:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
System.out.print(sum[i][j] + " ");
}

System.out.println();
}

sc.close();
}
}