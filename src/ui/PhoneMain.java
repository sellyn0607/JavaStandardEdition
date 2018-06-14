package ui;
import domain.Phone;
import domain.CellPhone;
import domain.IPhone;
import domain.GalaxyPhone;
import javax.swing.JOptionPane;
enum Butt{
	EXIT,TELEPHONE,CELLPHONE,IPhone,GalaxyPhone
}
//0.통화종료
//1.집전화기
public class PhoneMain {

	public static void main(String[] args) {
		Phone pho = new Phone();
		CellPhone cp = new CellPhone();
		IPhone ip = new IPhone();
		GalaxyPhone gp = new GalaxyPhone();
		Butt[] buttons= {
				Butt.EXIT,Butt.TELEPHONE,Butt.CELLPHONE,Butt.IPhone,Butt.GalaxyPhone
		};
		
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(null,"EXIT","TELEPHONE",JOptionPane.QUESTION_MESSAGE,null,
					buttons,buttons[1]);
			switch(select) {
			case EXIT : return;
			case TELEPHONE : 
				pho.setName(JOptionPane.showInputDialog("이름"));
				pho.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				pho.setCall(JOptionPane.showInputDialog("말할 내용"));
				JOptionPane.showMessageDialog(null,pho.toString());break;
			case CELLPHONE:
				cp.setName(JOptionPane.showInputDialog("이름"));
				cp.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				cp.setCall(JOptionPane.showInputDialog("말할 내용"));
				JOptionPane.showMessageDialog(null,cp.toString());break;
			case IPhone:
				ip.setName(JOptionPane.showInputDialog("이름"));
				ip.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				ip.setData(JOptionPane.showInputDialog("말할 내용"));
				JOptionPane.showMessageDialog(null,ip.toString());break;
			case GalaxyPhone:
				gp.setName(JOptionPane.showInputDialog("이름"));
				gp.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				gp.setData(JOptionPane.showInputDialog("말할 내용"));
				
				JOptionPane.showMessageDialog(null,gp.toString());break;
			
			
			}
			
			
			
			
		}
	}

}
