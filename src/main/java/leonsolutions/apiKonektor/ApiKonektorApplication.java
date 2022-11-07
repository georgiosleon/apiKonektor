package leonsolutions.apiKonektor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tinylog.Logger;
import org.tinylog.TaggedLogger;

@SpringBootApplication
public class ApiKonektorApplication {

	public static void main(String[] args) {

		TaggedLogger logger = Logger.tag("  ApiKonektorApplication - (c) 2022 ");
		logger.warn  ("@@@@@@@@@@@");
		logger.debug ("@@@@@@@@@@@");
		logger.error ("@@@@@@@@@@@");
		SpringApplication.run(ApiKonektorApplication.class, args);
		logger.info  ("@@@@@@@@@@@");
		logger.info  ("All ok. system started... ");
	}

}
