package com.nlsinc.kt;

public class MethodsTest {

	public static void main(String[] args) {
	
	// we want to add two number and display - IOT
		
            Calculator calc = new Calculator();
            calc.add();
            calc.subtract();
            calc.power();
            calc.power(3, 3);
            calc.cube(5);
            calc.cube(9);
          Calculator.printLine(70);
            //   (a+b) ^ (3) * (c * c * c)        a=4, b= 5, c= 4
           int result = calc.power(calc.add(4,5),3) * calc.cube(4); 
           System.out.println(result);
           Calculator.printLine(70);
           System.out.println(Math.pow(4, 2));
      //     Math math = new Math();
    //       math.
           
           
	}

}
