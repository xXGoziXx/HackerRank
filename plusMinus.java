import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class plusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), counter = 0;
        double pos = 0, neg = 0, zero = 0;
        scan.nextLine();
        double array[] = new double [N];
        for(String numlist : scan.nextLine().split("\\s")){
            array[counter] = Double.parseDouble(numlist);
            counter++;
        }
        for(int i = 0;i<N;i++){
            if(array[i]>0){
                pos++;
            }
            else if(array[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        double posres = pos/N, negres = neg/N, zerores = zero/N;
        System.out.println(posres);
        System.out.println(negres);
        System.out.println(zerores);
    }
}