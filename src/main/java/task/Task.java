package task;

/**
 * Represents an entry in the to-do list
 */
public class Task {
    private String instruction;
    private boolean status;

    public Task(String instruction) {
        this.instruction = instruction;
        this.status = false;
    }

    /**
     * Marks entry as completed and prompts user if action is redundant.
     */
    public void setComplete() {

        if (this.status) {
            System.out.println("Mission is already completed.");
            return;
        }
        this.status = true;
        System.out.println("Mission Completed!\n" + this);
    }


    /**
     * Marks entry as incomplete and prompts user if action is redundant.
     */
    public void setIncomplete() {
        if (!this.status) {
            System.out.println("Mission is originally incomplete.");
            return;
        }
        this.status = false;
        System.out.println("Mission Re-initialised\n" + this);
    }

    /**
     * Checks if the current task matches the user's request
     * @param s keyword searching for
     * @return boolean value indicating if this task should be printed
     */
    public boolean contains(String s) {
        return instruction.contains(s);
    }
    @Override
    public String toString() {
        if (status) {
            return "[X] " + instruction;
        }
        return "[ ] " + instruction;
    }
}
