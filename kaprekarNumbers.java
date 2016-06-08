import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kaprekarNumbers {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int p = scan.nextInt();
    	int q = scan.nextInt();
    	int array[] = new int[(q-p)+1];
    	int counter = 0;
    	for(int i = p; i <= q; i++){
    		if(isKaprekar(i)){
    			array[counter] = i;
    			counter++;
    		}
    	}
    	if(array[0] == 0){
    		System.out.println("INVALID RANGE");
    	}
    	else{
    		for(int x = 0;x<array.length;x++){
	    		if(array[x] != 0){
	    			System.out.print(array[x] + " ");
    			}
    			else{
    				return;
    			}
    		}
    	}    	
    }
    public static boolean isKaprekar(int num){
    	long sqrit = (long) Math.pow(num,2);
    	String square = Long.toString(sqrit);
    	String l = "";
    	String r = "";
    	if(sqrit<10){
    		l = "0";
    		r = square;
    	}
    	else{
    		l = square.substring(0,square.length()/2);
    		r = square.substring(square.length()/2, square.length());
    	}
    	int left = Integer.parseInt(l);
    	int right = Integer.parseInt(r);
    	if(left  + right == num){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
}
