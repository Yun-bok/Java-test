package ����;

public class Summary3 {

	public static void main(String[] args) {
		//����Ÿ�� Ŭ����, �迭, �������̽�, ����
		int num = 3; //num -> ��
		String str = "���ڿ�"; //str -> ���(��)�� ���� String ��ü�� ����Ű�� �ּҰ�
		String str2 = "���ڿ�";
		String str3 = new String("���ڿ�");
		//����Ÿ�� �񱳴� �ּҰ��� ���� ��ü���� Ȯ��
		boolean result = str ==str2; // == ->true , false
		boolean result2 = str == str3;
		System.out.println(result);
		System.out.println(result2);
		//=>equals()�� ��
		boolean result3 = str.equals(str3);
		System.out.println(result3);
		
		//�迭
		// �Ÿ���� ��������� ������ ������ ��
		//Ÿ��[]
		//      (Ÿ�� ��)   (Ÿ�� ��)   (Ÿ�� ��)   (Ÿ�� ��) 
		//index    0          1          2         3
		//�迭����
		//Ÿ��[] �����̸�;
		int[] int_arr;
		//�迭�ʱ�ȭ �� �� ����
		//int[] int_arr = new int[3];
		//int_arr[0] = 1;
		//int_arr[1] = 2;
		//int_arr[2] = 3;
		//int[] int_arr3 = new int[] {1,2,3}
		//int[] int_arr4 = int[] {1,2,3}
		
		//�迭�� �� ���
		//for(int num : int_arr2) {
		//	System.out.println(num2);
		//}
		//for(int i=0; i<int_arr2.length; i++) {
		//	System.out.println(int_arr2[i]);
		//}
		
		
		//������ �迭 -> ��� �� ->�迭�� ������ ������ �迭�̴�
		//int[] int_arr = {1,2,3};
		//  	 1     2     3
		//	    int   int   int    int�����Ұ��� 3����~
		//    arr[0] arr[1] arr[2]
		//int[] arr2 = {4,5};
		//��[]�� , ��[] ��
		//��[] �迭�� ��[] ���ڸ� �ִ�.
		//int[][] arr3 = new int[2][];
		//arr3[0] = arr;   // 1  2  3
		//arr3[1] = arr2;  // 4  5
		
		//int[] arr = {1, 2, 3}
		//int[] arr2 = {4, 5}
		//int[] arr3 = new int[2][];
		//{1, 2, 3}
		//{4, 5}
		//int[][] arr4 = {{ 1, 2, 3},{4, 5, 6}};
		
		//�������迭�� length -> ���� ���� �ǹ�
		//arr3.length
		//for(int x = 0; x<arr3.length; x++) {
			//�������迭[idx].length -> idx��° ���� ������
			//for(int y=0; y<arr3[x].length;y++) {
		//		(System.out.println(  "arr3[x+","+y+"]="+arr[x][y]; );
		//	
		//}
		
		//������ �迭 ����
		//�ﰢ�� �����
		//      *
		//     **
		//    ***
		//   ****
		int num5 = 4;
		char[][] char_arr = new char[num5][num5];
		//��
		for(int x=0; x<char_arr.length;x++) {
			//�� �࿡ ���� ���� ����
			for(int y=0; y<char_arr.length;y++) {
				// x �� y ��
				// 0,0   0,1   0,2   0,3
				// 1,0   1,1   1,2   1,3
				// 2,0   2,1   2,2   2,3
				// 3,0   3,1   3,2   3,3
				//****
				//****
				//****
				//****
				//                                         num5/2-i
				//   *   0,0  0,1  0,2   0~2���� ���   num5 2-0
				//  **   1,0  1,1   	 0~1		  num5 2-1
				// ***   2,0   	 		 0~0          num5 2-0
				//****
				
				char_arr[x][y] = '*';
			}
			for(int y=0; y<=num5/2-x;y++) {
				char_arr[x][y] = '*';
			}
		}
		
		for(char[] carr:char_arr) {
			for(char c_val: carr) {
				System.out.println(c_val);
			}
			System.out.println();
		}
		//String

	}

}
