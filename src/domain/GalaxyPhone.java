package domain;

public class GalaxyPhone extends IPhone{
	private String SIZE="6인치";
	public static final String BRAND="삼성",KIND="갤럭시노트폰";
	
	public void setData(String data) {
		super.data=data+"라고 카톡했다.";
		
	}
	
	public String toString() {
		setPortable(true);
		return String.format("%s 에게 %s 번호로  %s제품 %s  %s 를  %s 사용해서 %s",
				super.getName(),super.getPhoneNum(),BRAND,SIZE,KIND,super.getMove(),super.getData());
		// 홍길동,010-1234-5678,삼성,집전화가,2시에만나
	}
	
}
