package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

import org.junit.Assert;

import Test.TestClass;
 

public class MainClass {
 
	
	/*
	
	 *  arrayList1 's dates should be month to date 
	 *  		method should get a arrayList as a parameter 
	 *  		and compare arayList dates are in this month 		
	 *  		return are all in this month or not 
	 *  
	 *  arrayList2 's dates should be year to date 
	 *  		method should get a arrayList as a parameter 
	 *  		and compare arayList dates are in this year
	 *  		return are all in this year or not 
	 *  		
	 *  arrayList3 's dates should be trailing 12 months to date 
	 *  		method should get a arrayList as a parameter 
	 *  		and compare arayList dates are in this 12 month
	 *  		return are all in this 12 months or not 
	 *  
	 *  
	 *  
	 *  
	 */
	
	/*
	 * Calculate the age 
	 * 
	 * d1 is a date current date minus d1 should return integer 
	 * 
	 * if date is more then 100 years ago return 0
	 * 
	 * if date is more then current date return a -1 
	 * 
	 * 
	 */

	public int CalculateAge(String d1) throws ParseException {
	  
	     SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	     Date d = sdf.parse(d1);
	     Calendar c = Calendar.getInstance();
	     c.setTime(d);
	
	     
	     
	     int year = c.get(Calendar.YEAR);
	     int month = c.get(Calendar.MONTH) + 1;
	     int date = c.get(Calendar.DATE);
	     LocalDate l1 = LocalDate.of(year, month, date);
	     LocalDate now1 = LocalDate.now();
   
	    
	     
	     Period myAge = Period.between(l1, now1);
	     
	     
	     
	     
	     return myAge.getYears();
	     
	}
	
	
	/*		arrayList2 's dates should be year to date 
	   		method should get a arrayList as a parameter 
	 		and compare arayList dates are in this year
	   		return are all in this year or not 
	*/
	public boolean YearTodate(ArrayList<String> DateArrayList) throws ParseException {
		    
		  boolean answer = false;
		
		  Date today = new Date();
		  
		
		   
		  SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		  
		  String todayStr = formatter.format(today);
		  
		   
		  
				  LocalDate local = LocalDate.now();
				  
				  int day= local.getDayOfMonth();
				  
				  int month = local.getMonthValue();
				  
				  day = day-1;
				  month = month-1;
				  
				  local = local.minusDays(day);
				  local = local.minusMonths(month);
				  
				  String firstDayofYear = local.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
				  
				 
		  
		  
		  
		  Date firstDayofYear_date = new SimpleDateFormat("MM/dd/yyyy").parse(firstDayofYear);
		   
		  Date Today_date = new SimpleDateFormat("MM/dd/yyyy").parse(todayStr);
		  
		  for(int i = 0 ; i<DateArrayList.size(); i++) {
			  
			  Date arrayDate = new SimpleDateFormat("MM/dd/yyyy").parse(DateArrayList.get(i));
			   
			  if(firstDayofYear_date.before(arrayDate) && Today_date.after(arrayDate)) {
				   
				  answer = true;
			  
			  }else {
				  
				  answer = false;
				  break;
				  
			  }
			  
		  }
		  
		return answer;
		
	}
	 	
	public boolean Trailing12Months(ArrayList<String> DateArrayList) throws ParseException {
	    
		  boolean answer = false;
		
		  Date today = new Date();
		    
		  SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		  
		  String todayStr = formatter.format(today);
		  
		  System.out.println("today is here123123123 "+todayStr);
		  
				  LocalDate local = LocalDate.now();
				  
				  int day= local.getDayOfMonth();
				   
				  day = day-1;
				  
				  local = local.minusDays(day);
				  local = local.minusMonths(12);
				  
				  String firstDayofYear = local.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
				  
				  System.out.println("firstDayofYear 123 123 "+firstDayofYear);
		  
		  
		  
		  Date firstDayofYear_date = new SimpleDateFormat("MM/dd/yyyy").parse(firstDayofYear);
		  System.out.println("firstDayofYear_date  "+firstDayofYear_date.getTime());
		  System.out.println("firstDayofYear  "+firstDayofYear);
		  Date Today_date = new SimpleDateFormat("MM/dd/yyyy").parse(todayStr);
		  System.out.println("Today_date  "+Today_date);
		  System.out.println("todayStr  "+todayStr);
		 
		  
		  for(int i = 0 ; i<DateArrayList.size(); i++) {
			  
			  Date arrayDate = new SimpleDateFormat("MM/dd/yyyy").parse(DateArrayList.get(i));
			  
			  System.out.println(arrayDate);
			
			  
			  
			  if(firstDayofYear_date.before(arrayDate) && Today_date.after(arrayDate)) {
				  System.out.println("sadasd");
				  answer = true;
			  
			  }else {
				  System.out.println("123321");
				  answer = false;
				  break;
				  
			  }
			  
		  }
		  System.out.println(answer);
		return answer;
		
	}
		
		
		
		
}
