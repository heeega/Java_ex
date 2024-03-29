package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	public D() {
		super();//new 연산자로 생성자 직접 호출할 수 없어 super() 생성자 호출
		this.field="value";
		this.method();
	}

}
