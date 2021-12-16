package chap08;

import java.util.Arrays;

public class SelectionSort_ex01 {

	public static void main(String[] args) {
		// ��������
		// ������ �ڿ������� ���� ������ �տ��� ����
		// �� �տ������� ����(�ּҰ�, �ִ밪)

		long start;
		long end;
		start = System.nanoTime();
		int[] arr = { 8, 2, 14, 7, 5 };
		SelectionSort(arr);
		System.out.println(Arrays.toString(arr));
		end = System.nanoTime();
		System.out.println("index��ü: " + (end - start) + "ns");

		arr[0] = 8;
		arr[1] = 5;
		arr[2] = 14;
		arr[3] = 7;
		arr[4] = 5;
		
		

	}
	/*
	 * for(int j=0; j<arr.length-i; j++) { //i 1 j0 1 2 3 //i 2 j0 1 2 //i 3 j0 1
	 * //i 4 j0 if(arr[j]>arr[j]+1) {
	 */
	// ���� ���� ���1 ��������

	static void SelectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			// ȸ���� 0~n-2 1~n-1
			int minIndex = i; // 1ȸ�� 0��° 2 1����
			// ȸ���ȿ� �ݺ� ��
			// j i+1 ȸ����-1��° ������
			// 1ȸ�� i -> 0
			// j 1 2 3 4
			// miniIndex = 0
			// 8 2 14 7 5
			// 8 2 -> minindex = 1
			// 2 14 -> minindex = 1
			// 2 7 -> minindex = 1
			// 2 5 -> minindex = 1

			for (int k = i + 1; k < arr.length; i++) {
				// ȸ���ڸ�
				if (arr[minIndex] > arr[k]) {
					minIndex = k;
				}
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;

			}

		}

	}

	static void SelectionSort2(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) { // i 0~n-1
			// 8 2 14 7 5

			// j 1 2 3 4
			// j=1 8>2 -> 2 8 14 7 5
			// j=2 8>14 -> 2 8 14 7 5
			// j=3 8>7 -> 2 8 14 7 5
			// j=4 8>5 -> 2 8 14 7 5

			// 2 8 14 7 5

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {// 1ȸ�� 0��°�ڸ� �ּڰ�
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
