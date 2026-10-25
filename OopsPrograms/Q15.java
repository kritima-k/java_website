package oops_programs;

import java.util.ArrayList;

class MusicLibrary
{
ArrayList<String> songs = new ArrayList<>();

// This method adds a new song to the music library
void addSong(String song)
{
songs.add(song);

System.out.println(song + " added to Music Library.");
}

// This method removes a song from the music library
void removeSong(String song)
{
if(songs.remove(song))
{
System.out.println(song + " removed from Music Library.");
}
else
{
System.out.println(song + " not found.");
}
}

// This method shows all the songs in the library
void displaySongs()
{
System.out.println("Songs in Music Library:");

for(String song : songs)
{
System.out.println(song);
}
}

// This method plays one random song
void playRandomSong()
{
int index = (int)(Math.random() * songs.size());

System.out.println("Now playing: " + songs.get(index));
}
}

class MusicLibraryProgram
{
public static void main(String[] args)
{
// Create a music library
MusicLibrary music = new MusicLibrary();

// Add songs to the library
music.addSong("Paper Rings");
music.addSong("Perfect");
music.addSong("Until I Found You");

// Display all songs
music.displaySongs();

// Remove a song
music.removeSong("Perfect");

// Display the updated list
music.displaySongs();

// Play a random song
music.playRandomSong();
}
}

