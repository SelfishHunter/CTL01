package interest_calculator;
import java.util.Scanner;

public class Interest_calc {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int opt ;
		System.out.println("Interest-Calculator");
		System.out.println("1 : Simple-Interest Calculator");
		System.out.println("2 : Compound-Interest Calculator");
		System.out.println("3 : Average Of FIVE Numbers");
		System.out.println("please choose ur  choice....");
		opt = sc.nextInt();
		
		switch (opt)
		{
		case 1 :
			I_calculator obj1 = new I_calculator ();
			System.out.println("--------------SIMPLE INTEREST---------------");

			System.out.println("enter principle amt");
			obj1.setPrinciple(sc.nextDouble());
			System.out.println("enter time ");
			obj1.setTime(sc.nextDouble());
			System.out.println("enter rate");
			obj1.setRate(sc.nextDouble());
			obj1.SI();
			//System.out.println("Simple Interest is "+ obj.SI());
			break ;
		case 2 :
			I_calculator obj2 = new I_calculator ();
			System.out.println("--------------COMPOUND INTEREST---------------");

			System.out.println("enter principle amt");
			obj2.setC_Principle(sc.nextDouble());
			System.out.println("enter time ");
			obj2.setC_Time(sc.nextDouble());
			System.out.println("enter rate");
			obj2.setC_Time(sc.nextDouble());
			System.out.println("Compound Interest is "+obj2.Compound_interest());
			break ;
		case 3 :
			I_calculator obj3 = new I_calculator ();
			System.out.println("--------------AVERAGE OF 5 NUMBERS---------------");

			System.out.print("Num1 : ");
			obj3.setNum1(sc.nextDouble());
			System.out.print("Num2 : ");
			obj3.setNum2(sc.nextDouble());
			System.out.print("Num3 : ");
			obj3.setNum3(sc.nextDouble());
			System.out.print("Num4 : ");
			obj3.setNum4(sc.nextDouble());
			System.out.print("Num5 : ");
			obj3.setNum5(sc.nextDouble());
			System.out.print("Average Of Five Numbers is  : "+obj3.Avg_Num());
			break;
			
			default :
				System.out.print("Invalid number...... ");
				break ;



		}

		sc.close();

	}

}
