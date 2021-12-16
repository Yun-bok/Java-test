package chap10;

import java.util.Arrays;

public class QuickSort_ex01 {
public static void main(String[] args) {
	//퀵 정렬
	
	//피벗 -> 정렬 기준 -> 각 상황별 피벗에 따라 효율 달라짐
	//-> 일반적으로 처음 중간 끝 피벗으로 사용
	
	//피벗 중앙 퀵정렬
	// left right 양끝(현재 검사중인 위치)
	//(오름차순 기준)
	// left(0)에 있는 값중 피벗보다 큰값이 올때까지 idx증가
	// right(length-1)에 있는 값증 피벗보다 작은값 올때까지 idx 감소
	//left right 고정되면 교환 -> 반복
	//(특이케이스 left,right 피벗 만나면 스탑)
	//left right 교차하면 정지 -> 피벗 기준 좌측 작은값, 우측 큰값 -> 1회전
	
	//피벗 좌측 -> 정렬반복  우측 정렬 반복
	//좌측 우측 -> 크기가 1 or 0 일때까지
	
	// 0 0 0 0 0 0 0 0 0 0 0 
	//			 p
	// 0 0 0 0 0    0 0 0 0 0 
	//     p            p
	// 0 0   0 0    0 0   0 0 0
	// p     p      p     p
	//   0     0      0     0 0
	//                      p 
	//                      퀵정렬
	//좌우측 크기 0또는 1일때
	
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
	
	//기준이 되는 pivot idx = 배열크기/2;
	// 배열크기 = 시작idx+끝idx
	
	int pivot_index =(left+right)/2;
	//기준 pivot
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
		
		//교차했는지 확인
		if(i>=j) {
			break;
		}
		
		//1 7 5 5 4 5
		//i(left)== pivot && (right)==pivot
		if(arr[i]==pivot && arr[j]==pivot) {
			i++;
			continue;
		}
		//교환
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//작은값 리스트         기준        큰값리스트
	Quicksort(arr,left,i-1); //작은값 리스트 퀵정렬
	Quicksort2(arr,i+1,right);//큰값 리스트 퀵정렬
	// 작은값 리스트 기준 큰리스트
}
}

