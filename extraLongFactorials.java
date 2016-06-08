import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class extraLongFactorials {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        BigInteger fN = BigInteger.valueOf(N);
        for(int i = N-1;i>1;i--){
            fN = fN.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fN);
    }
}