package oops_programs;

// Program to add and remove books from a collection

class Book
{
// Attributes of Book
String title;
String author;
String ISBN;

// Constructor to initialize book details
Book(String title, String author, String ISBN)
{
this.title = title;
this.author = author;
this.ISBN = ISBN;
}

// Method to add a book to the collection
static int addBook(Book[] books, int count, Book book)
{
books[count] = book;
return count + 1;
}

// Method to remove a book using ISBN
static int removeBook(Book[] books, int count, String ISBN)
{
for(int i = 0; i < count; i++)
{
if(books[i].ISBN.equals(ISBN))
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

return count;
}

// Method to display all books
static void displayBooks(Book[] books, int count)
{
for(int i = 0; i < count; i++)
{
System.out.println("Title: " + books[i].title);
System.out.println("Author: " + books[i].author);
System.out.println("ISBN: " + books[i].ISBN);
System.out.println();
}
}

// Main method
public static void main(String[] st)
{
// Create an array to store books
Book[] books = new Book[3];

int count = 0;

// Create Book objects
Book B1 = new Book("Harry Potter", "J.K. Rowling", "101");
Book B2 = new Book("The Alchemist", "Paulo Coelho", "102");
Book B3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "103");
// Add books to the collection
count = addBook(books, count, B1);
count = addBook(books, count, B2);
count = addBook(books, count, B3);

// Display books after adding
System.out.println("Books after adding:");
displayBooks(books, count);

// Remove a book using ISBN
count = removeBook(books, count, "102");

// Display books after removing
System.out.println("Books after removing:");
displayBooks(books, count);
}
}