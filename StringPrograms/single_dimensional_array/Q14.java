
package single_dimensional_array;

class SortAscending
{
public static void main(String[] args)
{
//original array
int[] arr = {50, 20, 40, 10, 30};

//outer loop  is used to controls how many passes we make
for (int i = 0; i < arr.length - 1; i++)
{
//inner loop compares adjacent elements
for (int j = 0; j < arr.length - 1 - i; j++)
{
//if current element is bigger than next one then  swap them
if (arr[j] > arr[j + 1])
{
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}

//printing sorted array
for (int i = 0; i < arr.length; i++)
{
System.out.println(arr[i]);
}
}
}