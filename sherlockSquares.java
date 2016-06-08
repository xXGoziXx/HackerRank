import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlockSquares {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt(), counter = 0;
		for(int i = 0;i<T;i++){
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			System.out.println(sSquare(n1, n2));
		}
	}
    public static int sSquare(int n1, int n2){
    	int result = 0;
        for(int i = 1;i*i<=n2;i++){
        	if(n1<=i*i){
        		result++;
        	}
        }
        return result;
    }
}