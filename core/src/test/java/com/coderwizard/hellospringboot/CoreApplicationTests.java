package com.coderwizard.hellospringboot;

//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;

import com.coderwizard.core.service.PaymentService;
import com.coderwizard.core.service.PaymentServiceImpl;

import static org.junit.Assert.*;

//@RunWith(SpringRuner.class)
@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentService service;

	@Test
	public void testDependencyInjection() {
		//assertNoNull(service);

	}

}
