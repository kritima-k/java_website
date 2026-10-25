package multidimensionalarrays;

import java.util.Scanner;

class IdentityMatrix
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// Taking the number of rows and columns from the user
System.out.print("Enter number of rows: ");
int rows = sc.nextInt();

System.out.print("Enter number of columns: ");
int columns = sc.nextInt();


//All elements on the main diagonal are 1 andd all other elements are 0
if(rows != columns)
{
System.out.println("Matrix is not an identity matrix.");
return;
}

// Creating the matrix
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

// Initially we assume that the matrix is an identity matrix
boolean identity = true;

// Checking every element of the matrix
for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{

// If row number and column number are same,  the element should be 1
if(i == j)
{
if(matrix[i][j] != 1)
{
identity = false;
}
}

// For all other positions the element should be 0
else
{
if(matrix[i][j] != 0)
{
identity = false;
}
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

// Displaying the result
if(identity)
{
System.out.println("Matrix is an identity matrix.");
}
else
{
System.out.println("Matrix is not an identity matrix.");
}

sc.close();
}
}
