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
	protected int money,sum,min;
	protected String uid,accountType,name,pass,accountNo,CreateDate,result;
	public String toString() {
		
		return String.format("%s\n%s\n아이디 : %s\n패스워드 : %s \n계좌번호 : %s \n이름 : %s \n잔액 : %d 원 \n생성일 : %s ",
				BANK_NAME,ACCOUNT_TYPE,uid,pass,accountNo,name,money,CreateDate);
	}
	
	public Account(String name,String uid,String pass) {
		setAccountNo();
		setCreateDate();
		this.name = name;
		this.uid=uid;
		this.pass=pass;
	}
	public void setSum(int sum) {
		money+=sum;
	}
	public int getSum() {
		return sum;
	}
	public void setMin(int min) {

	}
	public int getMin() {
		return min;
	}
	public void setResult() {
		
	}
	public String getResult() {
		return result;
	}
	public void setMoney(int money) {
		this.money=money;
		
	}
	public void setCreateDate() {
		this.CreateDate=new SimpleDateFormat("yyyy년 MM월 dd일",Locale.KOREA).format( new Date());
	}
	
	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	
	public void setPass(String pass) {
		this.pass=pass;
	}
	public void setAccountNo() {
		int[] num=new int[3];
		for(int i=0; i<3; i++) {
			num[i]=(int)(Math.random()*1000);
		}
		this.accountNo=num[0]+"-"+num[1]+"-"+num[2];
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
	public String getCreateDate() {
		return CreateDate;
	}
	
	
	// 통장 123-345-678 의 형태가 되도록 코딩
	// 블로그에서 오늘날짜 뽑게하기
}
