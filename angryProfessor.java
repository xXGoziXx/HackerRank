import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class angryProfessor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int onTime = 0;
		for(int i = 0;i<T;i++){
			int N = scan.nextInt();
			int K = scan.nextInt();
			for(int j = 0;j<N;j++){
				int a = scan.nextInt();
				if(a<=0){
					onTime++;
				}
			}
			if(onTime>=K){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
			onTime = 0;
		}
    }
}