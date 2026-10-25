package multi_threading;

import java.util.Arrays;

// This thread is used to sort the first half of the array
class first extends Thread
{
int[] arr;

// Constructor to receive the array from the main program
first(int[] arr)
{
this.arr = arr;
}

// The run() method contains the work performed by this thread
public void run()
{
// Sorting the elements from the beginning up to the middle of the array
Arrays.sort(arr, 0, arr.length / 2);
}
}

// This thread is used to sort the second half of the array
class second extends Thread
{
int[] arr;

// Constructor to receive the same array from the main program
second(int[] arr)
{
this.arr = arr;
}

// The run() method contains the work performed by this thread
public void run()
{
// Sorting the elements from the middle up to the end of the array
Arrays.sort(arr, arr.length / 2, arr.length);
}
}

// Main class to create the array and start both threads
class sort_array
{
public static void main(String[] args)
{
// Creating an integer array with unsorted elements
int[] arr = {40, 10, 50, 20, 30, 60};

// Creating the first thread to sort the first half of the array
first t1 = new first(arr);

// Creating the second thread to sort the second half of the array
second t2 = new second(arr);

// Starting the first thread
t1.start();

// Starting the second thread
t2.start();

try
{
// Waiting for the first thread to complete its work
t1.join();

// Waiting for the second thread to complete its work
t2.join();
}
catch(Exception e)
{
// Displaying the exception if any problem occurs while waiting
System.out.println(e);
}

// Sorting the complete array after both threads have finished
Arrays.sort(arr);

// Displaying the final sorted array on the screen
System.out.println("Sorted array: " + Arrays.toString(arr));
}
}