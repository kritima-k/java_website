package BasicPrograms;

// Program to calculate the sum of the first 100 prime numbers
class SumOfFirst100Primes
{
public static void main(String[] args)
{
int count = 0;
int number = 2;
int sum = 0;

// checking numbers until 100 prime numbers are found
while(count < 100)
{
int factors = 0;

// checking whether the number is prime
for(int i = 1; i <= number; i++)
{
if(number % i == 0)
{
factors++;
}
}

// adding the number if it is prime
if(factors == 2)
{
sum = sum + number;
count++;
}

number++;
}

// displaying the sum of first 100 prime numbers
System.out.println("Sum of first 100 prime numbers = " + sum);
}
}