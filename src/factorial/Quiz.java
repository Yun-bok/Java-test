package factorial;

public class Quiz {

	//���
	//������ �ذ��ϱ����� �ڱ��ڽ��� �˰���(�޼���)�� �̿��ؼ� �ذ�
	//**��Ģã�� *****Ż����
	public static void main(String[] args) {
		//q1
		int result = factorial(5);
		System.out.println(result);
		
		//q2
		System.out.println(power(2,5));
		System.out.println(result2);
		
		//q3
		for(int i=0; i<10; i++) {
			int result3 = fibonacci(i+1); //i+1 -> i 0~9 1~10
			System.out.print(result3+ " ");
		}

	}
	// q1) ���丮�� ���  ����Լ��̸�(factorial)
	 //* ���丮��
	 //* 5!   => 5*4*3*2*1
	 //* 8!   => 8*7*6*5*4*3*2*1
	 //  n    => n*n-1*n-2 .......*1
	static int factorial(int n) {
		//Ż������
		if(n<=1) {
			return n;
		}
		return n*factorial(n-1);//5������
		//5//n* factorial(n-1)
		//4//	n-1* factorial(n-2) //n�� ���� �Է¹��� ģ���� �ٲ�
		//3//			n-2*factorial(n-3)
		//2//             n-3*factorial(n-4)
		//n*n-1*n-2*n-3,,,,,*factorial(1) Ż������
		//
		//5*4*3*2*1
	}
	//q2) �� �� x,y�� �Է¹޾� x�� y�ŵ�����(��)�� ���Ͻÿ�(���) power
	 //* x 2 , y 5
	 //* 2*2*2*2*2 => 2�� 5��
	 //* x4, y 5, => 4*4*4*4*4 => 4�� 5�� 
	//�Լ��� �ȿ��� �ٽ�ȣ���̵ȴ�
	//x=2, y=5 => 2*2*2*2*2*
	//int result = power(2,5)
	//x, y => x*x*x*x*x*,,,,,,=>y��
	//Ż�����ǿ� �����ϸ� Ż���ϰԲ�
	//���ǿ� ������������鼭 �ݺ��� �������� �־���Ѵ�
	
	//x�� ���Һ��� y�� ���Ҽ�
	static int power(int x , int y) {
		if(y<=1) {
			return x;//y��1�϶� ������ x �� ��ȯ�ض�
			//���� �̰� ����Ƴ� ����
		}
		return x*power(x,y-1);
		//2*power(2,5)
		//	2*power(2,4)
		//		2*power(2,3)
		//			2*power(2,2) 
		// 				2*      power(2,1)
		//2  *  2  *  2  *  2  *  2  *power(2,0)
		//������ ������ ������ ���´�
		//2��5�� ��������ߴµ� y�� ���� �پ��
	}
//	�÷��� ����
//	 * q3) �Ǻ���ġ ���� -> �� �ΰ��� ���� ���� �������ڰ� �Ǵ°�
//	 * ex)1  1  �̸� ����°�� 2 ���Ĵ� ���� 3 ���� 5 ���� 8 ���� 
//	 * 8 13 21 34 55   (fibonacci)
//    1 1 2 3 5 8 13 21 34 55
//	 * fibonacci(5) => 5
//	 * fibonacci(7) => 13
//	 * fibonacci(8) => 21 �̷������� ����
//	 * �ݺ��� 1~10��°������ ���� ��� ������ 2�������ص� ������ 3���� �ص�����

	
	//fibonacci(5)  => 5
	//->�Ǻ���ġ ������ 5��° �ڸ��� ����
	// -> 5��° �ڸ��� ���� ==== 3��° ���� + 4��° ���� 
	// -> 4��°          ==== 		3��° ���� + 2��° ����
	// -> 3��°          ==== 2���� ���� + ù��° ����
	// -> 2��°          ==== ù��° ����
	//5��° �ڸ��� ���� ====  ù��° ���� + ù��° ���� +
	//					  ù��° ���� + ù��° ���� + ù��° ����
	
	//5
	//fibonacci(5)  -> 5�ڸ�
	//fibonacci(5) = fibonacci(4) + fibonacci(3)
	//fibonacci(4) = fibonacci(3) + fibonacci(2)
	//fibonacci(3) = fibonacci(2) + fibonacci(1)
	//fibonacci(2) = fibonacci(1) //1
	//fibonacci(1) = 1
	//				1 1 2 3 5 (���) �˰������
	static int fibonacci(int n) { //���° �ڸ��� ���ڸ� ���ϴ� ģ��
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
		
		
		
	}
}
