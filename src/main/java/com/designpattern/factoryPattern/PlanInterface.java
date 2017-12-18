package com.designpattern.factoryPattern;

import org.springframework.stereotype.Service;


public abstract class PlanInterface {
	
	  protected double rate;  
      public abstract void getRate();  

      public double calculateBill(int units){  
           System.out.println(units*rate); 
           return units*rate;
       }  

}
