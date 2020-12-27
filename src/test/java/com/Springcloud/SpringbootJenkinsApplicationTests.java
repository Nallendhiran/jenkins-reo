package com.Springcloud;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootJenkinsApplicationTests {

	@Test
	void contextLoads() {

		Logger log=LoggerFactory.getLogger(SpringbootJenkinsApplication.class);
		log.info("--------------------------initialized with some message and with test------------------------------------------------");
	}

}
