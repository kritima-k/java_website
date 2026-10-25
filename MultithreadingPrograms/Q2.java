package multi_threading;

// thread to print even numbers
class even extends Thread
{
public void run()
{
// printing even numbers from 1 to 20
for(int i = 1; i <= 20; i++)
{
if(i % 2 == 0)
{
System.out.println("even " + i);
}
}
}
}

// thread to print odd numbers
class odd extends Thread
{
public void run()
{
// printing odd numbers from 1 to 20
for(int i = 1; i <= 20; i++)
{
if(i % 2 != 0)
{
System.out.println("odd " + i);
}
}
}
}

class evenodd
{
public static void main(String[] args)
{
// creating object of even and odd class
even e = new even();
odd o = new odd();

// starting both threads
e.start();
o.start();
}
}