package task;

import java.util.ArrayList;

/**
 * Abstraction for data structure and operations used to maintain to do list.
 */
public class TaskList {
    private ArrayList<Task> records = new ArrayList<>();

    // default constructor
    public String add(Task task) {
        records.add(task);
        return "B: " + task.toString() + "has been added";
    }

    public String delete(int x) {
        Task temp = records.remove(x-1);
        return "B: " + temp.toString() + "has been removed";
    }

    public String print() {
        String s = "";
        int n = this.records.size();

        if (n == 0) {
            return "B: There are no missions!";
        }

        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                s = s + (i + 1) + ". " + records.get(i).toString() + "\n";
            } else {
                s = s + (i + 1) + ". " + records.get(i).toString();
            }
        }

        return s;
    }

    public String mark(int x) {
        return records.get(x-1).setComplete();
    }

    public String unmark(int x) {
        return records.get(x-1).setIncomplete();
    }

    public int size() {
        return this.records.size();
    }

    /**
     * Finds and prints out missions that contain the keyword specified by user.
     * @param s keyword that user inputs
     */
    public String find(String s) {
        String ans = "These are what I found:";

        int x = 1;
        int n = this.records.size();

        for (int i = 0; i < n; i++) {
            if (this.records.get(i).contains(s)) {
                ans +="\n" + x + ". " + this.records.get(i).toString();
                x++;
            }
        }

        if (x == 1) {
            ans = "No missions contain this keyword.";
        }

        return ans;
    }
}
