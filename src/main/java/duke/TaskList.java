package duke;

import java.util.ArrayList;

public class TaskList {

    private final ArrayList<Task> taskList;

    public TaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public int getSize() {
        return taskList.size();
    }

    public void addToList(Task task) {
        taskList.add(task);
    }

    /**
     * Removes the element in the list represented by the index.
     *
     * @param index The index of the element to be removed.
     */
    public void removeFromList(int index) {
        if (index <= 0 || index > taskList.size()) {
            // number given is out of bounds of the taskList
            System.out.println("Invalid Argument: Index " + index + " is out of bounds!");
        } else {
            // no problems with the input, a task is added
            Task toDelete = taskList.get(index - 1);
            taskList.remove(index - 1);
            System.out.println("Noted. I've removed this task:");
            System.out.println("  " + toDelete);
            System.out.println("Now you have " + taskList.size() + " tasks in the list.");
        }
    }

    /**
     * Prints all the elements in teh TaskList.
     */
    public void printList() {
        if (taskList == null || taskList.isEmpty()) {
            System.out.println("You currently have no tasks!");
        } else {
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println((i + 1) + ". " + taskList.get(i));
            }
        }
    }

    /**
     * Marks the task at the given index as done.
     *
     * @param index The index of the task to be marked as done.
     */
    public void markAsDone(int index) {
        if (index <= 0 || index > taskList.size()) {
            // number given is out of bounds of the taskList
            System.out.println("Invalid Argument: Index " + index + " is out of bounds!");
        } else {
            // no problems with the input, a task is added
            taskList.get(index - 1).markAsDone();
        }
    }
}
