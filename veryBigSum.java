import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class veryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        int counter = 0;
        long result = 0;
        int z = 0;
        String num = scan.nextLine();
        for(int i = 0;i<N;i++){
            if(i==N-1){
                z = Integer.parseInt(num.substring(0));
                 result += z;
            }
            else{
                while(num.charAt(counter) != ' '){
                counter++;
                }
                z = Integer.parseInt(num.substring(0,counter));
                num = num.substring(counter+1);
                result += z;
            }
            
            
        }
        System.out.println(result);
    }
}