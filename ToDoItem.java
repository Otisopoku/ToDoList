package ToDoList;

public abstract class ToDoItem {

    private String description;
    private String location;
    private String date;
    private String time;

    protected ToDoItem(String description, String location, String date, String time) {

        if (description == null) {
            throw new IllegalArgumentException("Description can not be empty");
        }
        if (location == null) {
            throw new IllegalArgumentException("Location can not be empty");
        }
        if (date == null) {
            throw new IllegalArgumentException("Date can not be empty");
        }
        if (time == null) {
            throw new IllegalArgumentException("Time can not be empty");
        }

        this.description = description;
        this.location = location;
        this.date = date;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

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
