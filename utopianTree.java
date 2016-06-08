import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class utopianTree {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int U = 1;
        int N;
        for(int i =0;i<T;i++){
            N = scan.nextInt();
            for(int j = 1;j<=N;j++){
                if((j%2) == 0){
                    U += 1;
                }
                else{
                    U *= 2;
                }
            }
            System.out.println(U);
            U = 1;
        }
    }
}