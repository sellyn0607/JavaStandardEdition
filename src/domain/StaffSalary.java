package domain;


public class StaffSalary extends Salary2{
	public StaffSalary(String name,int sal) {
		super(name,sal);
		this.sal=sal+(sal/10);
		setDept();
		
	}

	public static final String DEPT="정직원";
	protected double bonus; //10퍼
	public void setDept() {
		this.dept = DEPT.substring(1,3);
	}
	
	

	

}
