package sec01.exam04;

public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		final int localVarible=1;
		//arg=100
		//localVarible=100;
		class Inner{
			public void method() {
				int result=arg+localVarible;
			}
		}
	}
	
	//자바 8이후
	public void method2(int arg) {
		int localVariable=1;
		//arg=100;
		//localVariable=100;
		class Iner{
			public void method(){
				int result=arg+localVariable;
			}
		}
	}

}
