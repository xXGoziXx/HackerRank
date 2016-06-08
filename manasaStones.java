import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class manasaStones {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T =  scan.nextInt();
        for(int t = 0;t<T;t++){
        	//n = no. of stones, a = first possible diff., b = second possible diff.
        	int n = scan.nextInt(), a = scan.nextInt(), b = scan.nextInt(), counter = 0, P = (int) Math.pow(2,n-1);
        	int array[] = new int[n];
        	for(int j = n-1;j>=0;j--){
				int L = 0;
				L = (a*j) + (b*(n-1-j));
				array[counter] = L;
				counter++;
			}
            printNoDuplicate(array);
            System.out.println();
        }
    }
    public static void printNoDuplicate(int array[]){
    	Arrays.sort(array);
    	int numCheck = array[0];
    	System.out.print(numCheck + " ");
    	for(int i = 1;i<array.length;i++){
    		if(array[i] != numCheck){
    			numCheck = array[i];
    			System.out.print(numCheck + " ");
    		}
    	}
    }
}