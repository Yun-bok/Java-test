package chap7;

public class BubbleSort_ex01 {
	public static void main(String[] args) {
		int arr_MIN_VALUE;
		int arr_MAX_VALUE;
		// ��������
		// ������������ ū���� �ڷΰ�
		
		/*
		 * -> �� ���������� ���� (�ּҰ�, �ִ밪)
		 *  -> ���ڸ��� �� ->
		 *  n-1�� �ݺ�
		 * 
		 */
		int[] arr = { 8, 2, 14, 7, 5 };
		BubbleSort(arr);
		System.out.println(); // 2, 5 , 7 ,8 ,14 Array.to String(arr)
	}

	// ���� �������� ��������
	static void BubbleSort(int[] arr) {
		//�ݺ�(ȸ��-����Ŭ)
		for(int i=1; i<arr.length; i++) { //i 1~ũ�� �ѹݺ� n-1
			//j 0~n-1 �� n�� �ݺ� 1: n-1, 2: n-2
			//��Ƚ��
			for(int j=0; j<arr.length-i; j++) {
				//i 1 j0 1 2 3
				//i 2 j0 1 2 
				//i 3 j0 1 
				//i 4 j0 
				if(arr[j]>arr[j]+1) {
					
				}
			}
			
		}
		/*
		 *for (int i = 0; i < arr.length - 1; i++) {// i�� �迭���̸�ŭ ����
			for (int j = 0; j < arr.length - 1 - i; j++) {// j�� �迭���̸�ŭ ����
				if (arr[j] > arr[j + 1]) {// �迭����j�� ���� �迭 j+1 ���� ũ��
					// //�� ���ǹ�?
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		 for(int i:arr) {
	          System.out.print(i+" ");
	          }


		// for (int i = 0; i < arr.length; i++) {// 5���� ����
		// for(int j=0; j<; i++) { //MIN_VALUE

		// }

		// }
	} 
		 */

}
}