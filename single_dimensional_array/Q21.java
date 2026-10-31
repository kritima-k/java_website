
package single_dimensional_array;

class RemoveDuplicates
{
public static void main(String[] args)
{
//original array with some duplicate numbers
int[] arr = {10, 20, 10, 30, 20, 40};

//temporary array to store unique elements  same size as original
int[] temp = new int[arr.length];
int j = 0;

//going through each number in the original array
for (int i = 0; i < arr.length; i++)
{
//checking if this number already exists in temp array
boolean found = false;
for (int k = 0; k < j; k++)
{
if (temp[k] == arr[i])
{
found = true;
}
}

//if not found in temp then  add it to temp array
if (!found)
{
temp[j] = arr[i];
j++;
}
}

//printing only elements which occured once 
System.out.println("Array after removing duplicates:");
for (int i = 0; i < j; i++)
{
System.out.println(temp[i]);
}
}
}