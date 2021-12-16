package set;

public class Product_main {

	public static void main(String[] args) {
		Product product = new Product(1111, 0.3);
		product.print();
		product.setPrice(1000); // АЁАн setter
		product.setDc(0.2);

		Product tv = new Tv(1000, 0.3, 0.4);
		tv.print();
		tv.setPrice(2000);
		tv.print();

		Product car = new Car(10000, 0.3, 300);
		car.print();
		car.setPrice(20000);
		car.print();
	}

}
