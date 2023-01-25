package task;

import java.util.ArrayList;

/**
 * Abstraction for data structure and operations used to maintain to do list.
 */
public class TaskList {
    private ArrayList<Task> records = new ArrayList<>();

    // default constructor

    public void add(Task task) {
        records.add(task);
    }

    public void delete(int x) {
        records.remove(x-1);
    }

    public String print() {
        String s = "";
        int n = this.records.size();

        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                s = s + (i + 1) + ". " + records.get(i).toString() + "\n";
            } else {
                s = s + (i + 1) + ". " + records.get(i).toString();
            }
        }

        return s;
    }

    public void mark(int x) {
        records.get(x-1).setComplete();
    }

    public void unmark(int x) {
        records.get(x-1).setIncomplete();
    }

    public int size() {
        return this.records.size();
    }

    /**
     * Finds and prints out missions that contain the keyword specified by user.
     * @param s keyword that user inputs
     */
    public void find(String s) {
        System.out.println("These are what I found:");

        int x = 1;
        int n = this.records.size();

        for (int i = 0; i < n; i++) {
            if (this.records.get(i).contains(s)) {
                System.out.println(x + ". " + this.records.get(i).toString());
                x++;
            }
        }

        if (x == 1) {
            System.out.println("No missions contain this keyword.");
        }
    }
}
