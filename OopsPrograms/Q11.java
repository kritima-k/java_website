package oops_programs;

// Program to add and remove books from a library

class Library
{
// Array to store books
String[] books = new String[5];

// Variable to keep track of number of books
int count = 0;

// Method to add a book
void addBook(String book)
{
books[count] = book;
count++;
}

// Method to remove a book
void removeBook(String book)
{
for(int i = 0; i < count; i++)
{
if(books[i].equals(book))
{
for(int j = i; j < count - 1; j++)
{
books[j] = books[j + 1];
}

books[count - 1] = null;
count--;
break;
}
}
}

// Method to display all books
void displayBooks()
{
for(int i = 0; i < count; i++)
{
System.out.println(books[i]);
}
}

// Main method
public static void main(String[] st)
{
// Create a Library object
Library L = new Library();

// Add books to the library
L.addBook("Harry Potter");
L.addBook("The Alchemist");
L.addBook("The Great Gatsby");

// Display books after adding
System.out.println("Books in Library:");
L.displayBooks();

// Remove a book
L.removeBook("The Alchemist");

// Display books after removing
System.out.println();
System.out.println("Books after removing The Alchemist:");
L.displayBooks();
}
}