package domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
비트뱅크
기본통장(마이너스통장)
아이디:
패스워드:
계좌번호 : 123-456-789
이름 : 홍길동
잔액 : 10000원
생성일 : 2018년 6월12일
* */
public class Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money;
	protected int[] num=new int[3];
	protected String uid,accountType,name,pass,accountNo;
	Date createDate= new Date();
	SimpleDateFormat date1 = new SimpleDateFormat("yyyy년 MM월 dd일",Locale.KOREA);
	public String toString() {
		return String.format("%s\n%s\n아이디 : %s\n패스워드 : %s \n계좌번호 : %s \n이름 : %s \n잔액 : %d 원 \n생성일 : %s ",
				BANK_NAME,ACCOUNT_TYPE,uid,pass,accountNo,name,money,date1.format(createDate));
	}
	public void setNum() {
		for(int i=0; i<3; i++) {
			num[i]=(int)(Math.random()*900)+100;
		}
		accountNo=num[0]+"-"+num[1]+"-"+num[2];
	}
	public void setMoney(int money) {
		this.money=money;
	}
	public void setUid(String uid) {
		this.uid=uid;
	}
	public void setAccountType(String accountType) {
		
		this.accountType=accountType;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPass(String pass) {
		this.pass=pass;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo=accountNo;
	}
	public int getMoney() {
		return money;
	}
	public String getUid() {
		return uid;
	}
	public String getName() {
		return name;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getPass() {
		return pass;
	}
	public String getAccountNo() {
		return accountNo;
	}
	
	
	// 통장 123-345-678 의 형태가 되도록 코딩
	// 블로그에서 오늘날짜 뽑게하기
}
