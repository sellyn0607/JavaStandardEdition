package domain;

public class OwnerSalary extends StaffSalary{
	public OwnerSalary(String name,int sal) {
		super(name,sal);
		this.sal=(sal+(sal/10))*10;
		setDept();
		
	}
	public static final String DEPT="이사회";
	protected int share; //(sal+bonus) *10 
	
	public void setDept() {
		this.dept = DEPT.substring(0,2);
	}
	
	

}
