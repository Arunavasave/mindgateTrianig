package com.mindgate.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("monthsdetails")
@Scope("prototype")
public class MonthsDetails {
	private int monthId;
	private LocalDate monthStartDate;
	private LocalDate monthEndDate;
	@Autowired
	private FinancialYearDetails financialYearDetails;
	public MonthsDetails() {
		// TODO Auto-generated constructor stub
	}
	public MonthsDetails(int monthId, LocalDate monthStartDate, LocalDate monthEndDate,
			FinancialYearDetails financialYearDetails) {
		super();
		this.monthId = monthId;
		this.monthStartDate = monthStartDate;
		this.monthEndDate = monthEndDate;
		this.financialYearDetails = financialYearDetails;
	}
	public int getMonthId() {
		return monthId;
	}
	public void setMonthId(int monthId) {
		this.monthId = monthId;
	}
	public LocalDate getMonthStartDate() {
		return monthStartDate;
	}
	public void setMonthStartDate(LocalDate monthStartDate) {
		this.monthStartDate = monthStartDate;
	}
	public LocalDate getMonthEndDate() {
		return monthEndDate;
	}
	public void setMonthEndDate(LocalDate monthEndDate) {
		this.monthEndDate = monthEndDate;
	}
	public FinancialYearDetails getFinancialYearDetails() {
		return financialYearDetails;
	}
	public void setFinancialYearDetails(FinancialYearDetails financialYearDetails) {
		this.financialYearDetails = financialYearDetails;
	}
	@Override
	public String toString() {
		return "MonthsDetails [monthId=" + monthId + ", monthStartDate=" + monthStartDate + ", monthEndDate="
				+ monthEndDate + ", financialYearDetails=" + financialYearDetails + "]";
	}
	

}
