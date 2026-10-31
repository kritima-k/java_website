
package single_dimensional_array;

class ThirdLargest
{
public static void main(String[] args)
{
//original array
int[] arr = {50, 20, 40, 10, 30};

//sorting the array first, in descending order
for (int i = 0; i < arr.length - 1; i++)
{
for (int j = 0; j < arr.length - 1 - i; j++)
{
if (arr[j] < arr[j + 1])
{
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}

//after sorting in descending order, the 3rd position holds the 3rd largest
System.out.println("3rd largest element is " + arr[2]);
}
}