package multi_threading;

// thread to find the sum of prime numbers in the first half
class first extends Thread
{
int start;
int end;
int sum = 0;

// constructor to receive the starting and ending values
first(int start, int end)
{
this.start = start;
this.end = end;
}

// method to check whether a number is prime
boolean isPrime(int num)
{
if(num < 2)
{
return false;
}

for(int i = 2; i <= Math.sqrt(num); i++)
{
if(num % i == 0)
{
return false;
}
}

return true;
}

// run method calculates the sum of prime numbers
public void run()
{
for(int i = start; i <= end; i++)
{
if(isPrime(i))
{
sum = sum + i;
}
}
}
}

// thread to find the sum of prime numbers in the second half
class second extends Thread
{
int start;
int end;
int sum = 0;

// constructor to receive the starting and ending values
second(int start, int end)
{
this.start = start;
this.end = end;
}

// method to check whether a number is prime
boolean isPrime(int num)
{
if(num < 2)
{
return false;
}

for(int i = 2; i <= Math.sqrt(num); i++)
{
if(num % i == 0)
{
return false;
}
}

return true;
}

// run method calculates the sum of prime numbers
public void run()
{
for(int i = start; i <= end; i++)
{
if(isPrime(i))
{
sum = sum + i;
}
}
}
}

// main class
class prime_sum
{
public static void main(String[] args)
{
// setting the limit directly
int limit = 20;

// dividing the numbers into two parts
int middle = limit / 2;

// creating two threads
first t1 = new first(2, middle);
second t2 = new second(middle + 1, limit);

// starting both threads
t1.start();
t2.start();

try
{
// waiting for both threads to finish
t1.join();
t2.join();
}
catch(Exception e)
{
System.out.println(e);
}

// adding the sums calculated by both threads
int total = t1.sum + t2.sum;

// displaying the final sum
System.out.println("Sum of prime numbers up to " + limit + " = " + total);
}
}