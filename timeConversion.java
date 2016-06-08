import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class timeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String time = scan.nextLine();
        String hour = time.substring(0,2);
        String mode = time.substring(time.length()-2);
        if(mode.equals("PM")){
            
        	int newHour = Integer.parseInt(hour);
            if(newHour == 12){
                newHour = 12;
            }
            else{
                newHour = newHour+12;
            }
        	time = newHour + time.substring(2,time.length()-2);
        	System.out.println(time);
        }
        else{
            int newHour = Integer.parseInt(hour);
            if(newHour == 12){
                hour = "00";
                time = hour + time.substring(2,time.length()-2);
                System.out.println(time);
            }
            else{
                time = time.substring(0,time.length()-2);
        	    System.out.println(time);
            }
        	
        }
    }
}