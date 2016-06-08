import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hackerank_test {


    static int solveMeFirst(int a, int b) {
        return a+b;
   }


 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int _a;
        _a = in.nextInt();
        System.out.println("Input second number: ");
        int _b;
        _b = in.nextInt();
        int sum;
        sum = solveMeFirst(_a, _b);
        System.out.println(sum);
   }
}