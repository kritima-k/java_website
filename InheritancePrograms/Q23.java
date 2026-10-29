package inheritance;
abstract class Instrument
{
abstract void play();
abstract void tune();
}

class Piano extends Instrument
{
void play()
{
 System.out.println("Piano plays");
}
void tune()
{
System.out.println("Piano tunes");
}
}

class Violin extends Instrument
{
void play()
{
 System.out.println("Violin plays");
}
 void tune()
{
System.out.println("Violin tunes");
}
}

class InstrumentPlayTune
{
public static void main(String[] args)
{
Piano p = new Piano();
Violin v = new Violin();
p.play();
p.tune();
v.play();
v.tune();
}
}
