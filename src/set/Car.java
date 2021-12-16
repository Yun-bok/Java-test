package set;

//Product 상속받음
public class Car extends Product {
//필드
	public double tex;

//생성자
	public Car(int price, int sale, double tex) {
	super(price,sale);
	this.tex = tex;
	
	@Override // 부모에게 상속받은 데이터 재정의
	public void print() {
		System.out.println("할인가격:" + price * sdr - tex + "포인트:" + price / 10);
	}
}
	
