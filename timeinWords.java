import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class timeinWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        if(m == 0){
        	System.out.println(numberToWord(h) + " o' clock");
        }
        else if(m == 1){
            System.out.println("one minute past " + numberToWord(h));
        }
        else if(m == 59){
            if(h == 12){
                System.out.println("one minute to one");
            }
            else{
                System.out.println("one minute to " + numberToWord(h+1));
            }
        }
        else if(m == 15){
            System.out.println("quarter past " + numberToWord(h));
        }
        else if(m == 45){
            if(h == 12){
                System.out.println("quarter to one");
            }
            else{
                System.out.println("quarter to " + numberToWord(h+1));
            }
        }
        else if(m<30){
        	System.out.println(numberToWord(m) + " minutes past " + numberToWord(h));
        }
        else if(m == 30){
            System.out.println("half past " + numberToWord(h));
        }
        else{
            if(h == 12){
                System.out.println(numberToWord(60-m) + " minutes to one");
            }
            else{
                System.out.println(numberToWord(60-m) + " minutes to " + numberToWord(h+1));
            }
        }         

    }
    public static String numberToWord(int num){
    	String array[][] = {{"1","one"},{"2","two"},{"3","three"},{"4","four"},{"5","five"},{"6","six"},{"7","seven"},{"8","eight"},{"9","nine"},{"10","ten"},{"11","eleven"},{"12","twelve"},{"13","thirteen"},{"14","fourteen"},{"15","quarter"},{"20","twenty"},{"30","half"}};
    	if(num<=15){
	    	for(int i =0;i<15;i++){
	    		if(Integer.parseInt(array[i][0]) == num){
	    			return array[i][1];
	    		}
	    	}
	    }
	    else if(num>15 && num<20){
	    	for(int i =5;i<9;i++){
	    		if(Integer.parseInt(array[i][0]) == (num%10)){
	    			return array[i][1] + "teen";
	    		}
	    	}
	    }
	    else if(num == 20){
	    	return "twenty";
	    }
	    else{
	    	return "twenty " + numberToWord(num%10);
	    }
        return "Error";
	}
}