package StringPrograms;

class StringBufferFunctions 
{
printlnublic static void main(String[] args) {

 // creating an object of StringBuffer
 StringBuffer sb = new StringBuffer("Hello");
// using append() function
sb.append(" Java");
 System.out.println("After append: " + sb);

// using insert() function
 sb.insert(5, " World");
 System.out.println("After insert: " + sb);

// using delete() function
 sb.delete(5, 11);
System.out.println("After delete: " + sb);

 // using replace() function
sb.replace(6, 10, "World");
 System.out.println("After replace: " + sb);
}
}
