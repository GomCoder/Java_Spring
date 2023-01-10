package ch16;

public class Employee {
	public static int serialNum = 10000;
	
	private int employeeId;
	private String employeeName;
	private String deaprtment;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum; 
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDeaprtment() {
		return deaprtment;
	}
	public void setDeaprtment(String deaprtment) {
		this.deaprtment = deaprtment;
	}
	
	
	
	
	
	
	
}
