package ToDoList;

public class Appointment extends ToDoItem {

    private String contact;

    public Appointment(String contact, String description, String location, String date, String time) {
        super(description, location, date, time);
        if (contact == null) {
            throw new IllegalArgumentException("Contact can not be empty");
        }
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String getType() {
        return "Appointment";
    }

    @Override
    public String toString() {
        return String.format("%-20s\t", getType()) + super.toString();
    }

}
