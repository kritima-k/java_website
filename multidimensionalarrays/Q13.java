package multidimensionalarrays;

import java.util.Scanner;
//A sparse matrix is a matrix in which most of the elements are 0 .
class SparseMatrix
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// Taking the number of rows and columns from the user
System.out.print("Enter number of rows: ");
int rows = sc.nextInt();

System.out.print("Enter number of columns: ");
int columns = sc.nextInt();

// Creating the matrix
int[][] matrix = new int[rows][columns];

// Variable to count the number of zero elements
int zero = 0;

// Taking elements of the matrix from the user
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
// If the element is 0  increase the zero count
if(matrix[i][j] == 0)
{
zero++;
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

// Checking whether the matrix is sparse
int total = rows * columns;

if(zero > total / 2)
{
System.out.println("Matrix is a sparse matrix.");
}
else
{
System.out.println("Matrix is not a sparse matrix.");
}

sc.close();
}
}

