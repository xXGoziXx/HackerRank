import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cashier{
	public static void main(String args[]){
		System.out.println("Please enter an amount of money in the format $.$$:");
		Scanner scan = new Scanner(System.in);
		String money = scan.nextLine(); //money to be converted
		int euro = Integer.parseInt(money.substring(0,money.length()-3));
		int cent = Integer.parseInt(money.substring(money.length()-2));
		System.out.println("Euros:" + changeEuro(euro));
		System.out.println("Cents:" + changeCent(cent));
	}
	public static String changeEuro(int money){
		int euroArray[] = {500,100,50,20,10,5,2,1};
		String euro = "";
		int tempMoney = money;
		for(int j = 0;j<euroArray.length;j++){
			if(tempMoney>=euroArray[j]){
				for(int i = 0;i<tempMoney/euroArray[j];i++){
					euro = euro + " Eur " + euroArray[j] + ",";
				}
				tempMoney = tempMoney - (euroArray[j]*(tempMoney/euroArray[j]));
			}
		}
		return euro.substring(0,euro.length()-1) + ".";
	}
	public static String changeCent(int money){
		int centArray[] = {50,20,10,5,2,1};
		String cent = "";
		int tempMoney = money;
		for(int j = 0;j<centArray.length;j++){
			if(tempMoney>=centArray[j]){
				for(int i = 0;i<tempMoney/centArray[j];i++){
					cent = cent + " "+ centArray[j] + "c,";
				}
				tempMoney = tempMoney - (centArray[j]*(tempMoney/centArray[j]));
			}
		}
		return cent.substring(0,cent.length()-1) + ".";
	}
}