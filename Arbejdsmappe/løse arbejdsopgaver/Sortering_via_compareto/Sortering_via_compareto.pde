import java.util.Collections;

void setup() {
  ArrayList<Event> events = new ArrayList<Event>();

  for (int i = 0; i < 10; i++) {
    events.add(new Event((int)random(100)));
  }
  
  println("Before sorting:");
  for (Event e : events) {
    println(e.value);
  }

  Collections.sort(events);
  
  println("");
  println("After sorting:");
  for (Event e : events) {
    println(e.value);
  }
}

class Event implements Comparable<Event> {
  public int value;

  Event(int value) {
    this.value = value;
  }

  @Override
    int compareTo(Event other) {
      return this.value - other.value;
    }
}
