import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class larryArrays {
	public static int a[];
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i < t; i++){
			int n = scan.nextInt();
			a = new int[n];
			for(int j = 0; j < n; j++){
				a[j] = scan.nextInt();
			}
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n-1; k++){
					if(a[k] > a[k+1]){
						if(k+2 >= n){
							rotate(k-1,k,k+1);
						}
						else{
							rotate(k,k+1,k+2);
						}
					}
				}
			}
			if(isSorted()){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}	
	}

	public static void rotate(int x, int y, int z){
		int temp = a[x];
		a[x] = a[z];
		a[z] = a[y];
		a[y] = temp;
		int lNum = a[x]; // stores the lowest number
		for(int i = x; i <= z; i++){
			if(a[i]<lNum){
				lNum = a[i];
			}
		}
		while(a[x] != lNum){
			rotate(x,y,z);
		}		
	}

	public static boolean isSorted(){
		for(int i = 0; i < a.length - 1; i++){
			if(a[i] > a[i+1]){
				return false;
			}
		}
		return true;
	}
}