import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class chocolateFeast {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i < t; i++){
			System.out.println(Solve(scan.nextInt(), scan.nextInt(), scan.nextInt()));
		}
	}
	
	private static long Solve(int N, int C, int M){
		int wrappers = 0;
		int numC = 0;
		numC = N/C;
		wrappers += numC;
		numC += wrappers/M;
		wrappers = wrappers/M + wrappers%M;
		while(!(wrappers<M)){
			numC += wrappers/M;
			wrappers = wrappers/M + wrappers%M;
		}
		return numC;
	}
}
