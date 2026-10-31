
package single_dimensional_array;

class FreqCount
{
public static void main(String[] args)
{
//array with some repeated numbers
int[] arr = {10, 20, 10, 30, 20, 10};

//going through each number one by one using for loop
for (int i = 0; i < arr.length; i++)
{
//checking if this number was already counted before
boolean alreadyCounted = false;
for (int k = 0; k < i; k++)
{
if (arr[k] == arr[i])
{
alreadyCounted = true;
}
}

//if already counted, skip it
if (alreadyCounted)
{
continue;
}

//counting how many times this number appears
int count = 0;
for (int j = 0; j < arr.length; j++)
{
if (arr[j] == arr[i])
{
count++;
}
}

//printing the number and its count
System.out.println(arr[i] + " occurs " + count + " times");
}
}
}