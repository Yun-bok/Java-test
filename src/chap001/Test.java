package chap001;
/*�ڷᱸ�� 2����
ù��° ���� 
�̸� 0917.java -> ����X

page 40 , 41 ��������(1~4����)
Q1) 5���� ����� �Է¹��� �迭�� ��� ����� �������Ͻÿ�

Q2) �迭�� �ִ񰪰� �ּڰ� ���Ͻÿ�
int[]arr = {10, 11, 2, 5, 3, 3, 24, 15, 6, 9};

Q3)������ ���� �ι迭���� ���� ���� ��Ҹ� �����ϴ��� �Ǻ��Ͻÿ�.
int[] arr1 = {1,3,2};
int[] arr2 = {2,3,1};

Q4)�ߺ��� ��Ҹ� ������ �� �迭�� ��ȯ�Ͻÿ�.
(�ߺ� ���ŵ� ���Ҵ� 0���� ���� -> �ߺ��Ǵ� ��Ҹ� �����Ҷ� 0���� ó��)
*/

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q1();
	}
	
	static void Q1() {
		//Q1) 5���� ����� �Է¹��� �迭�� ��� ����� �������Ͻÿ�
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		System.out.println("��� 5���� �Է����ּ��� :");
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
		//Q2) �迭�� �ִ񰪰� �ּڰ� ���Ͻÿ�
	int[] arr = {10, 11, 2, 5, 3, 3, 24, 15, 6, 9};
		if(arr.M);
	}

}
