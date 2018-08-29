
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int count = 0;
        int i = 0;
        int j;
        for (i = 0; i <= n; i++) {
        	j = i;
        	while (j != 0) {
        		if (j % 10 == 7)
        			count ++;
        		j /= 10;
        	}
        }
    	System.out.println(count); 
    }
}