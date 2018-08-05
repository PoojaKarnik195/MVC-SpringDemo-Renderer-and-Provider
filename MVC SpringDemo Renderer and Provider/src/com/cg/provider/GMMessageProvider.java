
package com.cg.provider;

//GMMessageProvider overrides getMessage method to print good morning message
public class GMMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {

		return "Good Morning!";
	}
}
