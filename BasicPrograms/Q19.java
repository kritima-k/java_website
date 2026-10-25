package BasicPrograms;

import java.util.Scanner;

// Program to convert total seconds into hours, minutes and seconds
class SecondsToTime
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking total seconds as input
System.out.println("Enter seconds:");
int totalSeconds = sc.nextInt();

// calculating hours, minutes and remaining seconds
int hours = totalSeconds / 3600;
int minutes = (totalSeconds % 3600) / 60;
int seconds = totalSeconds % 60;

// displaying the converted time
System.out.println("Hours = " + hours);
System.out.println("Minutes = " + minutes);
System.out.println("Seconds = " + seconds);

sc.close();
}
}