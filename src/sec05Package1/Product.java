package sec05Package1;

public class Product {
	//제품의 가격
	int price;
	//제품 구매시 제공하는 포인트
	int bonusPoint;
	
	//디폴트 생성자(기본생성자) - 없으면 TV 기본생성자 에러
	Product() {
		System.out.println("부모 기본생성자");
	}
	
	Product(int price){
		System.out.println("부모 생성자");
		this.price = price;
		bonusPoint = (int)(price/10.0);//double형을 int형으로 쓰면 반올림?
	}
	
	public void print() {
		System.out.println("가격: "+price+",포인트: "+bonusPoint);
	}

}
