package algori;

public class a {
public static void main(String[] args) {
	//�迭�� ����
	//�迭�Ǻ���
	//������ �迭
	//�迭�� ������ ������ �迭 �̶�� ����
	// ������ �迭 ->  {1, 2, 3, 4 }
	//		    -> { 5, 6, 7 }
	int val1 = 1;
	int val2 = 2;
	int val3 = 3;
	int val4 = 4;
	int[] arr1= {1,2,3,4};
	int[] arr2= {5,6,7};
	int[][] arr3 = {{1,2,3,4},{5,6,7}};
	
	
	System.out.println("�������迭");
	System.out.println("arr3[2][1] : "+arr3[1][2]);
	//������ �迭 ���
	//arr3.length ���� ���� -> �������迭�� ����
	for(int i=0; i<arr3.length; i++) {
		for(int j=0; j<arr3[i].length;) {
			System.out.println(arr3[i][j]); // 1 2 3 4 5 6 7
		}
	}
	System.out.println(arr3);
	 
}
}
