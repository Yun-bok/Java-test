package ������0913;

import java.util.Scanner;

public class Quiz5 {
	//��Ű�� -> ������ 0913 Ŭ���� Quiz5
	// q1) �ΰ��� ������ �Է¹޾�(x,y) 1~x������ ������
	// y�� ����� ����ϰ� ����� ���� ����Ͻÿ�.
	// 10,4 -> 4 8 ��:12
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//q1();
		q2();
	}

	static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.println("����1 �Է�: ");
		int x = input.nextInt(); // x�Է�
		System.out.println("����2 �Է�:");
		int y = input.nextInt(); // y �Է�
		input.close();

		int sum = 0;
		// 1���� x���� ���� �ݺ�
		for (int i = 1; i < x; i++) { // i�� 1���� x���� ����
			if (i % y == 0) { // y��i �γ��� ��������
				sum += i;// �������
				System.out.println(" "+i);
				

			}

		}
		System.out.println(sum);
	}

	static void q2() {
		// q2)����(num)�� �Է¹޾� 1~num������ ������
		// �Ҽ�(1�� �ڱ��ڽŸ� ����ΰ�)�� ����ϰ� �Ҽ��� �յ�
		// ����Ͻÿ�.
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
