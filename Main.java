package ToDoList;

public class Main {
    public static void main(String[] args) {
        ToDoList whatToDo = new ToDoList();

        whatToDo.addItem(new Appointment("Paul Allen", "Phamacist", "New York", "03/08/2023", "9:00"));
        whatToDo.addItem(new Appointment("Kathy Bell", "Doctor", "Lehigh Doctors", "04/22/2023", "13:45"));
        whatToDo.addItem(new Appointment("Sharon Kraft", "Advising", "PA-252", "03/11/2023", "12:15"));
        whatToDo.addItem(new Meeting("Billy Stewart", "Programming Club", "PA-220", "03/15/2023", "19:00", 20));
        whatToDo.addItem(new Meeting("Jack Taylor", "Group Work", "Zoom", "02/07/2023", "18:45", 5));
        whatToDo.addItem(new Meeting("Will Johns", "Science Club", "PA-220", "02/03/2023", "16:30", 25));
        whatToDo.addItem(new Task("Learn", "Linderman Library", "04/06/2023", "9:00", 1));
        whatToDo.addItem(new Task("Laundry", "Taylor", " 04/06/2023", "12:00", 2));
        whatToDo.addItem(new Task("Movie Night", "Raunch-270", "04/06/2023", "7:00", 3));

        printHeadings();
        System.out.println(whatToDo);

        whatToDo.sortItems();
        System.out.println(
                "-------------------------------------To Do List after sorting by location------------------------------------------------------------");
        System.out.println();
        printHeadings();
        System.out.println(whatToDo);
        System.out.println();

        System.out.println(
                "------------------------------------Searching for all appointments-------------------------------------------");
        System.out.println();
        whatToDo.getAllAppointments();
        System.out.println();

        System.out.println(
                "------------------------------------Searching for all Meetings-------------------------------------------");
        System.out.println();
        whatToDo.getAllAppointments();
        System.out.println();

        System.out.println(
                "-------------------------------------Searching for all Tasks-----------------------------------------------");
        System.out.println();
        whatToDo.getAllTasks();
        System.out.println();

        System.out.println("Removing an item".toUpperCase());
        System.out.println();
        whatToDo.removeItem(new Task("Movie Night", "Raunch-270", "04/06/2023", "7:00", 3));

        printHeadings();
        System.out.println(whatToDo);

    }

    public static void printHeadings() {
        System.out.println(String.format("%-20s\t%-30s\t%-20s\t%-15s\t%-10s\t%-5s",
                "TYPE", "DESCRIPTION", "LOCATION",
                "DATE", "TIME", "PRIORITY"));
        System.out.println();

    }

}
