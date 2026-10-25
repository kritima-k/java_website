package multi_threading;

import java.net.URL;
import java.net.HttpURLConnection;

// thread used to crawl one website
class website_thread extends Thread
{
String website;

// constructor to receive the website address
website_thread(String website)
{
this.website = website;
}

// run method performs the crawling work
public void run()
{
try
{
// creating a URL object for the website
URL url = new URL(website);

// opening a connection with the website
HttpURLConnection connection = (HttpURLConnection) url.openConnection();

// setting the request method
connection.setRequestMethod("GET");

// connecting to the website
connection.connect();

// getting the response code
int code = connection.getResponseCode();

// displaying the website and response code
System.out.println(website + " - Response Code: " + code);

// closing the connection
connection.disconnect();
}
catch(Exception e)
{
// displaying an error if the website cannot be accessed
System.out.println(website + " - Unable to access website");
}
}
}

// main class
class web_crawler
{
public static void main(String[] args)
{
// creating threads for different websites
website_thread t1 = new website_thread("https://www.google.com");
website_thread t2 = new website_thread("https://www.wikipedia.org");
website_thread t3 = new website_thread("https://www.github.com");

// starting all threads
t1.start();
t2.start();
t3.start();

try
{
// waiting for all threads to finish
t1.join();
t2.join();
t3.join();
}
catch(Exception e)
{
System.out.println(e);
}

// displaying completion message
System.out.println("Web crawling completed.");
}
}