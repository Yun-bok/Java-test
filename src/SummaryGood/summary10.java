package SummaryGood;

import java.util.Scanner;

public class summary10 {
	public static void main(String[] args) {
		//����ó�� �����߿� ������ �������� �׷��Ŷ�� �Ѵ�
		//10�� ����ó��
		//Exception =���� �׸��� �ֻ��� Ŭ������
		//�ڹٴ� ���븦 �ϴ°����̰� ���߿� �����ϱ� ������
		//c++���� �� �������
		
		//������ ���� - ����,����
		//�ϵ���� -> ���� ->���α׷� ����
		//����Ǽ� -> ���� -> ���α׷�����
		//		 -> ����ó��-> �����������
		
		//���ܿ� ���� �پ��� Ŭ���� ���� -> �ʹ� �پ��ؼ� �ܿ�� ����
		//****�ֻ���Ŭ���� Exception
		
		
		int[] int_arr = new int[3];
		//���� ó�� ���
		
		try {//���ܰ� �߻��Ҽ� �ִ� �ڵ��
			int_arr[2] = 10;
		}catch(Exception e) {//���ܰ� �߻������� ó
			//�Ϲ������� ���
			e.toString(); //������ ����
			e.printStackTrace(); //������ ��ġ�� ����
			System.out.println("���ܹ߻�");
		}finally {// ���̳� - �׻� �����Ѵ�(���ܰ� �߻��ϵ� ����), �ۼ��� ���Ҽ���
			System.out.println("finally");
		}
		
		System.out.println("���α׷� ��������");
		int[] intarr = new int[3];
		String str = null;
		//����ó��
		try { //���ܰ� �߻��� �� �ִ��ڵ�
			//intarr[4] = 10;
			//System.out.println("���ܹ߻� �ؿ� �ڵ�");
			str.toString();
		
		}catch(ArrayIndexOutOfBoundsException e) {//catch �ѹ� ������ �Ʒ� catch ���� ���Ѵ�
			//ArrayIndexOutOfBoundsException �߻��ϸ� ����
			System.out.println("ArrayIndexOutOfBoundsException ");
		}catch(NullPointerException e) {
			//NullPointerException �߻��ϸ� ����
			System.out.println("NullPointerException");
		}catch(Exception e) {
			//���� �ΰ��� ���ܸ� ������ ��� ���ܰ� ����
			System.out.println("���� �ΰ��� ���ܸ� ������ ��� ���ܰ� ����");
		}finally {
			
		}
		//�����ڰ� �ǵ������� ����ó���� ������ϴ� �޼��带 ����
		try {
			print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void print() throws Exception{
		System.out.println("1~10�� ������ �Է��ϼ���");
		Scanner input = new Scanner(System.in);
		
		int num = Integer.parseInt(input.nextLine());
		
		if(num>=1&&num<=10) {
			System.out.println("�����۵�");
		}else {
			System.out.println("������ �ǵ� ������");
			throw new Exception();
		}
	}
}
