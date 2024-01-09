
public class Appointment extends ToDoItem {

    private String contact;

    public Appointment(String contact, String description, String location, String date, String time) {
        super(description, location, date, time);
        this.contact = contact;
    }

    // returns the contact
    public String getContact() {
        return contact;
    }

    // sets the contact
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String getType() {
        return getClass().getName();
    }

    public boolean equals(Object obj) {

        if (obj instanceof Appointment) {
            Appointment object = (Appointment) obj;
            return super.equals(object) && object.contact.equals(contact);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%-20s\t", getType()) + super.toString();
    }

}
