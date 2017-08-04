package com.didispace;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * @SpringCloudApplication注解，它整合了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication
{
	public static void main(final String[] args)
	{
		new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
	}
}
