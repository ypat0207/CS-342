
import java.lang.Math;
public class SavingsFormulas {
	
	
	
	public static double futureValueLumpSum(double cash, double interest, int
	years) {
		double temp = Math.pow(1+interest, years);
		return cash*temp;
		
	}
	

	public static double futureValueLS_VariableInterest(double cash, double
	values[]) {
		
		for(int i = 0; i < values.length; i++) {
			cash = cash*(1 + values[i]);
		}
		return cash;
	}
	

	

		

	public static double compoundSavingsConstant(double cash, double
	interest, int years) {
		double temp = Math.pow(1+interest, years);
		
		return cash*((temp-1)/interest);
		
	}
	
	
	public static double compoundSavingsVariable(double values[], double
	interest) {
		double totalSavings = values[0];
		for(int i = 1; i < values.length; i++) {
			totalSavings = totalSavings*(1+interest) + values[i];
			
					
		}
		return totalSavings;
	}
}
