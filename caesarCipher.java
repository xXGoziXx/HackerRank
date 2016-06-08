import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class caesarCipher {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		char charArray[] = new char[N];
		int intArray[] = new int[N];
		scan.nextLine();
		String S = scan.nextLine();
		int K = scan.nextInt();
		String ans = new String("");
		for(int j = 0;j<N;j++){
			charArray[j] = S.charAt(j);
		}
		for(int i = 0;i<N;i++){
			intArray[i] = (int) charArray[i];
			if(intArray[i]>=65 && intArray[i]<=90){
				intArray[i] += K;
				if(!(intArray[i]>=65 && intArray[i]<=90)){
					intArray[i] = 65 + (intArray[i]-91)%26;
				}
			}
			else if(intArray[i]>=97 && intArray[i]<=122){
				intArray[i] += K;
				if(!(intArray[i]>=97 && intArray[i]<=122)){
					intArray[i] = 97 + (intArray[i]-123)%26;
				}
			}
			ans += (char) intArray[i];
		}
		System.out.println(ans);
    }
}