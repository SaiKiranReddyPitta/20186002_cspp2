import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class Task {
    String title;
    String assignedTo;
    int timeToComplete;
    boolean important;
    boolean urgent;
    String status;

    Task() {

    }

    Task(String title9, String assignedTo9, int timeToComplete9, boolean important9, boolean urgent9, String status9) {
        this.title = title9;
        this.assignedTo = assignedTo9;
        this.timeToComplete = timeToComplete9;
        this.important = important9;
        this.urgent = urgent9;
        this.status = status9;
    }

    public String getTitle() {
        return title;
    }

    public String getAssigneddTo() {
        return assignedTo;
    }

    public int getTimeToComplete() {
        return timeToComplete;
    }

    public String getImportant() {
        if(this.important == true) {
            return "Important";
        }
        return "Not Important";
    }

    public String getUrgent() {
        if(this.urgent == true) {
            return "Urgent";
        }
        return "Not Urgent";
    }

    public String getStatus() {
        return status;
    }
    // public String toString() {
    //     String s = "";
    //     for (int i = 0; i < tokens.length - 1; i++) {
    //             s += tokens[i] + "\t";
    //         } s += tokens[tokens.length - 1];
    //     return s;
    // }
    
    public String toString() {
        return getTitle() + "," + " " + getAssigneddTo() + "," + " " + getTimeToComplete() + "," + " " + getImportant() + "," + " " + getUrgent() + "," + " " + getStatus();
    }

}
class Todoist {
    Todoist () {

    }
}

class todo {
    todo() {

    }
}
/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                // case "add-task":
                //     testAddTask(todo, tokens);
                // break;
                // case "print-todoist":
                //     System.out.println(todo);
                // break;
                // case "get-next":
                //     System.out.println(todo.getNextTask(tokens[1]));
                // break;
                // case "get-next-n":
                //     int n = Integer.parseInt(tokens[2]);
                //     Task[] tasks = todo.getNextTask(tokens[1], n);
                //     System.out.println(Arrays.deepToString(tasks));
                // break;
                // case "total-time":
                //     System.out.println(todo.totalTime4Completion());
                // break;
                default:
                break;
            }
        }
    }



    // public static void ************* {
    //     if(Integer.parseInt(todo[2]) < 0) {
    //         System.out.println("Invalid timeToComplete" + todo[2]);
    //     }
    // }




    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    // public static void testAddTask(final Todoist todo, final String[] tokens) {
    //     try {
    //         todo.addTask(createTask(tokens));
    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //     }
    // }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
