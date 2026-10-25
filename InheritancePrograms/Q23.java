package inheritance;

// abstract class saying every instrument must support play and tune
abstract class Instrument {
abstract void play();
abstract void tune();
}

class Glockenspiel extends Instrument {
void play() {
System.out.println("Glockenspiel plays a bright metallic sound.");
}

void tune() {
System.out.println("Glockenspiel is tuned by adjusting the bars.");
}
}

class Violin extends Instrument {
void play() {
System.out.println("Violin plays with a bow across strings.");
}

void tune() {
System.out.println("Violin is tuned by turning the pegs.");
}
}

 class InstrumentPlayTune {
public static void main(String[] args) {
Glockenspiel glock = new Glockenspiel();
Violin violin = new Violin();

glock.play();
glock.tune();

violin.play();
violin.tune();
}
}