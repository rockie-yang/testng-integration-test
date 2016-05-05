package unit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TestUnit1 {
    Logger logger = Logger.getLogger(this.getClass());

    @Test
    public void unit1() {
        logger.debug("unit1");
        System.out.println("unit test 1");
    }
}
