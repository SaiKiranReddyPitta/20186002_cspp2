import java.util.Scanner;
import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
       //System.out.print("Enter number of rows: ");
       int rows = scanner.nextInt();
       //System.out.print("Enter number of columns: ");
       int columns = scanner.nextInt();
       //System.out.println();
       //System.out.println("Enter first matrix");
       int[][] a = readMatrix(rows, columns);
       //System.out.println();
       //System.out.println("Enter second matrix");
       int[][] b = readMatrix(rows, columns);
       int[][] sum = add(a, b);
       //System.out.println();
       //System.out.println("A + B =");
       System.out.println(sum);
   }
   public static int[][] readMatrix(int rows, int columns) {
       int[][] result = new int[rows][columns];
       Scanner s = new Scanner(System.in);
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               result[i][j] = s.nextInt();
           }
       }
       return result;
   }

   public static int[][] add(int[][] a, int[][] b) {
       int rows = a.length;
       int columns = a[0].length;
       int[][] result = new int[rows][columns];
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               result[i][j] = a[i][j] + b[i][j];
           }
       }
       return result;
   }
}

