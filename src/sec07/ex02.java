package sec07;

public class ex02 {

	public static void main(String[] args) {
		//추상클래스
		//공통된 특성을 추출
		//공통되는 필드와 메서드를 정의한 클래스
		//강아지,고양이 -> 애완동물
		//객체를 만들어서 사용하지 않을 클래스 -> 객체 생성불가   //객체를못만든다는 차이가크다
		//개발자마다 클래스의 필드와 메서드 이름이 다르다 -> 통일
		//추상메서드 사용가능
		//추상메서드 - 선언부만 작성, 실행부 {} 작성x
		//추상메서드 - 자식클래스에서 무조건 오버라이딩 해야한다.
		//Pet pet = new Pet(); 추상클래스 -> 객체생성 불가
		Dog dog = new Dog();
		dog.color = "빨간색";
		dog.bite();
		dog.Eat();
	}

}

abstract class Pet{ //abstract == 추상클래스 키워드
	String color;
	void Sound() {
		System.out.println("애완동물 울음소리");
	}
	//추상메서드
	abstract void Eat();
	
}
class Dog extends Pet{ //오류시 Dog에 마우스를 대면 첫번째==추상메서드를 뜨게끔 강제성을 띈다
	void bite() {
		
	}
	@Override
	void Eat() {
		// TODO Auto-generated method stub
		
	}

	
}
//class Cat extends Pet{

//	@Override
//	void Eat() {
		// TODO Auto-generated method stub
		
//	}
	
//}
