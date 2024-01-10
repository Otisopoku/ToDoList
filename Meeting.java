
public class Meeting extends ToDoItem {

    private String host;
    private int guests;

    /* A contructor that throws an IllegalArgumentException */
    public Meeting(String host, String description, String location, String date, String time, int guests) {
        super(description, location, date, time);
        this.host = host;
        this.guests = guests;
    }

    // returns the host of the meeting
    public String getHost() {
        return host;
    }

    // returns the number of guest of the meeting
    public int getGuests() {
        return guests;
    }

    // sets the name of the host of the meeting
    public void setHost(String host) {
        this.host = host;
    }

    // sets the number of guests
    public void setGuests(int guests) {
        this.guests = guests;
    }

    @Override
    public String getType() {
        return getClass().getName();
    }

    @Override
    public String toString() {
        return String.format("%-20s\t", getType()) + super.toString();
    }

}
