package sec07;

public class PromotionExample {
	public static void main(String[] args) {

		//		A
		//     B C         //자식이 ->부모 ->부모 이런식으로만 된다
		//     D E				//즉 A->B>D , A->C->E 이런식으로 순차적으로 가능하지만 B->E는 안된단거
		
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	//부모의 부모까지 상속받을수있다 란걸 얘기함
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	B b1 =d;
	C c1 = e;
	
	//B b3 = e;
	//C c2 = d;
	
	
	}
}

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends C{
	
}