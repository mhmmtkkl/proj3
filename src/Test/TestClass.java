package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Main.MainClass;
 

public class TestClass {
 
	MainClass m1 = new MainClass();
	 
	@Test
	public void AgeTest() throws ParseException {
		
		int mineAge = m1.CalculateAge("11/05/1993");
		
		Assert.assertTrue(mineAge==25);
		 
	}
	
	@Test
	public void AgeTest2() throws ParseException {
		
		int mineAge = m1.CalculateAge("05/01/1993");
		
		Assert.assertTrue(mineAge==26);
		 
	}
	
	@Test
	public void AgeTest3() throws ParseException {
		
		int mineAge = m1.CalculateAge("05/06/2015");
		
		Assert.assertTrue(mineAge==4);
		 
	}
	
	@Test
	public void AgeTest4() throws ParseException {
		
		int mineAge = m1.CalculateAge("06/07/2014");
		
		Assert.assertTrue(mineAge==5);
		 
	}
	
	@Test
	public void YearToDay1() throws ParseException {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("01/02/2019");
		a1.add("01/07/2019");
		a1.add("08/07/2019");
		a1.add("09/14/2019");
		
		boolean mineAge = m1.YearTodate(a1);
		
		Assert.assertTrue(mineAge==true);
		 
	}
	
	@Test
	public void YearToDay2() throws ParseException {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("01/02/2019");
		a1.add("10/15/2018");
		a1.add("09/07/2019");
		a1.add("09/14/2019");
		
		boolean mineAge = m1.YearTodate(a1);
		
		Assert.assertTrue(mineAge==false);
		 
	}
	
	@Test
	public void YearToDay3() throws ParseException {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("01/02/2019");
		a1.add("01/13/2019");
		a1.add("08/07/2019");
		a1.add("05/15/2020");
		
		boolean mineAge = m1.YearTodate(a1);
		
		Assert.assertTrue(mineAge==false);
		 
	}
	
	@Test
	public void YearToDay4() throws ParseException {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("01/02/2019");
		a1.add("02/07/2019");
		a1.add("09/07/2019");
		a1.add("03/14/2019");
		
		boolean mineAge = m1.YearTodate(a1);
		
		Assert.assertTrue(mineAge==true);
		 
	}
	
	@Test
	public void Trailing12Months1() throws ParseException {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("09/02/2019");
		a1.add("11/07/2018");
		a1.add("12/07/2018");
		a1.add("09/14/2019");
		
		boolean mineAge = m1.Trailing12Months(a1);
		
		Assert.assertTrue(mineAge==true);
		 
	}
	
	@Test
	public void Trailing12Months2() throws ParseException {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("09/02/2019");
		a1.add("09/07/2019");
		a1.add("10/07/2018");
		a1.add("09/14/2019");
		
		boolean mineAge = m1.Trailing12Months(a1);
		
		Assert.assertTrue(mineAge==true);
		 
	}
	
	@Test
	public void Trailing12Months3() throws ParseException {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("01/02/2019");
		a1.add("10/15/2015");
		a1.add("11/07/2018");
		a1.add("09/14/2019");
		
		boolean mineAge = m1.Trailing12Months(a1);
		
		Assert.assertTrue(mineAge==false);
		 
	}
	
	@Test
	public void Trailing12Months4() throws ParseException {
		
		ArrayList<String> a1 = new ArrayList<>();
		
		a1.add("01/02/2019");
		a1.add("11/07/2018");
		a1.add("12/07/2018");
		a1.add("03/14/2019");
		
		boolean mineAge = m1.Trailing12Months(a1);
		
		Assert.assertTrue(mineAge==true);
		 
	}
	
	
}
