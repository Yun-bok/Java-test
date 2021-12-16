package 이윤복0909;
/*
Product 클래스
-필드: 가격, 할인율
-생성자 2개 매개변수
-메서드: getter(기본), setter(기본), 
print() -> 출력 :"할인가격 : " + 가격 * 할인율
*/
class Product {
	int price;
	double Dc;

	public Product() {
		
	}
	
	public Product(int price, double Dc) {
		this.price = price;
		this.Dc = Dc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDc() {
		return Dc;
	}

	public void setDc(double Dc) {
		this.Dc = Dc;
	}

	void print() {
		System.out.println("할인가격 : " + (price * Dc));
	}

}
