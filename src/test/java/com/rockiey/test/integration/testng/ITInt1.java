package com.rockiey.test.integration.testng;


import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ITInt1 {
	Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void integration1() {
		logger.debug("integration test 1");
	}
}
