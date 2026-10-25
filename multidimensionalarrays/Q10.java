package multidimensionalarrays;

import java.util.Scanner;

class MatrixTranspose
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// Taking the number of rows and columns from the user
System.out.print("Enter number of rows: ");
int rows = sc.nextInt();

System.out.print("Enter number of columns: ");
int columns = sc.nextInt();

// Creating the original matrix
int[][] matrix = new int[rows][columns];

// Creating another matrix to store the transpose
// In transpose, rows become columns and columns become rows
int[][] transpose = new int[columns][rows];

// Taking elements of the original matrix
System.out.println("Enter elements of the matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
matrix[i][j] = sc.nextInt();
}
}
//transpose means rows is changed into columns and columns is changed into rows 
for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
transpose[j][i] = matrix[i][j];
}
}

// Displaying the original matrix
System.out.println("The matrix is:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
System.out.print(matrix[i][j] + " ");
}

System.out.println();
}

// Displaying the transpose
System.out.println("Transpose of the matrix:");

for(int i = 0; i < columns; i++)
{
for(int j = 0; j < rows; j++)
{
System.out.print(transpose[i][j] + " ");
}

System.out.println();
}

sc.close();
}
}