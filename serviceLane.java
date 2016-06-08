import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class serviceLane {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner (System.in);
		int N = scan.nextInt();
		int T = scan.nextInt();
		int lwa = 3;
		int width[] = new int[N];
		for(int x = 0;x<N;x++){
			width[x] = scan.nextInt();
		}
		int lanes[][] = new int[T][2];
		for(int i = 0;i<T;i++){
			for(int j=0;j<2;j++){
				lanes[i][j] = scan.nextInt();
			}
		}
		for(int y = 0;y<T;y++){
			for(int a = lanes[y][0];a<=lanes[y][1];a++){
				if(width[a]<lwa){
					lwa = width[a];
				}
			}
			System.out.println(lwa);
			lwa = 3;
		}
    }
}