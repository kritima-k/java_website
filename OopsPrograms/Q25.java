package oops_programs;

// This is the main class
class CommandLine
{
public static void main(String[] args)
{
// Display all command-line arguments
System.out.println("Command Line Arguments:");

for(int i = 0; i < args.length; i++)
{
System.out.println(args[i]);
}
}
}

