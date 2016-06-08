import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class taumBday {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int loop = 0; loop < t; loop++){
            BigInteger b = BigInteger.valueOf(scan.nextInt());//number of black
            BigInteger w = BigInteger.valueOf(scan.nextInt());//number of white
            BigInteger x = BigInteger.valueOf(scan.nextInt());//cost of black
            BigInteger y = BigInteger.valueOf(scan.nextInt());//cost of white
            BigInteger z = BigInteger.valueOf(scan.nextInt());//cost of conversion
            if(colorOrNot(x,y,z).equals("color black")){
                BigInteger num = (b.multiply(y.add(z)).add(w.multiply(y)));
                System.out.println(num);
            }
            else if(colorOrNot(x,y,z).equals("color white")){
                BigInteger num = (b.multiply(x).add(w.multiply(x.add(z))));
                System.out.println(num.toString());
            }
            else{
                BigInteger num = (b.multiply(x).add(w.multiply(y)));
                System.out.println(num.toString());
            }
        }
    }
    public static String colorOrNot(BigInteger x, BigInteger y, BigInteger z){
        //is it more cost efficient to color black
        if((y.add(z)).compareTo(x) == -1){
            return "color black";
        }
        //is it more cost efficient to color white
        else if((x.add(z)).compareTo(y) == -1){
            return "color white";
        }
        //if none of the above, buy the originals of both
        else{
            return "color none";
        }
    }
}