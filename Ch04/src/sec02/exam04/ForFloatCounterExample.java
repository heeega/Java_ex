package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f;x<=1.0f;x+=0.1f) { // 정수 사용시 10번 반복해야 하지만 부동소수점 사용시 9번 반복(float 타입 사용X)
			System.out.println(x);
		} 
		

	}

}
