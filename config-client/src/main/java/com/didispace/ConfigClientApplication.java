package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication
{

	public static void main(final String[] args)
	{
		new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
	}

}
