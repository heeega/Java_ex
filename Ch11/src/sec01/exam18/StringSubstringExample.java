package sec01.exam18;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn="880815-1234567";
		
		String firstName=ssn.substring(0, 6);
		System.out.println(firstName);
		
		String secondName=ssn.substring(7);
		System.out.println(secondName);
	}

}
