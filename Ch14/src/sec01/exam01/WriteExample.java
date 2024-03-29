package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		//다형성 적용 후
		OutputStream os=new FileOutputStream("C:/Temp/test1.db");
		
		//다형성 적용 전
		//FileOutputStream os=new FileOutputStream("C:/Temp/test1.db");
		
		byte a=10;
		byte b=20;
		byte c=30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}

}
