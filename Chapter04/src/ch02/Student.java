package ch02;

public class Student implements Cloneable{
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	//equals()재정의
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if((this.studentId == std.studentId)) {
				return true;
			} else {
				return false;
			}		
		}
		return false;
	}
	
	//hashCode()재정의
	@Override
	public int hashCode() {
		return studentId;
	}
	
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	
	@Override
	public String toString() {
		return studentId + ", " + studentName; 
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
