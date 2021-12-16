package ����;

import java.util.Scanner;

public class Summary4 {

	public static void main(String[] args) {
		//Ŭ���� ����
		//new -> ���޸𸮿� Ŭ���� ��ü�� �����ϰ� �ּҰ��� ��ȯ
		Cal cal = new Cal(Math.PI);
		Cal cal2 = new Cal(3.14);
		
		System.out.println(cal.pi);
		System.out.println(cal2.pi);
		//�Է¹����� ����ϴ� Ŭ����
		Scanner input = new Scanner(System.in);
		
		double result2 = Cal.CircleArea(5);
		System.out.println(result2);
		while(true) {
			//Integer.parseInt -> ���ڿ��� ������ ��ȯ
			int x = Integer.parseInt(input.nextLine());
			String Operator = input.nextLine();
			int y = Integer.parseInt(input.nextLine());
			//cal ��ü�� �ִ� Operation( ) -> ��ȯ��
			int result = cal.Operation(x, Operator, y);
			if(result == Integer.MIN_VALUE) {
				System.out.println("������ ���� : �ٽ� �Է����ּ���");
				break;
			}
			System.out.println(result);
			
			
			//Ŭ���� ����
			//�ߺ��ڵ� �پ�� - > ���� �ӵ��� ������
			//������ ������ ->
		}
		
	}

}

//Ŭ����    - ����� �Ӽ��̳� ����� ������� ģ��
//�ʵ� -> �Ӽ�,��,����,����
//������ -> �ʵ忡 ������ ������ ������(�ʱ�ȭ), Ŭ���� ��ü�� ���鶧 ���Ǵ� ��� ->new ȣ��
//�޼��� -> ��ɿ�� -> ����

//����������
//private, protected,default,public
//private - �ܺο� ����� 
//protected -> �ܺο� ��ӹ��� Ŭ���� ����
//default ->������Ű��
//public -> ��ü����

//Ŭ���� ����
//[����������] class Ŭ�����̸�{
//		Ŭ��������
//}
class Cal{
	//�ʵ� - Ŭ���� �������,��, �Ӽ�
	//[����������] Ÿ�� �����̸�; //���� OK, �ʱ�ȭ���� ���൵ OK
	static double pi2 = Math.PI;
	double pi;
	//������ - ������ ������ ���ϸ� �⺻������ �ڵ�����, -> ������������ �⺻������ X
	//[����������]Ŭ�����̸�(){
	//}
	Cal(double pi){ // �Ű����� �Ѱ��� ������ -> �⺻�����ڴ� ����  X
		//this - Ŭ���� ��ü�� �ǹ�
		// -> Ŭ���� ���ο� �ִ� ��������� ������,�޼��带 ȣ���Ҷ� ���(Ŭ���� ����)
		this.pi = pi;
	}
	
	//�޼��� - ���, ����
	//[����������] ��ȯŸ�� �޼����̸�( �Ű����� ){
	//}
	//�Ű����� - �޼��� ���({ }) ����� �����͸� �ܺο��� �޾ƿ��� ���ؼ� ���
	//�Ű������� ���� - Ÿ�� �����̸�
	//��ȯŸ�� - void ->��ȯ���� ������ ��� -> return; �޼��� ����
	// 		 - Ÿ��  -> ���� Ÿ���� ���� ��ȯ���ش�. -> return ��; �޼��� ����
	//��ü���� ������ ���ڿ��� ������ �Է¹޾� ������ ��ȯ�ϴ� Operation �޼���
	public int Operation(int x, String Operator, int y) {
		if(Operator.equals("+")) {
			return x+y;
		}else if(Operator.equals("-")) {
			return x-y;
		}else if(Operator.equals("*")) {
			return x*y;
		}else if(Operator.equals("/")) {
			return x/y;
		}else if(Operator.equals("%")) {// %
			return x%y;
		}else {
			return Integer.MIN_VALUE;
		}
		
		
	}
	public static double CircleArea(int r) {
		return r*r*pi2;
	}
}