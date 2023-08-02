package com.db.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class demotest {

	@Before
	public void  setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	 @Test  
	    public void testFindMax(){  
	        assertEquals(4,DemoJUnit.findMax(new int[]{1,3,4,2}));  
	    
	    } 

}
