package domain;

public class BMI {
	String name,result;
	double height,weight;
	public void setName(String name) {
		this.name = name;
		
	}
	public void setResult() {
		double bmi = weight/((height*height/10000));
		String check = "";
		if(bmi<18.5){
			check="저체중";

		}else if(bmi<23){
			check="정상";

		}else if(bmi<25){
			check="비만 전단계";
		}else if(bmi<30){
			check="1단계 비만";

		}else if(bmi<35){
			check="2단계 비만";

		}else{ 
			check="3단계 비만";

		} 
		result=check;
		
	}public void setWeight(double weight) {
		this.weight=weight;
	}public void setHeight(double height) {
		this.height=height;
	}
	public  String getName() {
		return name;
	}
	public String getResult() {
		return result;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return String.format("%s | %f | %f | %s\n",name,height,weight,result);
	}
	
}
