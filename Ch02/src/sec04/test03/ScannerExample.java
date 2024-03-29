package sec04.test03;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,num,tel;
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		name=sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		num=sc.nextLine();
		System.out.print("3. 전화번호: ");
		tel=sc.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(num);
		System.out.println(tel);
		
	}

}
