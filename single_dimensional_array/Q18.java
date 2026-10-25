
package single_dimensional_array;

class FindLargest
{
public static void main(String[] args)
{
//array with some numbers
int[] arr = {10, 50, 30, 20, 40};

//assuming the first element is the largest to start with
int largest = arr[0];

//comparing every element with the current largest
for (int i = 1; i < arr.length; i++)
{
if (arr[i] > largest)
{
largest = arr[i];
}
}

System.out.println("Largest element is " + largest);
}
}