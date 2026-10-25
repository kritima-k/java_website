package oops_programs;

import java.util.ArrayList;

class Movie
{
String title;
String director;
ArrayList<String> actors = new ArrayList<>();
ArrayList<String> reviews = new ArrayList<>();

// Constructor to give movie details
Movie(String title, String director)
{
this.title = title;
this.director = director;
}

// This method adds an actor to the movie
void addActor(String actor)
{
actors.add(actor);
}

// This method adds a review to the movie
void addReview(String review)
{
reviews.add(review);

System.out.println("Review added.");
}

// This method shows all reviews
void getReviews()
{
System.out.println("Reviews:");

for(String review : reviews)
{
System.out.println(review);
}
}

// This method shows movie details
void displayMovie()
{
System.out.println("Title: " + title);
System.out.println("Director: " + director);

System.out.println("Actors:");

for(String actor : actors)
{
System.out.println(actor);
}
}
}

class MovieProgram
{
public static void main(String[] args)
{
// Create three movie objects
Movie movie1 = new Movie("Stranger Things", "Matt Duffer and Ross Duffer");
Movie movie2 = new Movie("Obsession", "Curry Barker");
Movie movie3 = new Movie("Spider-Man", "Sam Raimi");

// Add actors to Stranger Things
movie1.addActor("Millie Bobby Brown");
movie1.addActor("Finn Wolfhard");

// Add actors to Obsession

movie2.addActor("Michael Johnston");
movie2.addActor("Inde Navarrette");
movie2.addActor("Cooper Tomlinson");
movie2.addActor("Megan Lawless");
movie2.addActor("Andy Richter");
// Add actors to Spider-Man
movie3.addActor("Tobey Maguire");
movie3.addActor("Kirsten Dunst");

// Add reviews
movie1.addReview("Very interesting series.");
movie1.addReview("The story is amazing.");
movie2.addReview("Very interesting horror movie.");
movie2.addReview("The story is creepy and engaging.");
movie3.addReview("Amazing superhero movie.");
movie3.addReview("Very entertaining.");

// Display Stranger Things
movie1.displayMovie();
movie1.getReviews();

// Display Obsession
movie2.displayMovie();
movie2.getReviews();

// Display Spider-Man
movie3.displayMovie();
movie3.getReviews();
}
}

