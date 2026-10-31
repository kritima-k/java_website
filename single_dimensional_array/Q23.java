
package single_dimensional_array;

import java.util.Arrays;

class BuiltInSort
{
public static void main(String[] args)
{
//original array
int[] arr = {50, 20, 40, 10, 30};

//Arrays.sort sorts the array in ascending order automatically
Arrays.sort(arr);

//printing sorted array
for (int i = 0; i < arr.length; i++)
{
System.out.println(arr[i]);
}
}
}