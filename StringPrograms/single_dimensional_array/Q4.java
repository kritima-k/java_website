
package single_dimensional_array;

class DuplicatePrint
{
public static void main(String[] args)
{
//array with some duplicate numbers
int[] arr = {10, 20, 10, 30, 20, 40};

System.out.println("Duplicate elements:");

//going through each number one by one using for loop
for (int i = 0; i < arr.length; i++)
{
//checking if this number appeared before the current position
for (int j = 0; j < i; j++)
{
if (arr[i] == arr[j])
{
System.out.println(arr[i]);
break;
}
}
}
}
}