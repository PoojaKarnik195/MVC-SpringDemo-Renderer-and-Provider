
package com.cg.renderer;

import com.cg.provider.MessageProvider;

//ConsoleRenderer creates a reference of MessageProvider to get the message
public class ConsoleRenderer implements MessageRenderer {

	MessageProvider provider;

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}

	// getting message from provider
	@Override
	public void render() {
		System.out.println(provider.getMessage());
	}
}
