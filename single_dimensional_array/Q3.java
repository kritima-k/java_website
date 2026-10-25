
package single_dimensional_array;

class LeftRotate
{
public static void main(String[] args)
{
//original array
int[] arr = {10, 20, 30, 40, 50};

//saving the first element before it gets overwritten
int first = arr[0];

//shifting every element one position to the left
for (int i = 0; i < arr.length - 1; i++)
{
arr[i] = arr[i + 1];
}

//putting the saved first element at the last position
arr[arr.length - 1] = first;

//printing the rotated array
for (int i = 0; i < arr.length; i++)
{
System.out.println(arr[i]);
}
}
}