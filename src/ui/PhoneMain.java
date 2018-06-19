package ui;
import domain.*;
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
		
/*		CellPhone cp = new CellPhone();
		IPhone ip = new IPhone();
		GalaxyPhone gp = new GalaxyPhone();
*/		Butt[] buttons= {
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
				pho.setName(JOptionPane.showInputDialog("이름"));
				pho.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				pho.setCall(JOptionPane.showInputDialog("말할 내용"));
				JOptionPane.showMessageDialog(null,pho.toString());break;
			case IPhone:
				pho.setName(JOptionPane.showInputDialog("이름"));
				pho.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				((IPhone) pho).setData(JOptionPane.showInputDialog("말할 내용"));
				JOptionPane.showMessageDialog(null,pho.toString());break;
			case GalaxyPhone:
				pho.setName(JOptionPane.showInputDialog("이름"));
				pho.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				((IPhone) pho).setData(JOptionPane.showInputDialog("말할 내용"));
				
				JOptionPane.showMessageDialog(null,pho.toString());break;
			
			
			}
			
			
			
			
		}
	}

}
