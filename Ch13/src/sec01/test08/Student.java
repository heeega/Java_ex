package sec01.test08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studnetNum, String name) {
		this.studentNum = studnetNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student=(Student)obj;
			if (studentNum!=student.studentNum) {
				return false;
			}
		} return true;
		
	}
	
	

}
