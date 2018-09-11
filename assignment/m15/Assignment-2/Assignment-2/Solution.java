/**.
 * @author : Sai Kiran Reddy Pitta.
 */
import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**
 *It's a Class for sorted set.
 */
class SortedSet extends Set  {
    /**.
     * It is a sort function.
     * @param      array  The array
     */
    public void sort(final int[] array) {
        int a;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
    }
    /**
     *It is a add function.
     * @param      item  The item
     */
    public void add(final int item) {
        if (!contains(item)) {
            set[size++] = item;
        }
        sort(set);
    }
    /**
     *It is a subset.
     * @param      start      The start
     * @param      end        The end
     * @return     from start to end returns elements.
     * @throws     Exception  {Invalid Arguments to Subset Exception }
     */
    public int[] subSet(final int start, final int end) throws Exception {

        if (start > end) {
            throw new Exception("Invalid Arguments to Subset Exception");
        } else {
        int[] result = new int[size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (set[i] >= start) {
                for (int j = i; j < size; j++) {
                    if (set[j] < end) {
                        result[k++] = set[i];
                    }
                    break;
                }
            }
        }
        return Arrays.copyOf(result, k);
        }
    }
    /**
     *It is a headset function.
     * @param      end        The end
     * @return     returms elements.
     * @throws     Exception  { set empty exception }
     */
    public int[] headSet(final int end) throws Exception {

        int[] result = new int[size];
        int temp = 0;
        if (size == 0 || end <= 1) {
            throw new Exception("Set Empty Exception");
        } else {
            for (int i = 0; i < size; i++) {
            if (set[i] < end) {
                result[i] = set[i];
                temp++;
            }
        }
    }
        return Arrays.copyOf(result, temp);
    }
    /**.
     * It is a last function.
     * @return     returns list of elements.
     * @throws     Exception  set empty Exception
     */
    public int last() throws Exception {

        if (size == 0) {
            throw new Exception("Set Empty Exception");
            /*return -1;*/
        }
        return set[size - 1];
    }
    /**.
     * It is a Adds all.
     *
     * @param      element  The element
     */
    public void addAll(final int[] element) {
        for (int i : element) {
            this.add(i);
        }
    }
}
/**.
 *It is a Solution class.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * helper function which convert string input to int array.
     * @param      s     { string input from test case file }
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
    /**.
     * main function to execute test cases.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        SortedSet s = new SortedSet();
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
                s = new SortedSet();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
            case "retainAll":
                s = new SortedSet();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
            case "cartesianProduct":
                s = new SortedSet();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
            case "subSet":

                if (tokens.length != 2) {
                    break;
                }
                String[] arrstring3 = tokens[1].split(",");
            try {
                int[] object = s.subSet(Integer.parseInt(arrstring3[0]),
                                        Integer.parseInt(arrstring3[1]));
                    System.out.println(Arrays.toString(object).replace("[",
                        "{").replace("]", "}"));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case "headSet":

                if (tokens.length != 2) {
                    break;
                }
            try {
                    int[] obj = s.headSet(Integer.parseInt(tokens[1]));
                        System.out.println(Arrays.toString(obj).replace("[",
                            "{").replace("]", "}"));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case "last":
            try {

                if (tokens.length != 1) {
                    break;
                }
                int temp = s.last();
                System.out.println(temp);
            } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                break;
            case "addAll":
                int[] intArr = intArray(tokens[1]);
                if (intArr.length == 1) {
                    s.add(intArr[0]);
                } else {
                    s.add(intArr);
                }
                break;
            default:
                break;
            }
        }
    }
}

