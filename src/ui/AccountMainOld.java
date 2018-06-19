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
enum Butt3{
	EXIT,ACCOUNT,MINUS,DEPOSIT,WITHDRAW
}

public class AccountMainOld {
	public static void main(String[] args) {
		Account acc=null;
		Butt3[] buttons= {
				Butt3.EXIT,Butt3.ACCOUNT,Butt3.MINUS,Butt3.DEPOSIT,Butt3.WITHDRAW
		};
		while(true) {
			Butt3 select = (Butt3)JOptionPane.showInputDialog(null,"MENU","",JOptionPane.QUESTION_MESSAGE,null,
					buttons,buttons[1]);
			switch(select) {
			case EXIT : return;
			case ACCOUNT : 
				acc = new Account(
						JOptionPane.showInputDialog("아이디를 입력하세요."),
						JOptionPane.showInputDialog("이름을 입력하세요"),
						JOptionPane.showInputDialog("패스워드를 입력하세요")
						);
				acc.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금하실 금액을 입력해주세요")));
				JOptionPane.showMessageDialog(null,acc.toString());
				break;
			case MINUS : 
				acc= new MinusAccount(
						JOptionPane.showInputDialog("아이디를 입력하세요."),
						JOptionPane.showInputDialog("이름을 입력하세요"),
						JOptionPane.showInputDialog("패스워드를 입력하세요")
						);
				((MinusAccount) acc).setLimit(Integer.parseInt(JOptionPane.showInputDialog("대출한도를 입력해주세요")));
				((MinusAccount) acc).setDebt(Integer.parseInt(JOptionPane.showInputDialog("대출하실 금액을 입력해주세요")));
				JOptionPane.showMessageDialog(null,acc.toString());
				break;
			case DEPOSIT :
				acc.setSum(Integer.parseInt(JOptionPane.showInputDialog("입급할 금액을 입력하세요")));
				JOptionPane.showMessageDialog(null,"총금액은 " +acc.getMoney()+"원");
				break;
			case WITHDRAW : 
				acc.setMin(Integer.parseInt(JOptionPane.showInputDialog("출금할 금액을 입력하세요")));
				if (acc.getMoney()<0) {
						if(acc.getMoney()<((MinusAccount) acc).getLimit()) {
							JOptionPane.showMessageDialog(null,"한도액을 초과하셨습니다");
						}else {
							JOptionPane.showMessageDialog(null,"총금액은 " +acc.getMoney());
						}
						
				}else {
					JOptionPane.showMessageDialog(null,"총금액은 " +acc.getMoney());	
				}
				
				
				break;
			}
			
		}

	}

}
