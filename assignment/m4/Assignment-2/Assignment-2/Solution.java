import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void main(String[] args) {

    int m, n, c, d;
    Scanner in = new Scanner(System.in);
    m = in.nextInt();
    n  = in.nextInt();
 
    int first[][] = new int[m][n];
    int second[][] = new int[m][n];
    int sum[][] = new int[m][n];
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ ){
            first[c][d] = in.nextInt();
        }
        
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ ){
            second[c][d] = in.nextInt();
            }
      
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
 
//Addition of matrices.
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sum[c][d]+" ");
 
         System.out.println();
      }
   }
}