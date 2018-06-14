package ui;

import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;
public class Main {
	
	public static void main(String[] args) {
		BMI bmi = null;
		Grade gra= null;
		Salary sal = null;
		Lotto lo = null;
		BMI[] arr = new BMI[2];
		Grade[] arr2= new Grade[4];
		Salary[] arr3=new Salary[2];
		int count=0;
		int gracount=0;
		int scount=0;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.BMI 2.BMI출력 3. 학점 입력 4. 학점출력 5. 부서입력 6. 부서출력 7. 로또 구매 8. 로또 확인")) {
			case "0" :  return;
			case "1" :
				bmi = new BMI();
				bmi.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키를 입력하세요")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력하세요")));
				bmi.setResult();
				arr[count]=bmi;
				count++;
		break;
		case "2" :
			String output="";
			for(int i=0; i<arr.length;i++) {
				output+=arr[i].toString();
			}	
			JOptionPane.showMessageDialog(null,output);  
			break;
		case"3": 
			gra = new Grade();
			gra.setName(JOptionPane.showInputDialog("이름을 입력하세요"));
			gra.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수를 입력하세요")));
			gra.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수를 입력하세요")));
			gra.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수를 입력하세요")));
			gra.setTotal();
			gra.setAvg();
			gra.setGrade();
			arr2[gracount]=gra;
			gracount++;
			break;
		case"4":
			String output2="";
			for(int i=0; i<gracount;i++) {
				output2+=arr2[i].toString();
			}
			JOptionPane.showMessageDialog(null,output2); break;
			
		case"5":
			sal= new Salary();
			String[] arr5 = new String[4];
			String score = JOptionPane.showInputDialog("부서 / 이름 / 본봉 / 수당 을 입력하세요");
			arr5=score.split("/");
			
			sal.setDept(arr5[0]);			//(JOptionPane.showInputDialog("부서를 입력하세요"));
			sal.setName(arr5[1]);//(JOptionPane.showInputDialog("이름을 입력하세요"));
			sal.setSal(Integer.parseInt(arr5[2]));//(Integer.parseInt(JOptionPane.showInputDialog("본봉을 입력하세요")));
			sal.setBonus(Integer.parseInt(arr5[3]));//(Integer.parseInt(JOptionPane.showInputDialog("수당을 입력하세요")));
			sal.setSum();
			arr3[scount]=sal;
			scount++; break;
			
		case"6": 
			String salop="";
			for(int i=0; i<scount; i++) {
				salop+=arr3[i].toString();
			}
			JOptionPane.showMessageDialog(null,salop);break;
		case"7":
			lo = new Lotto();
			lo.setMoney(Integer.parseInt(JOptionPane.showInputDialog("돈을 입력하세요")));
			lo.setBall();
			JOptionPane.showMessageDialog(null,lo.toResult());
			break;
			
		case"8":

	
			
			break;
		default : break;
			}
		}
	}
}
