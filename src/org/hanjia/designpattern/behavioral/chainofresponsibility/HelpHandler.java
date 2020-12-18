package org.hanjia.designpattern.behavioral.chainofresponsibility;

/**
 * Parent for all the other classes
 */
public class HelpHandler {
	
	static Topic NO_HELP_TOPIC = new Topic(0);
	
	private HelpHandler successor;
	private Topic topic;

	public HelpHandler() {}

	public HelpHandler(HelpHandler handler, Topic topic) {
		if (handler != null) {
			this.successor = handler;
		}
		if (topic != null) {
			this.topic = topic;
		} else {
			this.topic = NO_HELP_TOPIC;
		}
	}
	
	public boolean hasHelp() {
		return topic != NO_HELP_TOPIC;
	}

	public void setHandler(HelpHandler handler, Topic topic) {
		this.successor = handler;
		this.topic = topic;
	}

	public void handleHelp() {
		if (successor != null) {
			successor.handleHelp();
		}
	}
}
