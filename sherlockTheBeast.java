import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlockTheBeast {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i =0;i<T;i++){
            int N = scan.nextInt();
            String ldn = decentNumber(N);
            System.out.println(ldn);
        }
    }
    public static int pivot(int N){
        while(N>0){
            if(N%3==0){
                break;
            }
            else{
                N -= 5;
            }
        }
        return N;
    }
    public static String decentNumber(int N){
        StringBuilder ldn = new StringBuilder();
        if(N<3){
            return "-1";
        }            
        else{
            int temp = pivot(N);
            if(temp<0){
                return "-1";
            }
            else{
                for(int j = 0;j<temp/3;j++){
                    ldn.append("555");
                }
                for(int k = 0;k<(N-temp)/5;k++){
                    ldn.append("33333");
                }
                return ldn.toString();
            }
        }
    }
}
