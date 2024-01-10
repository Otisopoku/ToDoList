
import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.HashMap;

public class ToDoList {

    // private List<ToDoItem> thingsToDo;

    private HashMap<String, ArrayList<ToDoItem>> thingsToDo;
    private PriorityQueue<Task> tasks;

    // default constructor
    public ToDoList() {
        thingsToDo = new HashMap<>();
        tasks = new PriorityQueue<>();
    }

    // adds an a todoItem and returns true if it was successfully added
    public boolean addItem(ToDoItem todo) {

        if (thingsToDo.containsKey(todo.getType())) {
            thingsToDo.get(todo.getType()).add(todo);
            return true;
        }

        thingsToDo.put(todo.getType(), new ArrayList<ToDoItem>());
        thingsToDo.get(todo.getType()).add(todo);

        return true;
    }

    // obtains all the meetings of the user
    public void getAllMeetings() {

        for (ToDoItem items : thingsToDo) {
            if (items instanceof Meeting) {
                System.out.println(items);
            }
        }

    }

    // obtains all the appointments of the user
    public void getAllAppointments() {

        for (ToDoItem items : thingsToDo) {
            if (items instanceof Appointment) {
                System.out.println(items);
            }
        }

    }

    // obtains all the tasks of the user
    public void getAllTasks() {

        for (ToDoItem item : thingsToDo) {
            if (item instanceof Task) {
                System.out.println(item);
            }
        }

    }

    // sorts the items based on the location of each toDoItem. Will be improving on
    // this to make use of the comparator interface or comparable interface
    public void sortItems() {

        for (int lastUnsortedIndex = 1; lastUnsortedIndex < thingsToDo.size(); lastUnsortedIndex++) {

            ToDoItem item = thingsToDo.get(lastUnsortedIndex);
            int j = lastUnsortedIndex;

            while (j > 0 && thingsToDo.get(lastUnsortedIndex - 1).getLocation().compareTo(item.getLocation()) > 0) {

                thingsToDo.set(j, thingsToDo.get(j - 1));
                j--;
            }
            thingsToDo.set(j, item);

        }
    }

    // removes a todoItem
    public void removeItem(ToDoItem item) {
        if (thingsToDo.contains(item)) {
            thingsToDo.remove(item);
        }
    }

    @Override
    // improve on the toString method to return a filled string, but not an empty
    // string and get rid of all the print statements
    public String toString() {
        if (thingsToDo.isEmpty()) {
            return "There is nothing in your to do list";
        }
        for (int i = 0; i < thingsToDo.size(); i++) {
            System.out.println(thingsToDo.get(i));
        }
        return "";

    }

}
