package set;
/*Q1)
Product 클래스
-필드: 가격,  할인율
-생성자 2개 매개변수
-메서드 : getter(기본) ,setter (기본), 
print() -> 출력: "할인가격 :" +가격 *할인율+ "포인트 :" 가격/10
*/
public class Product {
	
	//필드
		
		private double Dc;
		private int price;
		
	//생성자
		public Product(int price, double Dc) {
			this.price = price;
			this.Dc = Dc;
		}
		
		//메서드
		public int setPrice() { //setter
			return price;
		}
		public double setDc(double Dc) {//getter
			this.Dc = Dc ;
			return Dc;
		}
		public void print() {
			System.out.println("할인가격: "+price*Dc +"포인트 :"+(price/10));
		}
		
		
	
}