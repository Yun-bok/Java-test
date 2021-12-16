package 정리;

public class star {
	public static void main(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		//for문은 목적을 정해주고 , 시작과 끝을 얼만큼 증가하면서 반복
		int num = 4;
		
		//행을 나타내는 for i : 0~num-1 -> num 반복 1증가하면
		//i
		//0      공백 3   별 1    j   4  3  2  1    i 0   j 4 3 2   1
		//1      공백 2   별 2    j   4  3  2  1    i 1   j 4 3   2 1
		//2      공백 1   별 3    j   4  3  2  1    i 2   j 4   3 2 1
		//3      공백 0   별 4    j   4  3  2  1     
		
		//i   행	j열
		//0      공백 3   별 1    j   3  2  1  0    i 0   j 3 2 1   0
		//1      공백 2   별 2    j   3  2  1  0    i 1   j 3 2   1 0
		//2      공백 1   별 3    j   3  2  1  0    i 2   j 3   2 1 0    
		//3      공백 0   별 4    j   3  2  1  0 
		
		
		//규칙을 만드러야함
		// 공백 num-(i+1)   별 i+1 정도
		for(int i=0; i<num; i++) {
			//열을 나타내는 for
			for(int j=0; j<num; j--) {
				if(j>i+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
	}
}
