package io.angoa.realty.clouddiscovery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.netflix.eureka.EurekaServerContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ClouddiscoveryApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private EurekaServerContext eurekaServerContext;

	@Test
	public void contextLoads() {
		assertThat(applicationContext).isNotNull();
	}

	@Test
	public void eurekaServerContextLoads() {
		assertThat(eurekaServerContext).isNotNull();
	}

	@Test
	public void eurekaServerIsUp() {
		assertThat(eurekaServerContext.getServerConfig()).isNotNull();
	}
}
