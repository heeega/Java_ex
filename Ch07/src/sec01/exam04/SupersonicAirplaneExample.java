package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONOIC;
		sa.fly();
		sa.flyMode=SupersonicAirplane.NOMAL;
		sa.fly();
		sa.land();

	}

}
