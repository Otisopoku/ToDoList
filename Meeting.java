package ToDoList;

public class Meeting extends ToDoItem {

    private String host;
    private int guests;

    public Meeting(String host, String description, String location, String date, String time, int guests) {
        super(description, location, date, time);
        if (guests < 0) {
            throw new IllegalArgumentException("Guests can not be less than zero");
        }
        this.host = host;
        this.guests = guests;
    }

    public String getHost() {
        return host;
    }

    public int getGuests() {
        return guests;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    @Override
    public String getType() {
        return "Meeting";
    }

    @Override
    public String toString() {
        return String.format("%-20s\t", getType()) + super.toString();
    }

}
