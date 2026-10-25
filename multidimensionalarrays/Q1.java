package multidimensionalarrays ;

//We import java.util.Scanner because Scanner is a Java class that allows us to take input from the user through the keyboard.
import java.util.Scanner;

 class MatrixInput
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// it  Ask the user to enter the number of rows
System.out.print("Enter number of rows: ");
int rows = sc.nextInt();

// Ask the user to enter the number of columns
System.out.print("Enter number of columns: ");
int columns = sc.nextInt();

// Create a two-dimensional array 
// The first size represents the number of rows
// The second size represents the number of columns
int[][] matrix = new int[rows][columns];

// Take the elements of the matrix from the user
System.out.println("Enter the elements of the matrix:");
for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
// Store the number entered by the user
// at the current row and column
matrix[i][j] = sc.nextInt();
}
}

// Display the matrix
System.out.println("The matrix is:");

for(int i = 0; i < rows; i++)
{
for(int j = 0; j < columns; j++)
{
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}

// Close the Scanner
sc.close();
}
}