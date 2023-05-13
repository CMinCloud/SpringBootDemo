package com.cm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo13ConfigurationApplicationTests {

	@Value("${datasource.password}")
	private String password;

	@Test
	void contextLoads() {
		System.out.println(password);
	}

}
