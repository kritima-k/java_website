package multidimensionalarrays;

import java.util.Scanner;

class RowColumnSum
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// Taking the number of rows and columns from the user
System.out.print("Enter number of rows: ");
int rows = sc.nextInt();

System.out.print("Enter number of columns: ");
int columns = sc.nextInt();

// Creating a 2D array to store the matrix
int[][] matrix = new int[rows][columns];

// Taking elements of the matrix from the user
System.out.println("Enter elements of the matrix:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
matrix[i][j] = sc.nextInt();
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

// Finding the sum of each row
for(int i = 0; i < rows; i++)
{
int rowSum = 0;

// Add all the elements present in the current row
for(int j = 0; j < columns; j++)
{
rowSum = rowSum + matrix[i][j];
}

System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
}

// Finding the sum of each column
for(int j = 0; j < columns; j++)
{
int columnSum = 0;

// Add all the elements present in the current column
for(int i = 0; i < rows; i++)
{
columnSum = columnSum + matrix[i][j];
}

System.out.println("Sum of column " + (j + 1) + ": " + columnSum);
}

sc.close();
}
}