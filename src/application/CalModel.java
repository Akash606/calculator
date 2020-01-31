package application;



public class CalModel {
	
	
	public float getresult(float num1,float num2,String op) {
		switch (op) {
		case "+":
			return num1+num2;
		case "-":
			return num1-num2;
		case "*":
			return num1*num2;
		case "/":
			return num1/num2;

		default:
			return 0;
		}
		
	}

}
