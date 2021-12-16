package chap10;

import java.util.Arrays;

public class ShellSort_ex01 {
	public static void main(String[] args) {

	}

	// �� ����
	// ���� ���� ��������
	// ȸ���� = idx �������� ������(����)
	// 5 4 3 2 1
	// ��������(��������)
	// 1ȸ�� -> 4
	// 5<4 -> 4 5 3 2 1
	/*
	 * 2ȸ�� 3 5<3 -> 4 5 2 1 4<3 -> 3 4 5 2 1 3ȸ�� 2 5<2 -> 3 4 5 1 4<2 -> 3 4 5 1 3<2
	 * -> 2 3 4 5 1
	 * 
	 * 4ȸ�� 1 5<1 -> 2 3 4 5 4<1 -> 2 3 4 5 3<1 -> 2 3 4 5 2<1 -> 1 2 3 4 5
	 * 
	 * 
	 * �� ���� -> �������� ����� �̵� Ƚ���� ���ҽ�Ű���� Ư�� �������� ��� �κй迭(�����̶� �κй迭 ������ ����) �κй迭���� ����
	 * ���� ����(1ȸ��) ->��Ȳ���� ����, �پ����� ���ݸ��� ȿ���� �޶�����
	 * 
	 * �������̰�, �پ��� �������� �ٽ� ��� �������� ���� 1�� �ɶ����� �ݺ� ����<-> �κй迭 ����
	 *
	 * 
	 */
	int[] arr = { 5, 4, 3, 2, 1 };

	ShellSort(arr);
	System.out.println(Arrays.toString(arr));
}
static void ShellSort2(int[] arr) {
	//���� : �迭ũ�� / 2    �پ�� ���� = ����/2
	for(int gap = arr.length/2 ; gap>0; gap = gap / 2) {
		//ShellSort �κй迭 -> ���������� ������ �� �κй迭 ���Կ� 1~3
		//ShellSort2 �κй躰 -> ���κй迭 �������� 1ȸ��     2ȸ��
		//(1ȸ���� ��� �κй迭 1ȸ�� -> 2ȸ��)
		//5 4 3 2 1
		//0 1 2 3 4
		//gap = 2
		// i 2 3 4
		for(int i = gap; i<arr.length; i++) {
			int j;
			int target = arr[i];
			for(j = i - gap;  j >= 0 && arr[j] > target; j = j - gap) {
				//���� ������ ���� ��ĭ �� �̷��ش�
				arr[j+gap] = arr[j];
			}
			arr[j+gap] =
			
		}
	}
}

//�� ���� �������� 		����-> gap �迭ũ��/2   �پ�� ���� = ���簣�� /2 ........ ���� 1�϶����� 
//5 , 4, 3, 2, 1
//���� = �迭ũ��/2 , �پ��� ������ = ���� / 2
//gap = 2,  gap = gap / 2
//5     3    1    ->��������  -> 1   3    5
//   4     2      ->��������  ->   2   4
//1 2 3 4 5
//gap = 1
// 1 2 3 4 5 -> ��������
	static void ShellSort(int[] arr) {
		System.out.println(Arrays.toString(arr));
		// ���� : �迭�� ũ�� / 2 �پ��� ���� = ���� / 2
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// �κй迭�� ǥ���ϱ� ���� �ݺ�
			// �κй迭�� ������ ���ݰ� ��ġ�ϱ⶧���� -> gap
			// �κй迭�� ���� index 0~gap-1
			// startindex 0 +1 gap-1
			for (int startindex = 0; startindex < gap; startindex++) {
				// ��������
				insertionSortByGap(arr,gap,startindex);
			}
		}
	}
	//(�迭,����,�κй迭�� ���� idx)
	static void insertionSortByGap(int[] arr, int gap, int startIndex) {
		//��������
		//1ȸ�� idx1 ��� -> �ι�° ��� ������ ���� ��
		//2ȸ�� idx1 ��� -> ����° ��� ������ ���� ��
		//5  3  1 ->
		//0  2  4 
		//  4    2   6
		//  1    3   5
		for(int i=startIndex+gap; i<arr.length; i = i+gap) {
			int j;
			int target = arr[i];
			
			// 5 4 3 2 1
			// 5   3   1
			
			//���� 1
			//for(j = i-1; j>=0 && arr[j]>target; j--) {
			for(j= i-gap; j>=0 && arr[j]>target; j = j-gap) {
				//arr[j+1] = arr[j];
				arr[j=gap] = arr[j];
			}
		  //arr[j+1]   = target; 
			arr[j+gap] = target;
		}

}