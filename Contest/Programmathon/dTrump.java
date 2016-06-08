import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//return the highest frequency length and it's frequency
public class dTrump {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		String array[] = new String[N];
		int freq[] = new int[1000];
		for (int i = 0;i<N ;i++ ) {
			array[i] = scan.nextLine();
		}
		int length = 0;
		for(int k = 0; k <N;k++){
			if(array[k].length() == 0){

			}
			else{
				for(int j = 0; j<array[k].length();j++){
					if(((int) array[k].charAt(j)) == 39 || (((int) array[k].charAt(j)) > 64 && ((int) array[k].charAt(j)) <91) || (((int) array[k].charAt(j)) > 96 && ((int) array[k].charAt(j) < 123))){
						length++;
						
					}
					else{
						freq[length]++;
						length = 0;
					}
				}
			}
			
		}
		int big = 0;
		int loc = 0;
		for(int x = freq.length-1;x>-1;x--){
			if(freq[x]>big){
				big = freq[x];
				loc = x;
			}
		}
		System.out.println(loc + " " + big);
	}
}