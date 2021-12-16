package sec07;

public class ex01 {
	public static void main(String[] args) {

	//다형성
	//한자 -> 많은 상태를 가지는 성질
	//동일한 타입을 사용하지만 다양한 결과가 나오는 성질
	//다양한 객체를 이용할수 있는 성질
	//하나의 타입에 여러 객체를 대입할 수 있다.
	//부모타입은 모든 자식 객체가 대입될 수 있다.
	
	//double dou = 4; //정수인데 더큰 더블로 타입변환이 가능하다
	//클래스 타입변환
	//자동 타입변환
	//부모 클래스 변수 = 자식클래스 타입 객체;
	//자식->부모(부모의부모) 자동으로 타입변환 가능
	//부모의 타입으로 변하면 객체는 부모에 선언된 필드와 메서드만 호출가능
	//오버라이드 된 메서드는 자식의 메서드 호출
	//필드의 다형성
	pet pet1 = new pet(); //Pet 클래스 타입인 pet1 생성
	pet pet2 = new Cat(); //Cat 클래스 타입->  Pet변환 pet2 생성
	dog dog1 = new dog(); //Dog클래스타입 dog1객체 생성
	pet pet3 = dog1;
	
	pet1.Sound();
	pet2.Sound();
	pet3.Sound();
 
	//같은클래스로 여러개의 객체를 넣어실행 이게 다형성이다 , 객체지향은 자주나오는 단골문제다
	
	//배열로 사용하는 방법
	//타입[] 변수이름 = new 타입[size];{3,2,1}
	
	pet[] pet_arr2 = new pet[3];
	pet_arr2[0] = new pet();
	pet_arr2[1] = new Cat();
	pet_arr2[2] = new dog();
	
	System.out.println("배열로 사용하는방법");
	pet[] pet_arr = {new pet(), new Cat(), new dog() };
	for(int i=0; i<pet_arr.length; i++) {
		pet_arr[i].Sound();
	}
	
	for(pet pet : pet_arr) {
		pet1.Sound();
	}
	
	//매개변수의 다형성
	//매개변수에 클래스 들어갈때
	
	//부모타입으로 형변환된다
	System.out.println("매개변수의 다형성");
	printSound(pet1);  //Pet
	printSound(pet2);  //Cat -> Pet
	//Dog dog2 = new Dog();
	//printSound(dog2);  //Dog -> pet
	
	//강제 타입변환(Casting)
	//부모 -> 자식타입을 변환
	//조건 : 자식 -> 부모 ->자식
	//자식타입에서 부모타입으로 자동변환후 자식으로 다시 바꿀때 가능
	//필요한경우
	//자식 타입에 선언된 필드와 메서드를 다시 사용해야 할때
	//(부모로 변환하면 부모의 필드와 메서드만 사용가능해서
	//pet2.scratch(); //Cat
	//pet3.bite(); 	  //Dog
	System.out.println("강제 타입변환");
	pet pet4 = new Cat(); //자동 타입변환 -Cat(자식) -> Pet(부모)
	Cat cat_a = (Cat)pet4;
	cat_a.scratch();
//	dog dog3 = (dog)pet4; //Cat -> Pet -> Dog 에러
//	dog3.bite();
	
	//객체 타입확인
	//좌측 instanceof 우측
	//좌측은 확인하고 싶은객체 우측 클래스 확인하고 싶은 타입
	boolean result = pet4 instanceof Cat; //잘못된 타입변환을 안하기 위해선 이런과정이 필요하다
	if(result) {// 안전하게 바꿔줄수있다
		Cat cat2 = (Cat)pet4;
		cat2.scratch();
	}
	
	}
	static void printSound(pet pet) {
		pet.Sound();
		
	}
}

class pet{//공부하기 쉽게 한페이지에 정리 //부모는 펫이고 밑에가 자식들이다
	void Sound() {
		System.out.println("애완동물 울음소리");
	}
}
class dog extends pet{
	@Override //부모에게 상속받아서 재정의
	void Sound() { //pet에 sound를 재정의
		System.out.println("멍멍");
	}
	
	void bite() {
		System.out.println("깨물다");
	}
	
}
class Cat extends pet{
	@Override
	void Sound() {
		System.out.println("야옹");
	}
	
	void scratch() {
		System.out.println("할퀴다");
	}
}
