package multidimensionalarrays;

import java.util.Scanner;

class MatrixMultiplication
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// Taking the size of the first matrix
System.out.print("Enter rows of first matrix: ");
int rows1 = sc.nextInt();

System.out.print("Enter columns of first matrix: ");
int columns1 = sc.nextInt();

// Taking the size of the second matrix
System.out.print("Enter rows of second matrix: ");
int rows2 = sc.nextInt();

System.out.print("Enter columns of second matrix: ");
int columns2 = sc.nextInt();

// Matrix multiplication is possible only when columns of the first matrix are equal to rows of the second matrix
if(columns1 != rows2)
{
System.out.println("Matrix multiplication is not possible.");
return;
}

// Creating the two matrices
int[][] matrix1 = new int[rows1][columns1];
int[][] matrix2 = new int[rows2][columns2];

// Creating a matrix to store the multiplication result
int[][] result = new int[rows1][columns2];

// Taking elements of the first matrix
System.out.println("Enter elements of first matrix:");

for(int i = 0; i < rows1; i++)
{
for(int j = 0; j < columns1; j++)
{
matrix1[i][j] = sc.nextInt();
}
}

// Taking elements of the second matrix
System.out.println("Enter elements of second matrix:");

for(int i = 0; i < rows2; i++)
{
for(int j = 0; j < columns2; j++)
{
matrix2[i][j] = sc.nextInt();
}
}

// here we are  Multiplying the two matrices
// We use three loops because multiplication involves  rows of the first matrix, columns of the second matrix, and the elements used for multiplication.
for(int i = 0; i < rows1; i++)
{
for(int j = 0; j < columns2; j++)
{
for(int k = 0; k < columns1; k++)
{
result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
}
}
}

// Displaying the first matrix
System.out.println("First matrix:");

for(int i = 0; i < rows1; i++)
{
for(int j = 0; j < columns1; j++)
{
System.out.print(matrix1[i][j] + " ");
}

System.out.println();
}

// Displaying the second matrix
System.out.println("Second matrix:");

for(int i = 0; i < rows2; i++)
{
for(int j = 0; j < columns2; j++)
{
System.out.print(matrix2[i][j] + " ");
}

System.out.println();
}

// Displaying the multiplication result
System.out.println("Multiplication of two matrices:");

for(int i = 0; i < rows1; i++)
{
for(int j = 0; j < columns2; j++)
{
System.out.print(result[i][j] + " ");
}

System.out.println();
}

sc.close();
}
}