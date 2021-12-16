package 정리;

public class Summary6_1 {
	public static void main(String[] args) {
		//new 생성자(); -> 클래스 객체를 생성하고 주소값을 반환
		Pet2 pet1 = new Pet2();
		Cat2 cat1 = new cat2();
		
		System.out.println("강제타입변환");
		static void printSound(Pet2 pet) {
			pet.Sound();
		}
	}

	class Pet2 {
		void Sound() {
			System.out.println("애완동물 울음소리");
		}
	}

	class Dog extends Pet2 {
		// 오버라이딩
		@Override
		void Sound() {
			System.out.println("멍멍");
		}

		void bite() {
			System.out.println("깨물다");
		}
	}

	class Cat2 extends Pet2 {
		@Override
		void Sound() {
			System.out.println("냐옹");
		}

		void scratch() {
			System.out.println("할퀴다");
		}
	}
}