package com.db.demo;

import com.db.service.BasicCal;
import com.db.service.SciCal;

public class DemoApp {

		public static void main(String[] args)
		{
			System.out.println("in java");
			
			BasicCal calculator = new BasicCal();
			
			System.out.println("addation of 20 and 10 ->>"+calculator.addation(20, 10));
			System.out.println("subtraction of 20 and 10 ->>"+calculator.subtraction(20, 10));
			System.out.println("multiply of 20 and 10->>"+calculator.multiply(20, 10));
			System.out.println("division of 20 and 10->>"+calculator.division(20, 10));

			System.out.println("in scical ");
			System.out.println("  ");
			SciCal calculators = new SciCal();
			

			System.out.println("ln of 10 ->>  "+calculators.ln(10));
			System.out.println("log of 10 ->>  "+calculators.log(10));
			System.out.println("sim of 40 ->>  "+calculators.sin(40));
			System.out.println("cos of 40 ->>  "+calculators.cos(40));
			System.out.println("tan of 40 ->>  "+calculators.tan(40));
			System.out.println("sqrt of 100 ->>  "+calculators.sqrt(100));
			System.out.println("abs of -100 ->>  "+calculators.abs(-100));
			System.out.println("pow of 8 to 4 ->>  "+calculators.pow(8,4));
			System.out.println("expo of 8 ->>  "+calculators.expo(8));
			

		}
}
