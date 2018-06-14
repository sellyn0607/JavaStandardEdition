package domain;
/*
로또볼 추첨
1~45 까지 랜덤숫자
중복불허
출력은 [5,23,2,40,19,22] 
 * */
public class Lotto {
	 int money;
	 int[] ball =new int[6];
	 String result="";

public void setBall() {
	//result+="\n";
	for(int j =0; j<money;j++) {
	for (int i=0; i<6; i++) {
	this.ball[i] = (int) (Math.random()*45)+1;
	result+=ball[i]+" | ";
	}
	result+="\n";
	}
}

public void setMoney(int money) {
	this.money = money / 1000 ;
}
public String toResult() {
	return result;
}
}