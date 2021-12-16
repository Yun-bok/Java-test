package set;
//Product 상속받음
public class Tv extends Product{
	//필드
	public double sdr;
	
	//생성자 3개 매개변수
	public Tv(int price, int sale, double sdr) {
		super(price, sale);
		this.sdr = sdr;
	}
	public void sdr() {//특별한 할인율.. 임의로?
		double sdr;
		
		
	}


@Override // 부모에게 상속받은 데이터 재정의
	public void print() {
	System.out.println("할인가격:"+price*sdr+"포인트: "+(price/10));
}
}