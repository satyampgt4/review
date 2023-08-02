package com.db.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SciCalTest {

	SciCal cal= new SciCal();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	
	@Test
	public void testabs() {
		assertEquals(4,(int)cal.abs( -4));  
	}
	@Test
	public void testexpo() {
		assertEquals(1,(int)cal.expo( 0));  
	}
	@Test
	public void testln() {
		assertEquals(0,(int)cal.ln( 1));  
	}
	@Test
	public void testlog() {
		assertEquals(1,(int)cal.log( 10));  
	}
	@Test
	public void testsqrt() {
		assertEquals(4,(int)cal.sqrt(16 ));  
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}
}
