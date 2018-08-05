
package com.cg.renderer;

import com.cg.provider.MessageProvider;

//PDFRenderer creates a reference of MessageProvider to get the message
public class PDFRenderer implements MessageRenderer {

	MessageProvider provider;

	// getting message from provider
	@Override
	public void render() {
		System.out.println(provider.getMessage() + " on PDF :D");
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}
}
