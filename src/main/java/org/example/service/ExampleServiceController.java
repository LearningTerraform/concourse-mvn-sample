package org.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/example")
public class ExampleServiceController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExampleServiceController.class);
	private static final String UUID = java.util.UUID.randomUUID().toString();


	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public @ResponseBody String sayHello() {
		LOGGER.info("springbootlogsonazure instance=" + UUID);
		return "Hello World!";
	}
}
