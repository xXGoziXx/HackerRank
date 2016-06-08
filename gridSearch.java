import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class gridSearch{
	public static void main(String args[]){
		Scanner scan  = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 0;i<T;i++){
			String temp = "";
			int R = scan.nextInt();
			int C = scan.nextInt();
			scan.nextLine();
			int G[][] = new int[R][C];
			for(int x = 0;x<R;x++){
				String s = scan.nextLine();
				for(int y = 0;y<C;y++){
					temp = "" + s.charAt(y);
					G[x][y] = Integer.parseInt(temp);
				}
			}
			int r = scan.nextInt();
			int c = scan.nextInt();
			scan.nextLine();
			int P[][] = new int[r][c];
			for(int a = 0;a<r;a++){
				String s = scan.nextLine();
				for(int b = 0;b<c;b++){
					temp = "" + s.charAt(b);
					P[a][b] = Integer.parseInt(temp);
				}
			}
			
			if(findMatrix(G,P,R,C,r,c)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	//checks if the small grid(P) is in the big grid(G)
	public static boolean findMatrix(int G[][], int P[][], int R, int C, int r, int c){
		for(int i = 0;i<R-r+1;i++){
			for(int j = 0;j<C-c+1;j++){
				if(G[i][j] == P[0][0]){
					if(foundIt(G,P,i,j,R,C,r,c)){
						return true;
					}
					else{
					}
				}
			}
		}
		return false;
	}
	//checks to see if the small grid(P) starts at that location in the big grid (G)
	public static boolean foundIt(int G[][], int P[][], int i, int j, int R, int C, int r, int c){
		for(int x = 0;x<r;x++){
			for(int y = 0;y<c;y++){
				if((i+x>=R) || (j+y>=C)){
					return false;
				}
				else if(G[i+x][j+y] == P[x][y]){
                }
                else{
                    return false;
                }
                
			}
		}
		return true;
	}
}