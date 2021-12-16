package chap09;

import java.util.Arrays;

public class InsertionSort_ex01 {
public static void main(String[] args) {
	//���� ����
	//�ι�°��Һ��� ������ �ϳ��� ������ -> ������Ҹ�
	//�������� ����(����)�� �ִ� ��ҵ��� ��
	int[]arr = {8, 2, 14, 7, 5};
	InsertionSort(arr);
	System.out.println(Arrays.toString(arr));
}
//�������� ��������
static void InsertionSort(int[] arr) { 
	//ȸ���� �ݺ� - i -> 1ȸ��...
	for(int i=1; i<arr.length;i++) {
		int target = arr[i];
		
		int j;
		//ȸ���ڸ�(ȸ������ ���� index �ڸ�)�տ��ִ� ��ҵ��ϰ� ���ϴ� �ݺ��� �ʿ�
		//�տ��ִ� ��� -> ����
		//index ū �ͺ��� �� 
		//1ȸ�� 0
		//2ȸ�� 1 0
		//3ȸ�� 2 1 0 �ڿ������� ������ ������
		//nȸ�� n-1....0
		for(j=i-1; j>=0; j--) {
			if(arr[j]>target) {
			arr[j+1] = arr[j];
			}else {
				break;
			}
		}
		
		//j+1 -> j -> (��������) j�ڸ��� ���غ��� ������
		for(j = i-1; j>0 && arr[j]>target; j--) {
		arr[j+1] = target;
		}
	}
}
}
