import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class lisaWorkbooks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt();//n = chapters, k = max. problems per page
        int pg = 1, sProbs = 0;//pg = page number, sProbs = special problems
        int array[] = new int[n];//store number of problems per chapter
        for(int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }
        for(int i = 1; i <= n; i++){  //i = chapters          
            for(int j =1; j <= array[i-1]; j++){//j = problems
                //System.out.println("Chapter: " + i + "\nProblem: " + j + "\nPage No.: " + pg + "\n*************************");
                if(j == pg){//if problem no. same as page no.
                    sProbs++;
                }
                if(j%k == 0 && j != array[i-1]){//if we've reached the max no. of problems per page
                    pg++;
                }
            }
            pg++;
        }
        System.out.println(sProbs);
    }
}