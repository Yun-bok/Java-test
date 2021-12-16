package chap001;

import java.util.Arrays;

public class ex03 {
//page 27 //얇은복사 깊은복사 시험암시발언함..
	//얇은복사
	public static void main(String[] args) {
		String[] folderA = {"myComputer", "myDocument"};
		
		//folderA.length // --> ???
		
		String[] folderB = folderA;
		
		System.out.println("[사본 배열의 값 변경 전] 원본배열:"
			+ Arrays.toString(folderA));
		
		folderB[0] = "newFolder"; // 사본배열의 첫 번째 인덱스 값 변경
		folderA[1] = "new3";
		folderA[1] = "newFolder2";
		System.out.println("[사본 배열의 값 변경 후] 원본 배열: "
				+Arrays.toString(folderA));
		System.out.println("[사본 배열의 값 변경 후] 원본 배열: "
				+Arrays.toString(folderB));
		
		System.out.println("깊은 복사");
		String[] folA = {"myComputer","myDocument"};
		String[] folB = new String[folA.length];
		
		System.out.println("[사본 배열의 값 변경 전] 원본 배열 :"
				+Arrays.toString(folA));
		
		//원본 {"myComputer","myDocument"};
		//사본 {"",""}
		//반복 {"myComputer",""}
		//    {"myComputer","myDocument"};
		
		for(int i=0; i<folA.length; i++) {
			folB[i] = folA[i]; // folA -> 주소값 folA[idx] -> 값
		}
		
		folB[0] = "newFolder"; // 사본 배열의 첫번째 인덱스값 변경
		//원본 {"myComputer","myDocument"};
		//사본 {"newFolder","myDocument"}
		System.out.println("[사본 배열의 값 변경 후] 원본배열:"
				+Arrays.toString(folA));
		System.out.println("[사본 배열의 값 변경 후] 원본배열:"
				+Arrays.toString(folB));
		
		//일반적으로 프로그래밍 -> 복사는 깊은복사
		//사본 -> 원본을 훼손하지않겠단 의미 훼손X
		
		//복사방법
		//Object -> 최상위 클래스 ->모든 클래스들이 가져야할 필드, 메서드
		//clone -> 복사하는 기능 -> 깊은복사
		String[] testA = {"origin","oring2"};
		String[] testB = new String[] {"origin","oring2"};
		String[] folC = folA.clone(); //-> 깊은복사
		String[] folD = folA; // -> 얇은복사
		
		folC[0] = "clone";
		folD[0] = "colne";
		
		
		System.out.println("[사본 배열의 값 변경 후] 원본testA배열:"
				+Arrays.toString(testA));
		System.out.println("[사본 배열의 값 변경 후] 원본testB배열:"
				+Arrays.toString(testB));
		System.out.println("[사본 배열의 값 변경 후] 원본folC배열:"
				+Arrays.toString(folC));
		System.out.println("[사본 배열의 값 변경 후] 원본folD배열:"
				+Arrays.toString(folD));
		
		
		//page30 -> 제공해주는 기능 -> 사용법 -> 검색할수 있는 수준
		//코딩테스트를 봐야하면 외워야하고 실무면 검색할정도
		//System.arraycopy 이것들은 알아서 사용해보고 이런게 있구나 하자
		//Arrays.copyOf
		//Arrays.copyRange
	}
	static void array() {
		
	}

}
