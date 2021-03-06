package ui;
import javax.swing.JOptionPane;

import domain.Account;
import domain.MinusAccount;
import service.*;
import serviceImpl.*;
/*
 비트뱅크
 기본통장(마이너스통장)
 계좌번호 : 123-456-789
 이름 : 홍길동
 잔액 : 10000원
 생성일 : 2018년 6월10일
 * */
enum Butt2{
	EXIT,ACCOUNT,MINUS,DEPOSIT,WITHDRAW,MENU
}

public class AccountMain {
	public static void main(String[] args) {
		Account acc=null;
		
		
		AccountService service = new AccountServiceImpl();
		Butt2[] buttons= {
				Butt2.EXIT,Butt2.ACCOUNT,Butt2.MINUS,Butt2.DEPOSIT,Butt2.WITHDRAW,Butt2.MENU
		};
		while(true) {
			Butt2 select = (Butt2)JOptionPane.showInputDialog(null,"MENU","",JOptionPane.QUESTION_MESSAGE,null,
					buttons,buttons[1]);
			switch(select) {
			case EXIT : return;
			case ACCOUNT : 
				
				
				//acc.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금하실 금액을 입력해주세요")));
				//JOptionPane.showMessageDialog(null,acc.toString());
				service.addList(service.createAccount( 
				JOptionPane.showInputDialog("아이디를 입력하세요."),
				JOptionPane.showInputDialog("이름을 입력하세요"),
				JOptionPane.showInputDialog("패스워드를 입력하세요")
				));
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
			case MENU :
				JOptionPane.showMessageDialog(null,service.showResult());
				break;
			}
			
		}

	}

}
