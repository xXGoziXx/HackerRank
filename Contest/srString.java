import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class srString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.length() == 1){
        	System.out.println(s);
        }
        else if(s.equals("")){
        	System.out.println("Empty String");
        }
        else{
        	int j = 0;
        	while(j<100){
	        	for(int i = 1;i<s.length();i++){
		        		if(s.charAt(i-1) == s.charAt(i)){
		        			s = s.substring(0,i-1) + s.substring(i+1);

		        		}
	        	}
	        	j++;
	        }
        	if(s.equals("")){
        		System.out.println("Empty String");
        	}
        	else{
        		System.out.println(s);
        	}
        }
    }
}