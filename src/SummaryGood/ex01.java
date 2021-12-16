package SummaryGood;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		String data1 = "";
		String data2 = "";
		int value1 = 0;
		int value2 = 0;
		int result = 0;
		try {
		//String data1 = "100";
		//String data2 = "a100";
		//int value1 = Integer.parseInt(data1);
		//int value2 = Integer.parseInt(data2); //NumberFormatException 발생
		//int result = value1+value2;
		System.out.println(data1+"+"+data2+"="+result);
	}catch (Exception e) {
		System.out.println("value2 예외");
		Scanner input = new Scanner(System.in);
		value2 = input.nextInt();
	}
		
	}
}
