package ch10;

public class StudentTest {

	public static void main(String[] args) {
		MyLogger myLogger = MyLogger.getLogger();
		
		String name = null;
		
		try {
			Student student = new Student(name);
		} catch(StudentNameFormatException e) {
			myLogger.warning(e.getMessage());
		}
		
		try {
			Student student = new Student("Edward John Kim Test");
		} catch(StudentNameFormatException e) {
			myLogger.warning(e.getMessage());
		}
		
		Student student = new Student("James");
		String sName = student.getStudentName();
	}

}
