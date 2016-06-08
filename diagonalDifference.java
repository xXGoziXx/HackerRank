import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class diagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        int j = 0, result = 0, a = 0, b = 0, a1 = 0, b1 = N-1;
        int array[][] = new int [N][N];
        for(int i = 0;i<N;i++){  
            j=0;
            for(String num : scan.nextLine().split("\\s")){
                array[i][j] = Integer.parseInt(num);
                j++;
            }
        }
        for(int x = 0;x<N;x++){
            a += array[x][a1];
            b += array[x][b1];
            a1++;
            b1--;
        }
        result = Math.abs(a-b);
        System.out.println(result);
    }
}