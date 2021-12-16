package sec04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly(); 
		sa.flymode = SupersonicAirplane.SUPERSONIC;//초음속비행
		sa.fly();
		sa.flymode = SupersonicAirplane.NORMAL;//플라이
		sa.fly();
		sa.land();

	}

}
