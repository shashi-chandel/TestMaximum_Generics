package com.capgemini.testmaximum;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMaximumTest {
	@Test
	public void givenMaxIntAtPositionOne_ShouldReturnSameNumber() {
		FindMaximum<Integer> findMaximumObj = new FindMaximum<Integer>(); 
		findMaximumObj.findMaximum(1,5,2);
		assertEquals(5, (int)findMaximumObj.maximum());
	}

	@Test
	public void givenMaxIntAtPositionTwo_ShouldReturnSameNumber() {
		FindMaximum<Integer> findMaximumObj = new FindMaximum<Integer>(); 
		findMaximumObj.findMaximum(3,5,1);
		assertEquals(5, (int)findMaximumObj.maximum());
	}

	@Test
	public void givenMaxIntAtPositionThree_ShouldReturnSameNumber() {
		FindMaximum<Integer> findMaximumObj = new FindMaximum<Integer>(); 
		findMaximumObj.findMaximum(1,3,5);
		assertEquals(5, (int)findMaximumObj.maximum());
	}
	
	@Test
	public void givenVariableArgs_ShouldReturnCorrectMax() {
		FindMaximum<Integer> findMaximumObj = new FindMaximum<Integer>(); 
		findMaximumObj.findMaximum(1,3,5,2,9);
		assertEquals(9, (int)findMaximumObj.maximum());
	}
	
	@Test
    public void givenMaxFloatAtPositionOne_ShouldReturnSameNumber()
    {
		FindMaximum<Float> findMaximumObj = new FindMaximum<Float>(); 
		findMaximumObj.findMaximum(6.1f,3.5f,5.5f);
		assertEquals(6.1f, (float)findMaximumObj.maximum(),0.0f);
    }
    
    @Test
    public void givenMaxFloatAtPositionTwo_ShouldReturnSameNumber()
    {
    	FindMaximum<Float> findMaximumObj = new FindMaximum<Float>(); 
		findMaximumObj.findMaximum(3.5f,6.1f,5.5f);
		assertEquals(6.1f, (float)findMaximumObj.maximum(),0.0f);
    }
    
    @Test
    public void givenMaxFloatAtPositionThree_ShouldReturnSameNumber()
    {
    	FindMaximum<Float> findMaximumObj = new FindMaximum<Float>(); 
		findMaximumObj.findMaximum(5.5f,3.5f,6.1f);
		assertEquals(6.1f, (float)findMaximumObj.maximum(),0.0f);
    }
    
    @Test
    public void givenVariableFloatArgs_ShouldReturnCorrectMax()
    {
    	FindMaximum<Float> findMaximumObj = new FindMaximum<Float>(); 
		findMaximumObj.findMaximum(5.5f,3.5f,6.1f,9.2f,15.6f);
		assertEquals(15.6f, (float)findMaximumObj.maximum(),0.0f);
    }

	@Test
	public void givenMaxStringAtPositionOne_ShouldReturnSameString() {
		FindMaximum<String> findMaximumObj = new FindMaximum<String>(); 
		findMaximumObj.findMaximum("Peach","Apple","Banana");
		assertEquals("Peach",findMaximumObj.maximum());
	}

	@Test
	public void givenMaxStringAtPositionTwo_ShouldReturnSameString() {
		FindMaximum<String> findMaximumObj = new FindMaximum<String>(); 
		findMaximumObj.findMaximum("Apple","Peach","Banana");
		assertEquals("Peach",findMaximumObj.maximum());
	}

	@Test
	public void givenMaxStringAtPositionThree_ShouldReturnSameString() {
		FindMaximum<String> findMaximumObj = new FindMaximum<String>(); 
		findMaximumObj.findMaximum("Apple","Banana","Peach");
		assertEquals("Peach",findMaximumObj.maximum());
	}
	
	@Test
	public void givenVariableStringArgs_ShouldReturnCorrectMax() {
		FindMaximum<String> findMaximumObj = new FindMaximum<String>(); 
		findMaximumObj.findMaximum("Apple","Banana","Peach","Ball","Cat","Bat","Treat");
		assertEquals("Treat",findMaximumObj.maximum());
	}
}
