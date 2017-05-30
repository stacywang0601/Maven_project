package com.pers.maven;	
import org.junit.Test;

import com.pers.maven.Hello;

import static junit.framework.Assert.*;
public class HelloTest {
	@Test
	public void testHello(){
		Hello hello = new Hello();
		String results = hello.sayHello("litingwei");
		assertEquals("Hello litingwei!",results);	
	}
}