package com.didispace;

import org.springframework.stereotype.Component;


/**
 * @author jiayin.wang
 * @date 2017-07-21
 */
@Component
public class DcClientFallback implements DcClient
{

	@Override
	public String consumer()
	{
		return "fallback";
	}

}
