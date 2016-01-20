import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogTest {
	private Logger log = Logger.getLogger(LogTest.class);

	public LogTest() {
		PropertyConfigurator.configure("log4j.properties");
	}

	public void test() {
		log.info("log info");
		log.debug("log debug");
		log.warn("log warn");
		log.error("log error");
		log.fatal("log fatal");
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		HashMap map;
		new LogTest().test();
	}

}
