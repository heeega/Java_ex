package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		// 1)일반적인 방식으로 객체 생성 후 메서드 호출
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		// 2) animal변수로 타입변환 후 메서드 호출
		Animal animal=null;
		animal=new Dog();
		animal.sound();
		animal=new Cat();
		animal.sound();
		System.out.println("-----");
		
		// 3) 메소드 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
