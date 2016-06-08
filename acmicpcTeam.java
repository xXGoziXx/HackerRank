import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class acmicpcTeam {

public class acmicpcTeam {
    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in);
        //number of people
        int N = scan.nextInt();
        //number of topics
        int M = scan.nextInt();
        //stores the people that know the topic
        int array[][] = new int [N][M];
        //stores the binary numbers
        String binary = "";
        //to get to the next line to be scanned
        scan.nextLine();
        //to loop through the array
        for(int i = 0;i<N;i++){
            //scan in the binary string
            binary = scan.nextLine();
            //stores the binary digits 0 and 1 into the array
            for(int j = 0;j<M;j++){
                //stores the digits into the correct position in the array
                array[i][j] = Integer.parseInt("" + binary.charAt(j));
            }
        }
        //calls the mostTopics method
        mostTopics(array);
    }
    public static void mostTopics(int array[][]){
        //stores who the maximum number of topics out of all the teams
        int mt  = 0;
        //stores the curent number of topics in a team
        int temp = 0;
        //stores the number of people with the maximum number of topics
        int team = 1;
        //loop through to the current member
        for(int i = 0;i<array.length;i++){
            //loops through the other team member
            for(int k = 0;k<array.length;k++){
                //if it is not the same member check
                if(i != k){
                    for(int j = 0;j<array[k].length;j++){
                        //if either team members know the topic plus one
                        if((array[i][j] == 1) || (array[k][j] == 1)){
                            temp++;
                        }
                    }
                    //if theres a team with more topics known make that the maximum
                    if(temp>mt){
                        mt = temp;
                        team = 1;
                    }
                    // if there's someone with the same number of topics as the max increase the number of people with the max topics by one                    
                    else if(temp == mt){
                        team++;
                    }
                }
                temp = 0;
            }
        }
        //prints out the most topics possible
        System.out.println(mt);
        //prints out the number of teams that have the most topics divided by two because the program loops over all the possiblities twice
        System.out.println(team/2);
    }
}