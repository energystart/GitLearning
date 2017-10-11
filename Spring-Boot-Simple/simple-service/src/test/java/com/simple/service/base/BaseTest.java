package com.simple.service.base;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

public class BaseTest extends AbstractJUnit4SpringContextTests{

	protected Logger logger = LoggerFactory.getLogger(getClass());
	protected ApplicationContext appContext;
	
	@Before
    public void initialize() {
        this.appContext = this.applicationContext;
    }
}
