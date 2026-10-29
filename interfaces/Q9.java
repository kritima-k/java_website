package interfaces;
interface Searchable
{
void search(String keyword);
}

class Document implements Searchable 
{
public void search(String keyword) 
{
System.out.println("Searching for \"" + keyword + "\" inside a document.");
}
}

class WebPage implements Searchable 
{
public void search(String keyword) 
{
System.out.println("Searching for \"" + keyword + "\" inside a web page.");
}
}

class SearchableInterface {
public static void main(String[] args)
{
Searchable doc = new Document();
Searchable page = new WebPage();

doc.search("java");
page.search("java");
}
}