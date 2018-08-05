
package com.cg.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.renderer.MessageRenderer;

/**
 * @author Pooja Karnik MVC Spring Application - Renderer and Provider
 *
 */
public class Test {

	// as per context.xml, provider contains GMMessageProvider and renderer contains
	// ConsoleRenderer so Good Morning message gets printed on the console
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		((MessageRenderer) context.getBean("renderer")).render();
	}
}
