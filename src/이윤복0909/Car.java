package 이윤복0909;
/*
Car -> Product 상속
- 필드: 세금
- 생성자 3개 매개변수
- 메서드: print() 오버라이딩 -> "할인가격 : " + 가격 * sdr-세금
*/
public class Car extends Product {
	int tax;
	
	public Car(int price, double Dc , int tax) {
		super(price, Dc);
		this.tax = tax;
		
	}
	
	@Override
	void print() {
		System.out.println("할인가격 : " + ((price * Dc)-tax));
	}
}

