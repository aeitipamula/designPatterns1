package com.designpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.designpattern.factoryPattern.GetPlanFactory;
import com.designpattern.factoryPattern.PlanInterface;


//This my Controller
@RestController
public class MyController {
	
	@Autowired 
	GetPlanFactory planFactory ;
	
	@RequestMapping(path="/designPatternsImplemented",produces= MediaType.APPLICATION_JSON_VALUE)
	public String designPatternsImplemented() {
		
		return "Now not Implemented";
	}
	
	@RequestMapping(value="/FactoryPattern/billValue/{planType}/{units}",produces= MediaType.APPLICATION_JSON_VALUE)
	public String factoryPattern(@PathVariable String planType,@PathVariable int units) {
		
		PlanInterface plan = planFactory.getPlan(planType);
		plan.getRate();
        return String.valueOf(plan.calculateBill(units));
		
	}
	
}
