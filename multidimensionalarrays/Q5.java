package multidimensionalarrays;

import java.util.Scanner;

class MatrixEquality
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// Taking rows and columns for the first matrix
System.out.print("Enter rows of first matrix: ");
int rows1 = sc.nextInt();

System.out.print("Enter columns of first matrix: ");
int columns1 = sc.nextInt();

// Taking rows and columns for the second matrix
System.out.print("Enter rows of second matrix: ");
int rows2 = sc.nextInt();

System.out.print("Enter columns of second matrix: ");
int columns2 = sc.nextInt();

// If the size of both matrices is different they cannot be equal.
if(rows1 != rows2 || columns1 != columns2)
{
System.out.println("Matrices are not equal.");
return;
}

// Creating the two matrices
int[][] matrix1 = new int[rows1][columns1];
int[][] matrix2 = new int[rows2][columns2];

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

// Initially we assume that both matrices are equal
boolean equal = true;

// Compare every element of both matrices
for(int i = 0; i < rows1; i++)
{
for(int j = 0; j < columns1; j++)
{
if(matrix1[i][j] != matrix2[i][j])
{
// If even one element is diff the matrices are not equal
equal = false;
break;
}
}

// Stop checking further rows if matrices are already different
if(equal == false)
{
break;
}
}

// Displaying the result
if(equal)
{
System.out.println("Matrices are equal.");
}
else
{
System.out.println("Matrices are not equal.");
}

sc.close();
}
}