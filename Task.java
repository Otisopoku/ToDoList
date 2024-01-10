
import java.time.LocalDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task extends ToDoItem implements Comparable<Task> {
    private int taskPriority;

    public Task(String description, String location, String date, String time) {
        super(description, location, date, time);
        this.taskPriority = calculatePriority();

    }

    // returns the taskPriority
    public int getTaskPriority() {
        return taskPriority;
    }

    // sets the taskPriority
    public void setTaskPriority(int taskPriority) {
        this.taskPriority = taskPriority;
    }

    @Override
    public String getType() {
        return getClass().getName();
    }

    public boolean equals(Object obj) {

        if (obj instanceof Task) {
            Task object = (Task) obj;
            return super.equals(object) && taskPriority == object.taskPriority;
        }
        return false;
    }

    private int calculatePriority() { // calculates the priority of the task based on the
        LocalDate taskDate = LocalDate.parse(getDate(), DateTimeFormatter.ISO_LOCAL_DATE); // fromat 2024-05-30
        LocalTime taskTime = LocalTime.parse(getTime(), DateTimeFormatter.ISO_TIME); // format 10:35 or 10:35:43
        LocalDateTime taskDateTime = LocalDateTime.of(taskDate, taskTime);
        long secondsOfDay = taskDateTime.toLocalTime().toSecondOfDay();
        int taskPriority = (int) secondsOfDay;

        return taskPriority;
    }

    @Override
    public int compareTo(Task task) {

        Integer priority = task.taskPriority;
        return ((Integer) taskPriority).compareTo(priority);
    }

    @Override
    public String toString() {
        return String.format("%-20s\t", getType()) + super.toString() + String.format("\t%-5d", taskPriority);
    }
}
