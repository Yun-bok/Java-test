package chap09;

import java.util.Arrays;

/*�ڷᱸ�� ������ ����..
 * �̸�0927.java -> ������� ���� �������� 9��29�� ���������� �ð������� �ȹ�
 * 
 * Q1)�������� ��������
 * 
 * Q2)�������� ��������
 * 
 * Q3)�������� ��������
 * 
 * 
 */
public class ������0927 {
	public static void main(String[] args) {
	int[]arr = {8, 2, 14, 7, 5};
		 
		// q1(arr);
		// q2(arr);
		 q3(arr);
	}

	

	// 2, 5 , 7 ,8 ,14 Array.to String(arr)
	static void q1(int[] arr) {

		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j] + 1) { // ������⸸�ٸ�?
				
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		
			System.out.println(Arrays.toString(arr));
		

	}

	static void q2(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		 
			System.out.println(Arrays.toString(arr));
		
	}


	static void q3(int[] arr) {
		for(int i=1; i<arr.length;i++) {
			int target = arr[i];
			
			int j;
			
			
			for(j = i-1; j>0 && arr[j]>target; j--) {
				arr[j+1] = target;
				}
	}
		
		System.out.println(Arrays.toString(arr));
	
	}
}
