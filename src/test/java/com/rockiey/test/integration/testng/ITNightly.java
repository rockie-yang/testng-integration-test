package com.rockiey.test.integration.testng;


import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class ITNightly {
	Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void smokeTest() {
		logger.debug("this is a nightly test");
	}
}
