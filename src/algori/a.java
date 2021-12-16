package algori;

public class a {
public static void main(String[] args) {
	//배열도 나옴
	//배열의복사
	//이차원 배열
	//배열을 여러개 가지는 배열 이라고 생각
	// 일차원 배열 ->  {1, 2, 3, 4 }
	//		    -> { 5, 6, 7 }
	int val1 = 1;
	int val2 = 2;
	int val3 = 3;
	int val4 = 4;
	int[] arr1= {1,2,3,4};
	int[] arr2= {5,6,7};
	int[][] arr3 = {{1,2,3,4},{5,6,7}};
	
	
	System.out.println("이차원배열");
	System.out.println("arr3[2][1] : "+arr3[1][2]);
	//이차원 배열 출력
	//arr3.length 행의 갯수 -> 일차원배열의 갯수
	for(int i=0; i<arr3.length; i++) {
		for(int j=0; j<arr3[i].length;) {
			System.out.println(arr3[i][j]); // 1 2 3 4 5 6 7
		}
	}
	System.out.println(arr3);
	 
}
}
