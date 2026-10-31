
package single_dimensional_array;

class FindSmallest
{
public static void main(String[] args)
{
//array with some numbers
int[] arr = {10, 50, 30, 20, 40};

//assuming the first element is the smallest to start with
int smallest = arr[0];

//comparing every element with the current smallest
for (int i = 1; i < arr.length; i++)
{
if (arr[i] < smallest)
{
smallest = arr[i];
}
}

System.out.println("Smallest element is " + smallest);
}
}