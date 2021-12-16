package 이윤복0913;

import java.util.Scanner;

public class Quiz5 {
	//패키지 -> 이윤복 0913 클래스 Quiz5
	// q1) 두개의 정수를 입력받아(x,y) 1~x까지의 숫자중
	// y의 배수를 출력하고 배수의 합을 출력하시오.
	// 10,4 -> 4 8 합:12
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//q1();
		q2();
	}

	static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.println("정수1 입력: ");
		int x = input.nextInt(); // x입력
		System.out.println("정수2 입력:");
		int y = input.nextInt(); // y 입력
		input.close();

		int sum = 0;
		// 1부터 x까지 숫자 반복
		for (int i = 1; i < x; i++) { // i가 1부터 x까지 돌고
			if (i % y == 0) { // y를i 로나눠 배수만들고
				sum += i;// 배수의합
				System.out.println(" "+i);
				

			}

		}
		System.out.println(sum);
	}

	static void q2() {
		// q2)정수(num)을 입력받아 1~num까지의 정수중
		// 소수(1과 자기자신만 약수인것)를 출력하고 소수의 합도
		// 출력하시오.
		Scanner input = new Scanner(System.in);
		int count = 0;
		int num1 = 0;
		int num = Integer.parseInt(input.nextLine());
		for(int i=2; i<num; i++) {
			for(int j=1; j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+" ");
				num1 += i;
			}
		count = 0;
		}
		System.out.println(num1);
	}
}
