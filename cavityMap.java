import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cavityMap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();  
        String array[][] = new String [N][N];
        String s = "";

        for(int i = 0;i < N;i++){
            s = scan.nextLine();
            for(int j = 0; j< N;j++){
                array[i][j] = "" + s.charAt(j);
            }
        }

        cavityMarker(array);

        for(int x=0;x<N;x++){

            for(int y=0;y<N;y++){
                System.out.print(array[x][y]);
            }
            System.out.println("");
        }
    }

    public static void cavityMarker(String array[][]){
        for(int i = 1;i<array.length-1;i++){
            for(int j = 1;j<array.length-1;j++){
                if(!(array[i-1][j].equals("X") || array[i][j-1].equals("X") || array[i][j+1].equals("X") || array[i+1][j].equals("X"))){
                    if(Integer.parseInt(array[i-1][j]) < Integer.parseInt(array[i][j]) && Integer.parseInt(array[i][j-1]) < Integer.parseInt(array[i][j]) && Integer.parseInt(array[i][j+1]) < Integer.parseInt(array[i][j]) && Integer.parseInt(array[i+1][j]) < Integer.parseInt(array[i][j])){
                        array[i][j] = "X";
                    }
                }
            }
        }
    }
}