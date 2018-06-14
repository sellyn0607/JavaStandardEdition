package domain;

public class Phone {
	private String name,phoneNum,call;
	public static final String BRAND="삼성",KIND="집전화";
	public String toString() {
		return String.format("%s 에게 %s 번호로  %s 제품  %s 를 사용해서 %s 라고 통화했다",name,phoneNum,BRAND,KIND,call);
		// 홍길동,010-1234-5678,삼성,집전화가,2시에만나
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPhoneNum(String num) {
		this.phoneNum=num;
	}
	public void setCall(String call) {
		this.call=call;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getCall() {
		return call;
	}
}
