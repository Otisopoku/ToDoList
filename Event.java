
public class Event extends ToDoItem {

    public String reminder = ""; // the user puts anything that he wants to be reminded about. Something relevant
                                 // to the event

    public Event(String description, String location, String date, String time, String reminder) {
        super(description, location, date, time);
        this.reminder = reminder;

    }

    @Override
    public String getType() {
        return this.getClass().getName();
    }

    public boolean equals(Object obj) {

        if (obj instanceof Event) {
            Event object = (Event) obj;
            return super.equals(object);
        }
        return false;
    }

    // need a toString

}
