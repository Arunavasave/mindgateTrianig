package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.AnnotationAndConfig;
import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthsDetails;

public class FinancialMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationAndConfig.class);
		FinancialYearDetails financialYearDetails = applicationContext.getBean("financialyeardetails",FinancialYearDetails.class);
		financialYearDetails.setYearId(101);
		financialYearDetails.setYearStartDate(LocalDate.of(2022, 02, 19));
		financialYearDetails.setYearEndDate(LocalDate.of(2024, 06, 13));
		System.out.println(financialYearDetails);
		
		MonthsDetails monthsDetails = applicationContext.getBean("monthsdetails", MonthsDetails.class);
		//employee.setHomeAddress(address);
		monthsDetails.setMonthId(102);
		monthsDetails.setMonthStartDate(LocalDate.of(2022, 05, 19));
		monthsDetails.setMonthEndDate(LocalDate.of(2025, 04, 30));
		monthsDetails.setFinancialYearDetails(financialYearDetails);
		System.out.println(monthsDetails);
		
	}
	
}
