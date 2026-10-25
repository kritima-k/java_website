// program to create a thread 
package multi_threading ;
class hello_thread extends Thread 
{
public void run()
{
    // when thread will execute this will be display on the screen
System.out.println("hello world ");
 
}    
}

class thread_hello_world
{
public static void main(String[] args)
{
 // creating object of the thread 
hello_thread h1 = new hello_thread();
 h1.start();
}    
}