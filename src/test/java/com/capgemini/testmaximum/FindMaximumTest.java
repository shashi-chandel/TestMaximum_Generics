package com.capgemini.testmaximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMaximumTest {
	FindMaximum findMaximumObj; 
	
	@Test
	public void givenMaxIntAtPositionOne_ShouldReturnSameNumber() {
		findMaximumObj = new FindMaximum<Integer>(5,3,1);
		findMaximumObj.maximum();
		assertEquals(5,findMaximumObj.maximum());
	}

	@Test
	public void givenMaxIntAtPositionTwo_ShouldReturnSameNumber() {
		findMaximumObj = new FindMaximum<Integer>(3,5,1);
		findMaximumObj.maximum();
		assertEquals(5,findMaximumObj.maximum());
	}

	@Test
	public void givenMaxIntAtPositionThree_ShouldReturnSameNumber() {
		findMaximumObj = new FindMaximum<Integer>(3,1,5);
		findMaximumObj.maximum();
		assertEquals(5,findMaximumObj.maximum());
	}
	
	@Test
    public void givenMaxFloatAtPositionOne_ShouldReturnSameNumber()
    {
		findMaximumObj = new FindMaximum<Float>(5.5f, 3.2f, 1.8f);
		findMaximumObj.maximum();
		assertEquals(5.5f,findMaximumObj.maximum());
    }
    
    @Test
    public void givenMaxFloatAtPositionTwo_ShouldReturnSameNumber()
    {
    	findMaximumObj = new FindMaximum<Float>(3.2f , 5.5f , 1.8f);
        findMaximumObj.maximum();
		assertEquals(5.5f,findMaximumObj.maximum());
    }
    
    @Test
    public void givenMaxFloatAtPositionThree_ShouldReturnSameNumber()
    {
    	findMaximumObj = new FindMaximum<Float>(3.2f, 1.5f, 5.5f);
        findMaximumObj.maximum();
		assertEquals(5.5f,findMaximumObj.maximum());
    }

	@Test
	public void givenMaxAtPositionOne_ShouldReturnSameString() {
		findMaximumObj = new FindMaximum<String>("Peach", "Apple", "Banana");
		findMaximumObj.maximum();
		assertEquals("Peach",findMaximumObj.maximum());
	}

	@Test
	public void givenMaxAtPositionTwo_ShouldReturnSameString() {
		findMaximumObj = new FindMaximum<String>("Apple", "Peach", "Banana");
		findMaximumObj.maximum();
		assertEquals("Peach",findMaximumObj.maximum());
	}

	@Test
	public void givenMaxAtPositionThree_ShouldReturnSameString() {
		findMaximumObj = new FindMaximum<String>("Apple", "Banana", "Peach");
		findMaximumObj.maximum();
		assertEquals("Peach",findMaximumObj.maximum());
	}
}
