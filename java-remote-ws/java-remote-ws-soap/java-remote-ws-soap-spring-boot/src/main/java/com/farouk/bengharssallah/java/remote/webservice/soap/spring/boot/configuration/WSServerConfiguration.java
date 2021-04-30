package com.farouk.bengharssallah.java.remote.webservice.soap.spring.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class WSServerConfiguration {

	@Bean
	public SimpleJaxWsServiceExporter getJaxWsServiceExporter() {
		SimpleJaxWsServiceExporter resource = new SimpleJaxWsServiceExporter();
		resource.setBaseAddress("http://0.0.0.0:8088/api");
		return resource;
	}
}
