package chap09;

import java.util.Arrays;

public class InsertionSort_ex01 {
public static void main(String[] args) {
	//삽입 정렬
	//두번째요소부터 끝까지 하나씩 꺼내서 -> 꺼낸요소를
	//기준으로 왼쪽(앞쪽)에 있는 요소들을 비교
	int[]arr = {8, 2, 14, 7, 5};
	InsertionSort(arr);
	System.out.println(Arrays.toString(arr));
}
//삽입정렬 오름차순
static void InsertionSort(int[] arr) { 
	//회전수 반복 - i -> 1회전...
	for(int i=1; i<arr.length;i++) {
		int target = arr[i];
		
		int j;
		//회전자리(회전수랑 같은 index 자리)앞에있는 요소들하고 비교하는 반복문 필요
		//앞에있는 요소 -> 정렬
		//index 큰 것부터 비교 
		//1회전 0
		//2회전 1 0
		//3회전 2 1 0 뒤에서부터 앞으로 꺼내옴
		//n회전 n-1....0
		for(j=i-1; j>=0; j--) {
			if(arr[j]>target) {
			arr[j+1] = arr[j];
			}else {
				break;
			}
		}
		
		//j+1 -> j -> (오름차순) j자리가 기준보다 작은거
		for(j = i-1; j>0 && arr[j]>target; j--) {
		arr[j+1] = target;
		}
	}
}
}
