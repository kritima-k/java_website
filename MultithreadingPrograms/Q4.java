package multi_threading;

// thread to calculate each row of the result matrix
class matrix_thread extends Thread
{
int[][] a;
int[][] b;
int[][] result;
int row;

// constructor to receive matrices and row number
matrix_thread(int[][] a, int[][] b, int[][] result, int row)
{
this.a = a;
this.b = b;
this.result = result;
this.row = row;
}

// run() method performs multiplication for one row
public void run()
{
// calculating each element of the selected row
for(int j = 0; j < b[0].length; j++)
{
for(int k = 0; k < b.length; k++)
{
result[row][j] = result[row][j] + a[row][k] * b[k][j];
}
}
}
}

// main class to perform matrix multiplication
class matrix_multiplication
{
public static void main(String[] args)
{
// first matrix
int[][] a = {
{1, 2},
{3, 4}
};

// second matrix
int[][] b = {
{5, 6},
{7, 8}
};

// creating result matrix
int[][] result = new int[2][2];

// creating one thread for each row
matrix_thread t1 = new matrix_thread(a, b, result, 0);
matrix_thread t2 = new matrix_thread(a, b, result, 1);

// starting both threads
t1.start();
t2.start();

try
{
// waiting for both threads to complete
t1.join();
t2.join();
}
catch(Exception e)
{
System.out.println(e);
}

// displaying the result matrix
System.out.println("Result of matrix multiplication:");

for(int i = 0; i < result.length; i++)
{
for(int j = 0; j < result[i].length; j++)
{
System.out.print(result[i][j] + " ");
}
System.out.println();
}
}
}