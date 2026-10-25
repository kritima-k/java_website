package BasicPrograms;

import java.util.Arrays;

// Program to swap the first and last elements of an array
class SwapFirstLastElements
{
public static void main(String[] args)
{
// creating an array
int[] arr = {10, 20, 30, 40, 50};

// creating a new array with the same elements
int[] newArray = arr.clone();

// swapping the first and last elements
int temp = newArray[0];
newArray[0] = newArray[newArray.length - 1];
newArray[newArray.length - 1] = temp;

// displaying the new array
System.out.println("New array after swapping: " + Arrays.toString(newArray));
}
}