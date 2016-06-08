import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class simpleArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        double result = 0;
        double a = 0;
        int counter = 0;
        String num = scan.nextLine();
        for(int i = 0;i<T;i++){
            if(i == T-1){
                a = Double.parseDouble(num.substring(0));
                result += a;
            }
            else{
                while(num.charAt(counter) != ' '){
                 counter++;
              }
              a = Integer.parseInt(num.substring(0,counter));
              result += a;
              num = num.substring(counter+1);
            }
            counter = 0;
        }
        counter = 0;
        String fix = Double.toString(result);
        while(fix.charAt(counter)!= '.'){
            counter++;
        }
        fix = fix.substring(0,counter);
        System.out.println(fix);
    }
}