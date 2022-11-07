package leonsolutions.apiKonektor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class ApiKonektorApplication {

	public static void main(String[] args) {

//		TaggedLogger logger = Logger.tag("  ApiKonektorApplication - (c) 2022 ");
		log.warn("@@@@@@@@@@@");
		log.debug("@@@@@@@@@@@");
		log.error("@@@@@@@@@@@");
		SpringApplication.run(ApiKonektorApplication.class, args);
		log.info("@@@@@@@@@@@");
		log.info("All ok. system started... ");
	}

}
