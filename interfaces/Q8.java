package interfaces;

// Playable says any class implementing it must have a way to be played
interface Playable {
void play();
}

class Football implements Playable {
public void play() {
System.out.println("Playing football, kicking the ball into the goal.");
}
}

class Volleyball implements Playable {
public void play() {
System.out.println("Playing volleyball, hitting the ball over the net.");
}
}

class Basketball implements Playable {
public void play() {
System.out.println("Playing basketball, shooting hoops.");
}
}

 class PlayableInterface{
public static void main(String[] args) {
Playable football = new Football();
Playable volleyball = new Volleyball();
Playable basketball = new Basketball();

football.play();
volleyball.play();
basketball.play();
}
}