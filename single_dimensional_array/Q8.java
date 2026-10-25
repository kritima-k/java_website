
package single_dimensional_array;

class OddPosition
{
public static void main(String[] args)
{
//array with some numbers
int[] arr = {10, 20, 30, 40, 50};

//going through each index and checking if the index is odd
for (int i = 0; i < arr.length; i++)
{
if (i % 2 != 0)
{
System.out.println(arr[i]);
}
}
}
}