import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//return the highest frequency length and it's frequency
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int output = 0;
		int num = 0;
		int array[] = new int[N];
		Arrays.fill(array,1);
		while(array[0] == N){
			for(int i = N-1;i>-1;i++){
				if(array[i] != 0){
					array[i] -= 1;
					array[i-1] += 1;
					break;
				}
				if(sumArray(array) == N){
					output++;
				}
			}
			
		}
		System.out.println(sumArray(array));
	}

	public static int sumArray(int array[]){
		int num = 0;
		for(int k = 0;k<array.length;k++){
			num += array[k];
		}
		return num;
	}
	public static boolean isAll(int[] array){
		boolean check = true;
		for(int k = 0;k<array.length;k++){
			if(array[k] != array.length){
				check = false;
			}
		}
		return check;
	}
}