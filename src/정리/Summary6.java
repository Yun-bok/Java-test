package 정리;

public class Summary6 {
	public static void main(String[] args) {
		
	}
}

//클래스
class Product{
	//필드
	int price; //제품가격
	int bonusPoint; //구매시 포인트
	
	//생성자
	//클래스이름(매개변수){
	//}
	//기본생성자 - 매개변수가 없는 , 생성자를 만들지않으면 자동생성
	//Product2(){
		//System.out.println("기본생성자");
	//}
	
	//생성자 - 매개변수를 받아서 price를 초기화
	//Product2(int price){
		// this -> 
	//}
	//public int getBonusPoint() {
		//return BonusPoint;
	//}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
		//게터 세터 ->필드를 private으로 해야 할필요가있을때
		//세터 필드의 값을 변경해주는 메서드
	//}
	//Tv(int price , int ch){
		//super(price);
		//this.ch =ch;
	//}
	
	//메서드
	//오버라이드
	//@Ovrride
	//public void print("price: "+super.get_Price()+"") {
		
	}
}
