package serviceImpl;
import javax.swing.JOptionPane;

import domain.Account;
import service.AccountService;

public class AccountServiceImpl implements AccountService{
	Account[] list;
	int count;
	public AccountServiceImpl() {
		list=new Account[10];
		count=0;
	}
	@Override
	public void addList(Account account) {
		list[count++] = account;
		
		
	}
	public Account[] list() {
		return list;
	}
	@Override
	public int deposit(String money, int restMoney) {
		
		return 0;
	}

	@Override
	public int withdraw(String money, int restMoney) {
		
		return 0;
	}

	@Override
	public String createAccountNun(String random) {
		
		return null;
	}

	@Override
	public String craeteRandom(int start, int end) {
		
		return null;
	}

	@Override
	public String createDate() {
		
		return null;
	}

	@Override
	public String showResult() {
		
		String result="";
		for(int i=0; i<count;i++) {
			result+=list()[i].toString();
		}
		return result;
	}

	@Override
	
	public Account createAccount(String name, String uid, String pass) {
		
		return  new Account(name,uid,pass);
	}

}
