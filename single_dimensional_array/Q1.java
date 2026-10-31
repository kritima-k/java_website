
package single_dimensional_array;

class ArrayCopy
{
public static void main(String[] args)
{
 //this is first array
 int[] arr1 = {10, 20, 30, 40, 50};

//this is a new array . same size as arr1  but  right now it is empty 
int[] arr2 = new int[arr1.length];
  //going through each position of arr1 one by one
  //and putting the same value into arr2 at the same position
  for (int i = 0; i < arr1.length; i++)
  {
   arr2[i] = arr1[i];
   }

 //printing orignal array
  System.out.println("Original array:");
 for (int i = 0; i < arr1.length; i++)
   {
 System.out.println(arr1[i]);
 }

  //printing copied array
   System.out.println("Copied array:");
 for (int i = 0; i < arr2.length; i++)
   {
 System.out.println(arr2[i]);
  }
  }
}