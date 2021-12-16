package 이윤복0910;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine(); // 밑 abc에 str을 넣으면 입력받은 문자열의 수를 돌릴수있다
		char[] ch_arr = str.toCharArray();
		// char -> 'a' 문자타입 저장하는 공간 가지는 변수 //a가여러가지 저장할수있다
		// char[] ->같은 타입의 값을 여러개 저장할수있는 공간
		// char ('a') ('b') ('c')
		// ch_arr[0] ch_arr[1] ch_arr[2] 1씩증가하면서 가져올수있다
		// 4줄이면 배열의 기본

		// 갖고올때 인덱스 씀
		int count = 1;
		// 왼쪽문자부터 나머지 문자랑 비교
		// a 를 꺼내서 b를 꺼내서 c를꺼내서 이런식
		// 왼쪽의 문자는 이미 비교를 했으니까 체크x 우측비교
		for (int i = 0; i < ch_arr.length; i++) {// 0부터 length 문자배열의 길이 0~7까지
			// ch_arr[i] -> 왼쪽부터 값을 가져오는 기능을한다 계속반복하며 1씩증가하며

			// 배열의 크기만큼 반복하면 꺼내올수있는 기능
			// i+1 이면 i가 a일때 j는 b부터 돌린다
			if (ch_arr[i] != ' ') {
				for (int j = i + 1; j < ch_arr.length; j++) { // 위에하나꺼내올때 얘는 다꺼낼수있다 $
					// i = 0 , j = 1 2 3 4 5 6 7 ( 1반복 끝나고 2반복 끝나고 3...
					if (ch_arr[i] == ch_arr[j]) {
						count++; // 같을때마다증가
						ch_arr[j] = ' ';// 공백생성 $반복
					}
				}
				System.out.println(ch_arr[i] + "=" + count);
				count = 1;
			}
		}

	}
}
/*
 * 
 * q1)char[](문자배열)에서 같은 문자의 갯수를 출력하시오. (공백을제외한 모든문자) char[]ch_arr =
 * "abcdadcc".toCharArray(); //a두개 b1개 이안에 이런식 a =2 b - 1 갯수 c - 3 d - 2 char[]
 * ch_arr ch_arr[0] a ch_arr[1] b ch_arr[2] c ----- for(int i=0;
 * i<ch_arr.length; i++){ i가1이면j가2니까 0부터 1에서 7까지 비교하겠다 반복문안에서 //i==0 j 1~7 무슨문자로
 * 갯수가몇갠지 for(int j = i+1; j<ch_arr.length; j++){ //abcdadcc //같은게있으면 카운트 증가
 * //중복으로겹치면 카운트 //같은친구를 ' ' } }
 * 
 * 
 */
