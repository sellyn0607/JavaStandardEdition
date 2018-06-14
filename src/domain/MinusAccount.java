package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int debt; // 대출금
	
	public void setDebt(int dept) {
		this.debt=-(dept);
	}

	public String toString() {
		return String.format("%s\n%s\n아이디 : %s \n패스워드 : %s \n계좌번호 : %s \n이름 : %s \n잔액 : %d 원 \n생성일 : %s ",
				BANK_NAME,ACCOUNT_TYPE,super.getUid(),super.getPass(),super.getAccountNo(),
				super.getName(),debt,super.date1.format(createDate));
	}
}
