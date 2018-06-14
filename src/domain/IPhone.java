package domain;

public class IPhone extends CellPhone{
	protected String data;
	public static final String BRAND="애플",KIND="아이폰";
	
	public void setData(String data) {
		this.data=data+"이라고 문자했다.";
		
	}
	public String getData() {
		return data;
	}
	public String toString() {
		setPortable(true);
		return String.format("%s 에게 %s 번호로  %s %s제품  %s 를 사용해서 %s ",
				super.getName(),super.getPhoneNum(),super.getMove(),BRAND,KIND,data);
		// 홍길동,010-1234-5678,삼성,집전화가,2시에만나
	}

}
