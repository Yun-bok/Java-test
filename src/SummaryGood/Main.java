package SummaryGood;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int score = input.nextInt();
	input.close();
	
	if(score<=100) {
		System.out.println("A");
	}else if(score<=89) {
		System.out.println("B");
	}else if(score<=79) {
		System.out.println("C");
	}else if(score<=69) {
		System.out.println("D");
	}else {
		System.out.println("F");
	}
	}

}
