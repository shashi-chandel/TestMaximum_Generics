package com.capgemini.testmaximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMaximumTest {

	@Test
	public void givenMaxAtPositionOne_ShouldReturnSameNumber() {
		int max = FindMaximum.findMaximum(5, 3, 1);
		assertEquals(5, max);
	}

	@Test
	public void givenMaxAtPositionTwo_ShouldReturnSameNumber() {
		int max = FindMaximum.findMaximum(3, 5, 1);
		assertEquals(5, max);
	}

	@Test
	public void givenMaxAtPositionThree_ShouldReturnSameNumber() {
		int max = FindMaximum.findMaximum(3, 1, 5);
		assertEquals(5, max);
	}

	@Test
	public void givenMaxFloatAtPositionOne_ShouldReturnSameNumber() {
		Float max = FindMaximum.findMaximum(5.5f, 3.2f, 1.8f);
		assertEquals(5.5, max, 0.0);
	}

	@Test
	public void givenMaxFloatAtPositionTwo_ShouldReturnSameNumber() {
		Float max = FindMaximum.findMaximum(3.2f, 5.5f, 1.8f);
		assertEquals(5.5, max, 0.0);
	}

	@Test
	public void givenMaxFloatAtPositionThree_ShouldReturnSameNumber() {
		Float max = FindMaximum.findMaximum(3.2f, 1.5f, 5.5f);
		assertEquals(5.5, max, 0.0);
	}
	
	@Test
    public void givenMaxAtPositionOne_ShouldReturnSameString()
    {
    	String max = FindMaximum.findMaximum("Peach","Apple","Banana");
        assertEquals("Peach", max);
    }
    
    @Test
    public void givenMaxAtPositionTwo_ShouldReturnSameString()
    {
    	String max = FindMaximum.findMaximum("Apple", "Peach","Banana");
    	assertEquals("Peach", max);
    }
    
    @Test
    public void givenMaxAtPositionThree_ShouldReturnSameString()
    {
    	String max = FindMaximum.findMaximum("Apple","Banana", "Peach");
    	assertEquals("Peach", max);
    }
}
