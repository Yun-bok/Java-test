package pa0923����Ʈ����;

public class em3��� {
	public static void main(String[] args) {
		//��� (��� �޼���)
		//������ �ذ��ϱ� ���� �ڽ��� �˰���(�޼���)�� �̿��Ͽ� �ذ��ϴ� ��
		//**��Ģ ã�Ⱑ �߿� -> �˰��� �׽�Ʈ���� ������ ������ �����غ��� Ǯ����� �ͼ�����
		//***** Ż�� ���� -> ��ʹ� ������ �ذ��ϱ� ���ؼ� �ڱ��ڽ�(�޼���) ȣ��
		//-> ���� ȣ�� -> ���� �����÷ο� �߻�
		
		//print();
		
		//�Ϲ����� �˰��� ����
		//���丮��, �Ǻ���ġ ����, �ϳ��� Ÿ�� , ������ �˰���, ���� Ž�� Ʈ�� ��
		int result = sum(10);
		System.out.println(result);
		
		int result2 = mul(5);
		System.out.println(result2);
	}
	
	//1~n������ ���ڸ� ���Ͻÿ�
	//n~5
	//1,  2,  3,  4,  5
	//1, n-3, n-2, n-1 , n
	//n n-1 n-2 n-3 ......1
	//sum(5) => ???
	//sum(10)
	
	public static int sum(int n) {
		if(n==1) {
			return n;
		}
		return n + sum(n-1);
		//n+ sum (n-1)  // 5 + sum(4)
		//n +           // 5 + 4 + sum(3)
		                //5 + 4 +   3 + sum(2)
					    //5 + 4 + 3 +   2+ sum(1)
					    //5 + 4 + 3 +   2+   1 +sum(0)
	}
	
	//1~n ������ ��
	//n*n-1*n-2*n-3 ,,,,, 1
	//mul(3)
	public static mul(int n) {
		if(n==1) {
			return n;
		}
		return n*mul (n-1);
		//n* n-1 * mul(n-2)
		//n* n-1 * n-2 *mul(n-3),,,,,, n-? =1
		//3 * 2 * 1
	}
	
	static void print() {
		System.out.println("���");
		print();
		//Ż�������� ��� ���ѹݺ����� -> ���� ���ÿ����÷ο�
	}

}
