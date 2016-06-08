import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class libraryFine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int fine = 0;
        int D = scan.nextInt();
        int M = scan.nextInt();
        int Y = scan.nextInt();
        int eD = scan.nextInt();
        int eM = scan.nextInt();
        int eY = scan.nextInt();
        if(((D <= eD)&&(M<=eM)&&(Y<=eY))){
            fine  = 0;
        }
        else if((D>eD)&&(M==eM)&&(Y==eY)){
            fine = 15*(D-eD);
        }
        else if((M>eM)&&(Y==eY)){
            fine = 500*(M-eM);
        }
        else if(Y>eY){
            fine = 10000;
        }
        System.out.println(fine);
    }
}