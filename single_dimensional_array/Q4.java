package single_dimensional_array;
class PrintDuplicates
{
public static void main(String[] args)
{
//array with some duplicate numbers
int[] arr = {10, 20, 10, 30, 20, 40};
//checking each element one by one using for loop
for (int i = 0; i < arr.length; i++)
{
//checking if the same element appears again
for (int j = i + 1; j < arr.length; j++)
{
if (arr[i] == arr[j])
{
//printing the duplicate element
System.out.println(arr[i]);
break;
}
}
}
}
}