package sec02.exam03;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {

		int sum=0;
		int i=0; //전역변수로 선언
		
		for(i=0;i<=100;i++) {
			sum+=i;
		}
		
		System.out.println("1~"+(i-1)+" 합: "+sum);
	}

}
