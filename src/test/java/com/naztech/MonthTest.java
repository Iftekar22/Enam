package com.naztech;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonthTest {

	

	@Test
	public void testDaysInMonth() {
		assertEquals(31, Month.JANUARY.daysInMonth());
		assertEquals(28, Month.FEBRUARY.daysInMonth());
		assertEquals(31, Month.MARCH.daysInMonth());
		assertEquals(30, Month.APRIL.daysInMonth());
		assertEquals(31, Month.MAY.daysInMonth());
		assertEquals(30, Month.JUNE.daysInMonth());
		assertEquals(31, Month.JULY.daysInMonth());
		assertEquals(31, Month.AUGUST.daysInMonth());
		assertEquals(30, Month.SEPTEMBER.daysInMonth());
		assertEquals(31, Month.OCTOBER.daysInMonth());
		assertEquals(30, Month.NOVEMBER.daysInMonth());
		assertEquals(31, Month.DECEMBER.daysInMonth());
	}

	@Test
	public void testGetShortName() {
		assertEquals("Jan",Month.JANUARY.getShortName());
		assertEquals("Feb",Month.FEBRUARY.getShortName());
		assertEquals("Mar",Month.MARCH.getShortName());
		assertEquals("Apr",Month.APRIL.getShortName());
		assertEquals("May",Month.MAY.getShortName());
		assertEquals("Jun",Month.JUNE.getShortName());
		assertEquals("Jul",Month.JULY.getShortName());
		assertEquals("Aug",Month.AUGUST.getShortName());
		assertEquals("Sep",Month.SEPTEMBER.getShortName());
		assertEquals("Oct",Month.OCTOBER.getShortName());
		assertEquals("Nov",Month.NOVEMBER.getShortName());
		assertEquals("Dec",Month.DECEMBER.getShortName());
	}

	@Test
	public void testParse() {
		assertNotNull(Month.JANUARY.parse(("January")));
		assertNull(Month.JANUARY.parse(("Janu")));
		
		assertNotNull(Month.FEBRUARY.parse(("February")));
		assertNull(Month.FEBRUARY.parse(("febu")));
		
		assertNotNull(Month.MARCH.parse(("March")));
		assertNull(Month.MARCH.parse(("Marc")));
		
		assertNotNull(Month.APRIL.parse(("April")));
		assertNull(Month.APRIL.parse(("Janu")));
		
		assertNotNull(Month.MAY.parse(("May")));
		assertNull(Month.MAY.parse(("Janu")));
		
		assertNotNull(Month.JUNE.parse(("June")));
		assertNull(Month.JUNE.parse(("Janu")));
		
		assertNotNull(Month.JULY.parse(("July")));
		assertNull(Month.JULY.parse(("Janu")));
		
		assertNotNull(Month.AUGUST.parse(("August")));
		assertNull(Month.AUGUST.parse(("Janu")));
		
		assertNotNull(Month.SEPTEMBER.parse(("September")));
		assertNull(Month.SEPTEMBER.parse(("Janu")));
		
		assertNotNull(Month.OCTOBER.parse(("October")));
		assertNull(Month.OCTOBER.parse(("Janu")));
		
		assertNotNull(Month.NOVEMBER.parse(("November")));
		assertNull(Month.NOVEMBER.parse(("Janu")));
		
		assertNotNull(Month.DECEMBER.parse(("December")));
		assertNull(Month.DECEMBER.parse(("Janu")));
	}

}
