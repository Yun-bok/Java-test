package 이윤복0923e;

import java.util.ArrayList;
import java.util.Scanner;

public class 이윤복0923 {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Integer> arrlist = new ArrayList<Integer>();
	static LinkedList<Integer> linkedList = new LinkedList<Integer>
	/*
	 * Q1) 초기입력을 받아 다음과 같이 동작하는 프로그램을 만드시오 1.숫자 저장, 2저장된 숫자 합 출력, 3저장된 숫자 전체 출력, 4
	 * 삭제 idx 1-> 1, 2, 3, 4, 5
	 * 
	 * 
	 * 1.숫자:(입력) 2.저장된 숫자의 합: 출력 15 3.저장된 숫자 전체출력 1 2 3 4 5 4.삭제할 idx입력 : (입력) 4 ->
	 * 5 가 삭제 5.삭제할 값 입력 : (입력) 4 -> 4 가 삭제
	 */

	public static void main(String[] args) {
		while (true) {
			System.out.println("-----------");
			System.out.println("1.숫자 저장, 2저장된 숫자 합 출력, 3저장된 숫자 전체 출력, 4 삭제 idx");
			System.out.println("-----------");
			
			int num = Integer.parseInt(input.nextLine());
			switch(num) {
			case 1:  number_add(); break;
			case 2:  numberlist_sum();break;
			case 3:  numberlist_selectall();break;
			case 4:  numberlist_delete_fromidx();break;
			case 5:  numberlist_delete_fromvalue();break;
			}
		}

	}
	//숫자저장
	static void number_add() {
		System.out.println("숫자 :");
		int inputnum = Integer.parseInt(input.nextLine());
		//ArrayList  .add(요소)  요소 추가
		arrlist.add(inputnum);
	}
	
	//숫자리스트 전체 합
	static void numberlist_sum() {
		int sum = 0;
		for(int i = 0; i<arrlist.size(); i++) {
			sum += arrlist.get(i);
			//sum = sum + arrlist.get(i);
		}
		System.out.println(sum);
	//	for(int num : arrlist) {
			
//		}
	//}
}
	//숫자리스트 전체 조회
	static void numberlist_selectall() {
		for(int num : arrlist) {
			System.out.println(num+"");
		}
	}
	//숫자리스트 인덱스 삭제
	static void numberlist_delete_fromidx() {
		System.out.println("idx : ");
		int inputidx = Integer.parseInt(input.nextLine());
				arrlist.remove(inputidx);
			
		}
		//숫자리스트 값으로 삭제
		static void numberlist_delete_fromvalue() {
			int inputnum = Integer.parseInt(input.nextLine());
			for(int i=0; i<arrlist.size(); i++) {
				if(arrlist.get(i)== inputnum) {
					arrlist.remove(i);
					return;
				}
		}
			System.out.println("해당값이 존재하지 않습니다.");
	}
}
