package org.hanjia.designpattern.behavioral.chainofresponsibility;

public class Dialog extends Widget{

    public Dialog(HelpHandler handler, Topic topic) {
        super(null, topic);
        this.setHandler(handler, topic);
    }

    @Override
    public void handleHelp() {
        /**
         * If the class has a new implementation for handleHelp then execute it, otherwise let the superclass handle it
         */
        if (hasHelp()) {
            System.out.println("Here is the help from the dialog!");
        } else {
            super.handleHelp();
        }
    }
}
