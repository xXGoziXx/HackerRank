import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class encryption {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        System.out.println(encrypter(sentence));

    }
    public static String encrypter(String sentence){
    	int l = sentence.length();
    	int row = (int) Math.floor(Math.sqrt(l));
    	int column = (int) Math.ceil(Math.sqrt(l));
        if(row*column<l){
            row++;
        }
    	int counter = 0;
    	String encrypted = "";
    	for(int i = 0;i<column;i++){
            counter = 0;
    		for(int j = 0;j<row;j++){
    			if(i+counter<sentence.length()){
    				encrypted = encrypted + sentence.charAt(i+counter);
    				counter+=column;
    			}
    		}
            if(i == column){
                
            }
            else{                
                encrypted = encrypted + " ";
            }
    	}
    	return encrypted;
    }
}
