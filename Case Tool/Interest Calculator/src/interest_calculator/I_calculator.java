package interest_calculator;

public class I_calculator 
{
	private double R,T,P,C_Principle,C_Rate,C_Time,Num1,Num2,Num3,Num4,Num5;

	public void setC_Principle(double c_Principle) {
		C_Principle = c_Principle;
	}

	public void setNum1(double num1) {
		Num1 = num1;
	}

	public void setNum2(double num2) {
		Num2 = num2;
	}

	public void setNum3(double num3) {
		Num3 = num3;
	}

	public void setNum4(double num4) {
		Num4 = num4;
	}

	public void setNum5(double num5) {
		Num5 = num5;
	}

	public void setRate(double rate) {
		R = rate;
	}

	public void setTime(double time) {
		T = time;
	}

//	public void setSi(double si) {
//		Si = si;
//	}

	public void setPrinciple(double principle) {
		P = principle;
	}

	public void setC_Rate(double c_Rate) {
		C_Rate = c_Rate;
	}

	public void setC_Time(double c_Time) {
		C_Time = c_Time;
	}
	

public double SI()
	 {double si =1 ;
 si = (P*T*R)/100;
		System.out.println("Simple Interest is "+si);
		return si;
	 }
	 public double Avg_Num()
	 {
		 return (Num1+Num2+Num3+Num4+Num5)/5;
	 }
	 public double Compound_interest()
	 {
		 return C_Principle*(Math.pow(1 + C_Rate , C_Time)) ;
	 }

}
