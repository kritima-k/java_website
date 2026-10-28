```java
package StringPrograms;

import java.util.Scanner;

class Duplicate
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
// taking a string
System.out.println("Enter a string:");
 String str = sc.nextLine();
 // converting string to lowercase
 str = str.toLowerCase();
// splitting string into words
 String[] words = str.split("\\s+");
 // checking duplicate words
System.out.println("Duplicate words:");

for (int i = 0; i < words.length; i++) {
int count = 0;
 // counting occurrences of each word
for (int j = 0; j < words.length; j++)
{
if (words[i].equals(words[j])) 
{
count++;
}
}
// printing each duplicate word only once
if (count > 1 && i == firstIndex(words, words[i])) 
{
System.out.println(words[i] + " = " + count);
}
}

 sc.close();
    }
// finding the first occurrence of a word
static int firstIndex(String[] words, String word) {
for (int i = 0; i < words.length; i++) {
if (words[i].equals(word)) 
{
return i;
}
}
return -1;
}
}
.