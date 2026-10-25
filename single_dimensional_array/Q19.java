
package single_dimensional_array;

class SecondSmallest
{
public static void main(String[] args)
{
//original array
int[] arr = {50, 20, 40, 10, 30};

//sorting the array first ascending order
for (int i = 0; i < arr.length - 1; i++)
{
for (int j = 0; j < arr.length - 1 - i; j++)
{
if (arr[j] > arr[j + 1])
{
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}

//after sorting in ascending order then the 2nd position holds the 2nd smallest
System.out.println("2nd smallest element is " + arr[1]);
}
}