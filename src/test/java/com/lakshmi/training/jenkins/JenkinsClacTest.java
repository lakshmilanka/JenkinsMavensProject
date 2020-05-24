package com.lakshmi.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsClacTest {

@Test
public void addTest() {
	JenkinsCalculator myCalc = new JenkinsCalculator();
	assertEquals(10,myCalc.addNumbers(5, 5));
}

@Test
public void subTractTest() {
	JenkinsCalculator myCalc = new JenkinsCalculator();
	assertEquals(5,myCalc.subtractNumbers(10, 5));
}
	

}
