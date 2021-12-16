package chap7;

public class BubbleSort_ex01 {
	public static void main(String[] args) {
		int arr_MIN_VALUE;
		int arr_MAX_VALUE;
		// 버블정렬
		// 오름차순기준 큰값이 뒤로감
		
		/*
		 * -> 맨 마지막부터 고정 (최소값, 최대값)
		 *  -> 두자리씩 비교 ->
		 *  n-1번 반복
		 * 
		 */
		int[] arr = { 8, 2, 14, 7, 5 };
		BubbleSort(arr);
		System.out.println(); // 2, 5 , 7 ,8 ,14 Array.to String(arr)
	}

	// 퀴즈 버블정렬 오름차순
	static void BubbleSort(int[] arr) {
		//반복(회전-싸이클)
		for(int i=1; i<arr.length; i++) { //i 1~크기 총반복 n-1
			//j 0~n-1 총 n번 반복 1: n-1, 2: n-2
			//비교횟수
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
		 *for (int i = 0; i < arr.length - 1; i++) {// i가 배열길이만큼 증가
			for (int j = 0; j < arr.length - 1 - i; j++) {// j가 배열길이만큼 증가
				if (arr[j] > arr[j + 1]) {// 배열에서j의 값이 배열 j+1 보다 크면
					// //비교 조건문?
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		 for(int i:arr) {
	          System.out.print(i+" ");
	          }


		// for (int i = 0; i < arr.length; i++) {// 5까지 증가
		// for(int j=0; j<; i++) { //MIN_VALUE

		// }

		// }
	} 
		 */

}
}