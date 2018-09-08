import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : Sai Kiran Reddy Pitta.
 */
class Set {
    //your code goes here...
    //Good luck :-)
    private int[] set;
    private int size;

    //Constructor
    public Set() {
        set = new int[10];
    	size = 0;
    }    
}    
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private int[] set;
    private int size;

    public Solution() {
    set = new int[10];
    size = 0;
    }

    public int size() {
        return size;
    }

    public void add(final int item) {
        //Inserts the specified element at the end of the list.
//     	if (indexOf(item) < 0) {
        set[size++] = item;
        //}
    }



    public boolean contains(int item) {
        //return indexOf(item) == -1;
        if (indexOf(item) >= 0) {
            return true;
        }
        return false;        
    }

    public int indexOf(final int item) {
        // Replace the code below
        for (int i = 0; i < size; i++) {
            if (item == set[i]) {
                return i;
            }
        }
        return -1;
    }    

    public String toString() {
        if(size == 0)
            return "";
        String str = "{";
        int i = 0;
        for(i = 0; i < size - 1; i++) {
            str = str + set[i] + ",";
        }
        str = str + set[i] + "}";
        return str;
    }

    private void resize(final int item) {
        this.set = Arrays.copyOf(this.set, set.length * 2);
        set[size++] = item;
    }

    public Set intersection(Set set) {
    // use the method contains
    int members = 0;
    for (int i = 0; i < elements.length; i++) {
        if (set.contains(elements[i]))
            members++;
    }

    int[] newMembers = new int[members];
    int position = 0;
    for (int i = 0; i < elements.length; i++) {
        if (set.contains(elements[i]))
            newMembers[position++] = this.elements[i];

    }
    return new Set(newMembers);
}
    public Set retainAll(Set set) {

    int oldmembers = 0;
    for (int i = 0; i < elements.length; i++) {
        if (set.contains(elements[i]))
            members++;
    }

    int[] newMembers = new int[members];
    int position = 0;
    for (int i = 0; i < elements.length; i++) {
        if (set.contains(elements[i]))
            newMembers[position++] = this.elements[i];

    }
    return new Set(newMembers);
    }

    // public int[][] cartesianProduct(Set) {
        
    // }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
