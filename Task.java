package ToDoList;

public class Task extends ToDoItem {
    private int taskPriority;

    // a constructor that throws an IllegalArgumentException. Check if it is a
    // checked or an unchecked exception.
    public Task(String description, String location, String date, String time, int taskPriority) {
        super(description, location, date, time);
        if (taskPriority <= 0) {
            throw new IllegalArgumentException("task Priority can not be less than or equal to zero");
        }
        this.taskPriority = taskPriority;

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
        return "Task";
    }

    @Override
    public String toString() {
        return String.format("%-20s\t", getType()) + super.toString() + String.format("\t%-5d", taskPriority);
    }
}
