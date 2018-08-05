
package com.cg.provider;

//HWMessageProvider overrides getMessage method to print hello world message
public class HWMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {

		return "Hello World";
	}

}