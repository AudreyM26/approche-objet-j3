package fr.diginamic.operations;

public class Operations {

	public void calcul (double a,double b, char ope) {

		double result = 0;
		String msg = "";
		
		switch(ope){
		
			case '+':	
				result = a + b;
				msg = a+" + "+b+" = ";
				break;
			
			case '-':	
				result = a - b;
				msg = a+" - "+b+" = ";
				break;	
			
			case '*':	
				result = a * b;
				msg = a+" * "+b+" = ";
				break;
			
			default:	
				result = a / b;
				msg = a+" / "+b+" = ";
				break;
		}
		
		System.out.println(msg+result);
		
	}
}
