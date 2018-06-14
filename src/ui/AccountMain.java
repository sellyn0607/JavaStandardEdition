package ui;
import javax.swing.JOptionPane;
import domain.Account;
import domain.MinusAccount;
/*
 비트뱅크
 기본통장(마이너스통장)
 계좌번호 : 123-456-789
 이름 : 홍길동
 잔액 : 10000원
 생성일 : 2018년 6월10일
 * */
enum Butt2{
	EXIT,ACCOUNT,MINUS
}

public class AccountMain {
	public static void main(String[] args) {
		Account acc = new Account();
		MinusAccount mac= new MinusAccount(); 
		Butt2[] buttons= {
				Butt2.EXIT,Butt2.ACCOUNT,Butt2.MINUS
		};
		while(true) {
			Butt2 select = (Butt2)JOptionPane.showInputDialog(null,"MENU","",JOptionPane.QUESTION_MESSAGE,null,
					buttons,buttons[1]);
			switch(select) {
			case EXIT : return;
			case ACCOUNT : 
				acc.setUid(JOptionPane.showInputDialog("아이디를 입력하세요."));
				acc.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				acc.setPass(JOptionPane.showInputDialog("패스워드를 입력하세요"));
				acc.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금하실 금액을 입력해주세요")));
				acc.setNum();
				JOptionPane.showMessageDialog(null,acc.toString());
				break;
			case MINUS : 
				mac.setUid(JOptionPane.showInputDialog("아이디를 입력하세요."));
				mac.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				mac.setPass(JOptionPane.showInputDialog("패스워드를 입력하세요"));
				mac.setDebt(Integer.parseInt(JOptionPane.showInputDialog("대출하실 금액을 입력해주세요")));
				mac.setNum();
				JOptionPane.showMessageDialog(null,mac.toString());
				break;
			}
			
		}

	}

}
