import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cutSticks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), temp = 0;
		int array[] = new int[n];
		for(int i = 0;i<n;i++){
			array[i] = scan.nextInt();
		}
		for(int j = 0;j<n;j++){
			for(int k = 0;k<n-1;k++){
				if(array[k]>array[k+1]){
					temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}
			}
		}
		int counter = 0, sn = array[n-1];
		while(array[n-1]>0){
			sn = array[n-1];
			counter = 0;
			for(int x = 0;x<n;x++){
				if(array[x]>0){
					counter++;
					if(array[x]<sn){
						sn = array[x];
					}
				}
			}
			System.out.println(counter);
			for(int y = 0;y<n;y++){
				if(array[y]>0){
					array[y] -=sn;
				}
			}
		}
    }
}