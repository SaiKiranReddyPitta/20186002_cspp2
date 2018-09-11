import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**.
 * List of.
 * @author : Sai Kiran Reddy Pitta.
 */

/**
 * . defining solution class.
 */
public class Solution {
    private int[] list;
    /**
     * { declaring list datatype }
     */
    private int size;
    // declaring a private int size
    // again, don't initialize it here
    // variable initialization should be done in the constructor

    /**.
     *The purpose of the constructor is to initialize 
     *the class variables with some default values.
     */
    private static final int TEN = 10;
    /**.
     * here, we are initializing.
     */
    public Solution() {
        list = new int[TEN];
        size = 0;

    }
    /**.
     * The add method does what the name suggests. Add an int item to the list.
     * The assumption is to store the item at the end of the list What is the
     * end of the list? Is it the same as the end of the array? Think about how
     * you can use the size variable to add item to the list.
     *
     * The method returns void (nothing)
     */

    /**.
     * adds item.
     *
     * @param item  The item
     */
    public void add(final int item) {

        //Inserts the specified element at the end of the zelist
        list[size++] = item;
    }
    /**.
     * The size method returns the value of the size. The purpose of the method
     * is to announce the size of the list to the objects outside the list
     *
     * The method returns an int. Empty list should return 0.
     *
     * @return     returns size
     */
    public int size() {

        // replace the code below to implement the size method
        return size;
    }

    /**
     * .
     *
     * @param      index      The index
     *
     * @throws     Exception  Writing exception
     */
    public void remove(final int index) throws Exception {
        if (index >= 0 && index < size) {
            for (int i = index; i <= size - 1; i++) {
                list[i] = list[i + 1];
            }
            size--;
        } else {
            throw new Exception("Invalid Position Exception");
        }
    }

    /**.
     * @param      index  The index
     *
     * @return     { description_of_the_return_value }
     */
    public int get(final int index) {


        if (index < 0 || index >= size) {
            return -1;
        } else {
            return list[index];
        }
    }

    /**.
     * @return     String representation of the object.
     */
   public String toString() {


        if (size == 0) {
            return "[]";
        }
        String s = "[";
        int i;
        for (i = 0; i < size - 1; i++) {
            s = s + list[i] + ",";
        }
        s = s + list[i] + "]";
        /*if (list[0] == 0) {
                s += "\nInvalid Position Exception";
            }*/
        return s;
    }
    /**.
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int item) {

        return indexOf(item) == -1;
    }
    /**.
     * Returns the index of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element.
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public int indexOf(final int item) {

        for (int i = 0; i < size; i++) {
            if (item == list[i]) {
                return i;
            }
        }
        return -1;
    }
    /**.
    Inserts all the elements of specified int array to the end of list.
    @param      item  The item
    */
    private void resize(final int item) {

        this.list = Arrays.copyOf(this.list, list.length * 2);
        list[size++] = item;
    }
    /**.
     * Adds all.
     *
     * @param      newArray  The new array
     */
    public void addAll(final int[] newArray) {

        int a = newArray.length;
        int x = 0;
        if ((size + a) <= list.length) {
            for (int j = size; j < (size + a); j++) {
                list[j] = newArray[x];
                x += 1;
            }
            size += a;
        } else {
            for (int i = 0; i < a; i++) {
                resize(newArray[i]);
            }
        }
    }
    /**.
     Removes all of its elements that are contained in the specified int array.
     @param      newArray  The new array
    */
     public void removeAll(final int[] newArray) {

        // write the logic
        for (int i = 0; i < newArray.length; i++) {
            int index = indexOf(newArray[i]);
            while (index != -1) {
                try {
                    remove(i);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                index = indexOf(newArray[i]);
            }
        }
     }
    /**
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     it returns count.
     */
    public int count(final int item) {
        /**
         * we will return count.
         */
        if (this.list.length > 0) {
            int count = 0;
            for (int i = 0; i < size(); i++) {
                if (item == this.list[i]) {
                    count += 1;
                }
            }
            return count;
        } else {
            return 0;
        }
     }
    /**
    . Returns a list object containing elements, including startIndex and
    excluding endIndex. The first parameter indicates the startIndex and the
    second parameter indicates the endIndex. Returns null and print
    "Index Out of Bounds Exception" if any of values start and end are negative
    and also if start is greater than end.
    
    @param      start      The start
    @param      end        The end
    
    @return     it returns new list 
    
    @throws     Exception  Using exception as indicated in question
    */
    public Solution subList(final int start, final int end) throws Exception {

     Solution newlist = new Solution();
    // write the logic for subList
        if (start >= -1) {
            if (start == end  || start == end - 1
                || start > end || start == -1) {
                throw new Exception("Index Out of Bounds Exception");
                } else {
                for (int i = start; i < end; i++) {
                    newlist.add(list[i]);
                }
                return newlist;
            }
        }
        /*System.out.println("Index Out of Bounds Exception");*/
        return null;
    }
    /**.
    Returns a boolean indicating whether the parameter i.e a List object is
    exactly matching with the given list or not.
    @param      list1  The list.
    @return     returns boolean value.
    */
    public boolean equals(final Solution list1) {

    // Replace the code below
        return list1.toString().equals(this.toString());
}
    /**.
    * Removes all the elements from list
    * Think about this case and make the method
    * the simpler.
    */
    public void clear() {
    // write the logic for clear.
        size = 0;

    }

    /**.
     * this is main.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        // create an object of the list to invoke methods on it
        Solution l = new Solution();

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
                case "add":
                    if (tokens.length == 2) {
                        String[] t = tokens[1].split(",");
                        if (t.length == 1) {
                            l.add(Integer.parseInt(tokens[1]));
                        }
                    }
                break;
                case "size":
                    System.out.println(l.size());
                break;
                case "print":
                    System.out.println(l);
                break;
                case "remove":
                try {
                    if (tokens.length == 2) {
                        l.remove(Integer.parseInt(tokens[1]));
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                break;
                case "indexOf":
                    if (tokens.length == 2) {
                        System.out.println(l.indexOf(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "get":
                    if (tokens.length == 2) {
                        System.out.println(l.get(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "contains":
                    if (tokens.length == 2) {
                        System.out.println(l.contains(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                case "addAll":
                    if (tokens.length == 2) {
                        String[] t1 = tokens[1].split(",");
                        int[] temp = new int[t1.length];
                        for (int i = 0; i < temp.length; i++) {
                            temp[i] = Integer.parseInt(t1[i]);
                        }
                        l.addAll(temp);
                    }
                break;
                case "removeAll":
                    if (tokens.length == 2) {
                        String[] t2 = tokens[1].split(",");
                        int[] a = new int[t2.length];
                        for (int i = 0; i < t2.length; i++) {
                            a[i] = Integer.parseInt(t2[i]);
                        }
                        l.removeAll(a);
                    }
                break;
                case "subList":
                try {
                    if (tokens.length != 2) {
                        break;
                    }
                    String[] arrstring3 = tokens[1].split(",");
                    Solution object = l.subList(Integer.parseInt(arrstring3[0]),
                            Integer.parseInt(arrstring3[1]));
                    if (object != null) {
                        System.out.println(object);
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                    break;
                case "equals":
                    if (tokens.length == 2) {
                        String[] lt = tokens[1].split(",");
                        Solution l2 = new Solution();
                        for (int k = 0; k < lt.length; k++) {
                            l2.add(Integer.parseInt(lt[k]));
                        }
                        System.out.println(l.equals(l2));
                    }
                break;
                case "clear":
                    l.clear();
                break;
                case "count" :
                    if (tokens.length == 2) {
                        System.out.println(l.count(
                            Integer.parseInt(tokens[1])));
                    }
                break;
                default:
                break;
            }
        }
    }
}

