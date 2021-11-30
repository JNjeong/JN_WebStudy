package day05;

public class calculation {
	public int num1, num2, result;
	public String oper;
	
	
	public calculation(int num1, int num2, String oper) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.oper = oper;
	}

	public int calc() {
		
		//계산기능
		switch(oper) {
		case "+" : result=this.num1+this.num2; break; 
		
		case "-" : result=this.num1-this.num2; break;
		
		case "*" : result=this.num1*this.num2; break;
		
		case "/" : result=this.num1/this.num2; break;
		
		case "%" : result=this.num1%this.num2; break;
		}
		
		return result;
		
	}

}
