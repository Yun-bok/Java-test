package 이윤복0909;


/*
TV -> broduct 상속
-필드: sdr (특별한 할인율)
-생성자 3개 매개변수
-메서드: print() 오버라이딩 -> "할인가격 : " + 가격 * sdr 
 */
class TV extends Product {	
	double sdr;
	
	
	public TV(int price, double Dc , double sdr) {
		super(price, Dc);
		this.sdr = sdr;
	}
	
	@Override
	void print() {
		System.out.println("할인가격 : " + (price * sdr));
	}
}