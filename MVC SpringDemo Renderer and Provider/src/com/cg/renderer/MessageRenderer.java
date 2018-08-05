
package com.cg.renderer;

import com.cg.provider.MessageProvider;

//MessageRenderer interface receives the message given by MessageProvider
public interface MessageRenderer {

	void setMessageProvider(MessageProvider provider);

	void render();
}
