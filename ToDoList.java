package ToDoList;

import java.util.List;
import java.util.ArrayList;

public class ToDoList {

    private List<ToDoItem> thingsToDo;

    public ToDoList() {
        thingsToDo = new ArrayList<>();
    }

    public boolean addItem(ToDoItem todo) {
        if (!thingsToDo.contains(todo)) {
            thingsToDo.add(todo);
            return true;
        }
        return false;
    }

    public void getAllMeetings() {

        for (ToDoItem items : thingsToDo) {
            if (items instanceof Meeting) {
                System.out.println(items);
            }
        }

    }

    public void getAllAppointments() {

        for (ToDoItem items : thingsToDo) {
            if (items instanceof Appointment) {
                System.out.println(items);
            }
        }

    }

    public void getAllTasks() {

        for (ToDoItem item : thingsToDo) {
            if (item instanceof Task) {
                System.out.println(item);
            }
        }

    }

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

    public void removeItem(ToDoItem item) {
        if (thingsToDo.contains(item)) {
            thingsToDo.remove(item);
        }
    }

    @Override
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
