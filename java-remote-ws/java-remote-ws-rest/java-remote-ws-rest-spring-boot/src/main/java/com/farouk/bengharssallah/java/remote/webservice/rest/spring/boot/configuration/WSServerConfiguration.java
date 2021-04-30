package com.farouk.bengharssallah.java.remote.webservice.rest.spring.boot.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farouk.bengharssallah.java.remote.webservice.rest.spring.boot.rest.WSServiceEndpoint;

@Configuration
public class WSServerConfiguration {

	@Bean
	public ResourceConfig getJaxRSExporter() {
		ResourceConfig resource = new ResourceConfig();
		resource.register(WSServiceEndpoint.class);
		return resource;
	}
}
