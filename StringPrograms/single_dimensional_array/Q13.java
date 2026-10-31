
package single_dimensional_array;

class RightRotate
{
public static void main(String[] args)
{
//original array
int[] arr = {10, 20, 30, 40, 50};

//saving the last element before it gets overwritten
int last = arr[arr.length - 1];

//shifting every element one position to the right, starting from the end
for (int i = arr.length - 1; i > 0; i--)
{
arr[i] = arr[i - 1];
}

//putting the saved last element at the first position
arr[0] = last;

//printing the rotated array
for (int i = 0; i < arr.length; i++)
{
System.out.println(arr[i]);
}
}
}