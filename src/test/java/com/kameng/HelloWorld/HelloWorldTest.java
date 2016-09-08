package com.kameng.HelloWorld;

import org.junit.Test;

import junit.framework.Assert;

public class HelloWorldTest {
	
	@Test
	public void testSayHello(){
		HelloWorld helloWorld = new HelloWorld();
		String result = helloWorld.sayHello();
		Assert.assertEquals("Hello Maven", result);
	}
}
