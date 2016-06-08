import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class findDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String num = "";
        int N = 0,div = 0, counter = 0;
        for(int i = 0;i < T; i++){
            N = scan.nextInt();
            num = Integer.toString(N);
            for(int j = 0; j< num.length();j++){
                div = Integer.parseInt(num.substring(j,j+1));
                if(div == 0){
                    
                }
                else if((N%div) == 0){
                    counter++;
                }
                
            }
            System.out.println(counter);
            counter = 0;
        }
    }
}