package sec03.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//추상클래스는 new연산자로 객체 생성 불가
		//Phone phone=new Phone();
		
		SmartPhone smartPhone=new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
