package ui;
import domain.*;
import javax.swing.JOptionPane;

enum ButtSalary{
	EXIT,인턴쉽,정직원,이사회;
}
/*
 다성형..인스턴스를 하나만 사용해서 재활용하는것, 단상속에서만 가능 
 생성자에 부서,이름,sal 을 반드시 받아야 객체가 생성 되도록해주세요
 * */
//김길동 -> 김인턴 =100만원   지급
//김깅동 -> 김직원 ->100만원 -> 110만원 지급
//김길동 -> 김이사 -> 100 -> 1100만 지급
public class SalaryMain {
	

	public static void main(String[] args) {
		ButtSalary[] buttons= {
				ButtSalary.EXIT,ButtSalary.인턴쉽,ButtSalary.정직원,ButtSalary.이사회
				
		};
		Salary2 s = null;
		StaffSalary s2=null;
		OwnerSalary s3=null;
		while(true) {
			ButtSalary select = (ButtSalary)JOptionPane.showInputDialog(null,"MENU","",JOptionPane.QUESTION_MESSAGE,null,
					buttons,buttons[1]);
			
			switch(select){
				case EXIT : return;
				case 인턴쉽 : 
					s = new Salary2(
						JOptionPane.showInputDialog("이름을 입력하세요."),
						Integer.parseInt(JOptionPane.showInputDialog("봉급을 입력하세요."))
					);
					JOptionPane.showMessageDialog(null,s.toString());break;
				
				case 정직원 : 
					s2= new StaffSalary(
							JOptionPane.showInputDialog("이름을 입력하세요."),
							Integer.parseInt(JOptionPane.showInputDialog("봉급을 입력하세요.")));
					JOptionPane.showMessageDialog(null,s2.toString());
					break;
				case 이사회 :
					s3= new OwnerSalary(
							JOptionPane.showInputDialog("이름을 입력하세요."),
							Integer.parseInt(JOptionPane.showInputDialog("봉급을 입력하세요.")));
					JOptionPane.showMessageDialog(null,s3.toString());
					break;
			}
		}

	}

}
