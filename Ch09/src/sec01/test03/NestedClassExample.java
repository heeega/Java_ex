package sec01.test03;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar=new Car();
		
		Car.Tire tire=myCar.new Tire();
		Car.Engine engine=new Car.Engine();
	}

}
