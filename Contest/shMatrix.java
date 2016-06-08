import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class shMatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan =  new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[][] A = new int[N][M];
        
        int total = 0;

        for(int k = 0;k<N*M;k++){
	        for(int i = 0;i<N;i++){
	        	for(int j = 0;j<M;j++){
	        		
	        	}
	        }
	        if(humble(A, N, M)){
	        	total+1;
	        }
	    }
        System.out.println(total);
    }
    public static void humble(int[] matrix, int n, int m){
    	int range[] = new int[N*M];
    }
}
// 1 2
// 3 4
 
// 1 3
// 2 4