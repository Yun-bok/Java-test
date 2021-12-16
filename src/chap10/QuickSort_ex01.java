package chap10;

import java.util.Arrays;

public class QuickSort_ex01 {
public static void main(String[] args) {
	//�� ����
	
	//�ǹ� -> ���� ���� -> �� ��Ȳ�� �ǹ��� ���� ȿ�� �޶���
	//-> �Ϲ������� ó�� �߰� �� �ǹ����� ���
	
	//�ǹ� �߾� ������
	// left right �糡(���� �˻����� ��ġ)
	//(�������� ����)
	// left(0)�� �ִ� ���� �ǹ����� ū���� �ö����� idx����
	// right(length-1)�� �ִ� ���� �ǹ����� ������ �ö����� idx ����
	//left right �����Ǹ� ��ȯ -> �ݺ�
	//(Ư�����̽� left,right �ǹ� ������ ��ž)
	//left right �����ϸ� ���� -> �ǹ� ���� ���� ������, ���� ū�� -> 1ȸ��
	
	//�ǹ� ���� -> ���Ĺݺ�  ���� ���� �ݺ�
	//���� ���� -> ũ�Ⱑ 1 or 0 �϶�����
	
	// 0 0 0 0 0 0 0 0 0 0 0 
	//			 p
	// 0 0 0 0 0    0 0 0 0 0 
	//     p            p
	// 0 0   0 0    0 0   0 0 0
	// p     p      p     p
	//   0     0      0     0 0
	//                      p 
	//                      ������
	//�¿��� ũ�� 0�Ǵ� 1�϶�
	
	int[]arr = { 5, 4, 3, 2, 1};
	QuickSort(arr, 0, arr.length-1);
	System.out.println(Arrays.toString(arr));
}

static void QuickSort(int[] arr, int left, int right) {
	if(left>=right) {
		return;
	}
	
	int i = left;
	int j = right;
	
	//������ �Ǵ� pivot idx = �迭ũ��/2;
	// �迭ũ�� = ����idx+��idx
	
	int pivot_index =(left+right)/2;
	//���� pivot
	int pivot = arr[pivot_index];
	
	//i < j   left   right
	while(i<j) {
		// 5 4 3 2 1
		// 0 1 2 3 4
		//left0 right4
		//i 0
		while(arr[i]<pivot) {
			i++;
		}
		//j 4
		while(arr[j]>pivot) {
			j--;
		}
		
		//�����ߴ��� Ȯ��
		if(i>=j) {
			break;
		}
		
		//1 7 5 5 4 5
		//i(left)== pivot && (right)==pivot
		if(arr[i]==pivot && arr[j]==pivot) {
			i++;
			continue;
		}
		//��ȯ
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//������ ����Ʈ         ����        ū������Ʈ
	Quicksort(arr,left,i-1); //������ ����Ʈ ������
	Quicksort2(arr,i+1,right);//ū�� ����Ʈ ������
	// ������ ����Ʈ ���� ū����Ʈ
}
}

