package com.designpattern.factoryPattern;

import org.springframework.stereotype.Service;

@Service
public class GetPlanFactory {

	   public PlanInterface getPlan(String planType){  
           if(planType == null){  
            return null;  
           }  
         if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
                return new DomesticPlan();  
              }   
          else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
               return new CommercialPlan();  
           }   
         else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
               return new InstitutionalPlan();  
         }  
     return null;  
  }  
}
