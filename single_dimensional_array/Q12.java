
package single_dimensional_array;

class SumElements
{
public static void main(String[] args)
{
//array with some numbers
int[] arr = {10, 20, 30, 40, 50};

//starting sum at 0
int sum = 0;

//adding each element to sum one by one
for (int i = 0; i < arr.length; i++)
{
sum = sum + arr[i];
}

System.out.println("Sum of array elements: " + sum);
}
}