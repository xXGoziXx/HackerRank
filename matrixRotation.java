import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class matrixRotation {

	static int matrix[][];
	static int rows, cols, rots;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		rows = scan.nextInt(); // number of rows
		cols = scan.nextInt(); // number of columns
		rots = scan.nextInt(); // number of rotations
		matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < rots;i++){
			mRotate();
		}

		printArray(matrix);
	}

	public static void printArray(int matrix[][]){
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void mRotate(){
		int lTemp = 0;
		int tl[] = {0,0};
		int tr[] = {0,cols-1};
		int bl[] = {rows-1,0};
		int br[] = {rows-1,cols-1};
		int numSqr = rows<cols ? rows/2 : cols/2;
		for(int x = 0; x < numSqr; x++){
			for (int i = tl[0]; i < bl[0]; i++) {
				int currTemp = 0;
				for (int j = tr[1]; j >= tl[1]; j--) {
					if(i == tr[0]){//if you're on the top row
						if(j == tr[1]){ //if you're at the very end
							System.out.println("row: " + i + " cols: " + j);
							int temp = matrix[i][j];
							currTemp = temp;
							matrix[i][j] = matrix[i+1][j];
						}
						else if(j == tl[1]){
							lTemp = matrix[i][j];
							matrix[i][j] = currTemp;
						}
						else{
							int temp = matrix[i][j];
							matrix[i][j] = currTemp;
							currTemp = temp;
						}
					}
					else if(i == br[0]){//if you're on the bottom row
						if(j == bl[1]){
							currTemp = matrix[i][j];
							matrix[i][j] = lTemp;
						}
						else if(j == br[1]){
							currTemp = matrix[i][j];
							matrix[i][j] = matrix[i][j-1];	
						}
						else{
							int temp = matrix[i][j];
							matrix[i][j] = currTemp;
							currTemp = temp;
						}
					}
					else{//if ur on the sides
						if(j == br[1]){//if you're on the right side
							matrix[i][j] = matrix[i+1][j];
						}
						else if(j == bl[1]){//if you're on the left side
							int temp = matrix[i][j];
							matrix[i][j] = lTemp;
							lTemp = temp;
						}
					}
				}
			}
			for(int i = 0; i < 2 ;i++){
				tl[i]++;
				tr[i]++;
				bl[i]--;
				br[i]--;
			}
		}
	}
}