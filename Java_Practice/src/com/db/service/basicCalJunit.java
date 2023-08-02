/**
 * 
 */
package com.db.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.db.junit.DemoJUnit;

/**
 * 
 */
public class basicCalJunit {

	/**
	 * @throws java.lang.Exception
	 */
	BasicCal basicCal= new BasicCal();
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testAdd() {
		
		assertEquals(4,(int)basicCal.addation( 1,3));  
	}
	@Test
	public void testsub() {
		assertEquals(4,(int)basicCal.subtraction( 7,3));  
	}
	@Test
	public void testmul() {
		assertEquals(4,(int)basicCal.multiply( 2,2));  
	}
	@Test
	public void testdiv() {
		assertEquals(4,(int)basicCal.division( 8,2));  
	}

}
