package domain;

public class CellPhone extends Phone{
	public static final String BRAND="노키아",KIND="휴대폰";
	
	private boolean portable;
	private String move;
	public void setMove(String move) {
		this.move=move;
	}
	public String getMove() {
		return move;
	}
	public void setPortable(boolean portable) {
		
		setMove((portable)?"이동가능":"이동불가능");
		this.portable=portable;
	}
	public boolean isPortable() {// 불린만 is 
		return portable;
	}
	
	public String toString() {
		setPortable(true);
		return String.format("%s 에게 %s 번호로  %s %s제품  %s 를 사용해서 %s 라고 통화했다",super.getName(),super.getPhoneNum(),move,BRAND,KIND,super.getCall());
		// 홍길동,010-1234-5678,삼성,집전화가,2시에만나
	}
	
}
