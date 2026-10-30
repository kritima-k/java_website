//declaring package 
package mypack;

//first default class
class student 
{
String name;
student (String name )
{
    this.name=name;
}

void display()
{
    System.out.println("student name "+name);
}
}

//second default class
class teacher 
{
    String subject ;
    teacher( String subject)
    {
        this.subject = subject;
    }

    void display()
    {
        System.out.println("teacher subject "+ subject);
    }
}

class Q5
{
    public static void main(String[] args)
    {
        //creating student object and calling display
        student s1 = new student("vanshika");
        s1.display();

        //creating teacher object and calling display
        teacher t1 = new teacher("java");
        t1.display();
    }

}
 //output 
 PS C:\Users\Kritima\OneDrive\Desktop\java_programs\packages> javac mypack/Q5.java
PS C:\Users\Kritima\OneDrive\Desktop\java_programs\packages> java mypack.Q5
student name vanshika
teacher subject java
PS C:\Users\Kritima\OneDrive\Desktop\java_programs\packages> 