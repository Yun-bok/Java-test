package chap001;
/*자료구조 2과목
첫번째 과제 
이름 0917.java -> 압축X

page 40 , 41 연습문제(1~4문제)
Q1) 5개의 양수를 입력받은 배열의 모든 요소의 합을구하시오

Q2) 배열의 최댓값과 최솟값 구하시오
int[]arr = {10, 11, 2, 5, 3, 3, 24, 15, 6, 9};

Q3)순서가 없는 두배열에서 서로 같은 요소를 포함하는지 판별하시오.
int[] arr1 = {1,3,2};
int[] arr2 = {2,3,1};

Q4)중복된 요소를 제거한 새 배열을 반환하시오.
(중복 제거된 빈요소는 0으로 삽입 -> 중복되는 요소를 제거할때 0으로 처리)
*/

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q1();
	}
	
	static void Q1() {
		//Q1) 5개의 양수를 입력받은 배열의 모든 요소의 합을구하시오
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		System.out.println("양수 5개를 입력해주세요 :");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		sc.close();
		for(int i=1;i<arr.length; i++) {
			sum+= i; 
			System.out.println(sum);
			
		}
		
		
		
		
	}
	static void Q2() {
		//Q2) 배열의 최댓값과 최솟값 구하시오
	int[] arr = {10, 11, 2, 5, 3, 3, 24, 15, 6, 9};
		if(arr.M);
	}

}
