
public abstract class ToDoItem {

    private String description;
    private String location;
    private String date;
    private String time;

    protected ToDoItem(String description, String location, String date, String time) {
        this.description = description;
        this.location = location;
        this.date = date;
        this.time = time;
    }

    // gets the description of the todoItem
    public String getDescription() {
        return description;
    }

    // sets the description
    public void setDescription(String description) {
        this.description = description;
    }

    // obtains the location
    public String getLocation() {
        return location;
    }

    // sets the location
    public void setLocation(String location) {
        this.location = location;
    }

    // gets the date
    public String getDate() {
        return date;
    }

    // sets the date
    public void setDate(String date) {
        this.date = date;
    }

    // gets the time
    public String getTime() {
        return time;
    }

    // sets the time
    public void setTime(String time) {
        this.time = time;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return String.format("%-30s\t%-20s\t%-15s\t%-10s", description, location, date, time);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof ToDoItem) {
            ToDoItem object = (ToDoItem) obj;
            if (description.equals(object.getDescription()) && location.equals(object.getLocation())
                    && date.equals(object.getDate()) && time.equals(object.getTime())) {
                return true;
            }
        }
        return false;
    }

}
