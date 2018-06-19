package domain;

public class Salary2 {
	
	public static final String DEPT="인턴쉽";
	protected String dept,name;
	protected int sal;
	
	public Salary2(String name,int sal) {
		this.name=name.substring(0,1);
		this.sal=sal;
		setDept();
		
		
	}
public void setDept() {
	
	this.dept=DEPT.substring(0,2);
}
public String toString() {
	return String.format("부서 : %s , 이름 : %s , 월급 : %d 만원",DEPT,name+dept,sal);
}



public String getDept() {
	return dept;
}
public String getName() {
	return name;
}
public int getSal() {
	return sal;
}


}