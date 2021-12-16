package chap10;

import java.util.Arrays;

public class ShellSort_ex01 {
	public static void main(String[] args) {

	}

	// 셀 정렬
	// 삽입 정렬 단점보완
	// 회전수 = idx 기준으로 좌측비교(정렬)
	// 5 4 3 2 1
	// 삽입정렬(오름차순)
	// 1회전 -> 4
	// 5<4 -> 4 5 3 2 1
	/*
	 * 2회전 3 5<3 -> 4 5 2 1 4<3 -> 3 4 5 2 1 3회전 2 5<2 -> 3 4 5 1 4<2 -> 3 4 5 1 3<2
	 * -> 2 3 4 5 1
	 * 
	 * 4회전 1 5<1 -> 2 3 4 5 4<1 -> 2 3 4 5 3<1 -> 2 3 4 5 2<1 -> 1 2 3 4 5
	 * 
	 * 
	 * 셀 정렬 -> 삽입정렬 요소의 이동 횟수를 감소시키려고 특정 간격으로 묶어서 부분배열(간격이랑 부분배열 갯수는 같음) 부분배열들을 각각
	 * 삽입 정렬(1회전) ->상황마다 간격, 줄어지는 간격마다 효율이 달라진다
	 * 
	 * 간격줄이고, 줄어진 간격으로 다시 묶어서 삽입정렬 간격 1이 될때까지 반복 간격<-> 부분배열 개수
	 *
	 * 
	 */
	int[] arr = { 5, 4, 3, 2, 1 };

	ShellSort(arr);
	System.out.println(Arrays.toString(arr));
}
static void ShellSort2(int[] arr) {
	//간격 : 배열크기 / 2    줄어든 간격 = 간격/2
	for(int gap = arr.length/2 ; gap>0; gap = gap / 2) {
		//ShellSort 부분배열 -> 삽입정렬을 마무리 각 부분배열 삽입열 1~3
		//ShellSort2 부분배별 -> 모든부분배열 삽입정렬 1회전     2회전
		//(1회전시 모든 부분배열 1회전 -> 2회전)
		//5 4 3 2 1
		//0 1 2 3 4
		//gap = 2
		// i 2 3 4
		for(int i = gap; i<arr.length; i++) {
			int j;
			int target = arr[i];
			for(j = i - gap;  j >= 0 && arr[j] > target; j = j - gap) {
				//삽입 정렬을 위해 한칸 씩 미뤄준다
				arr[j+gap] = arr[j];
			}
			arr[j+gap] =
			
		}
	}
}

//셀 정렬 오름차순 		간격-> gap 배열크기/2   줄어든 간격 = 현재간격 /2 ........ 간격 1일때까지 
//5 , 4, 3, 2, 1
//간격 = 배열크기/2 , 줄어드는 간격은 = 간격 / 2
//gap = 2,  gap = gap / 2
//5     3    1    ->삽입정렬  -> 1   3    5
//   4     2      ->삽입정렬  ->   2   4
//1 2 3 4 5
//gap = 1
// 1 2 3 4 5 -> 삽입정렬
	static void ShellSort(int[] arr) {
		System.out.println(Arrays.toString(arr));
		// 간격 : 배열의 크기 / 2 줄어드는 간격 = 간격 / 2
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// 부분배열을 표시하기 위한 반복
			// 부분배열의 갯수는 간격과 일치하기때문에 -> gap
			// 부분배열의 시작 index 0~gap-1
			// startindex 0 +1 gap-1
			for (int startindex = 0; startindex < gap; startindex++) {
				// 삽입정렬
				insertionSortByGap(arr,gap,startindex);
			}
		}
	}
	//(배열,간격,부분배열의 시작 idx)
	static void insertionSortByGap(int[] arr, int gap, int startIndex) {
		//삽입정렬
		//1회전 idx1 요소 -> 두번째 요소 꺼내서 왼쪽 비교
		//2회전 idx1 요소 -> 세번째 요소 꺼내서 왼쪽 비교
		//5  3  1 ->
		//0  2  4 
		//  4    2   6
		//  1    3   5
		for(int i=startIndex+gap; i<arr.length; i = i+gap) {
			int j;
			int target = arr[i];
			
			// 5 4 3 2 1
			// 5   3   1
			
			//간격 1
			//for(j = i-1; j>=0 && arr[j]>target; j--) {
			for(j= i-gap; j>=0 && arr[j]>target; j = j-gap) {
				//arr[j+1] = arr[j];
				arr[j=gap] = arr[j];
			}
		  //arr[j+1]   = target; 
			arr[j+gap] = target;
		}

}