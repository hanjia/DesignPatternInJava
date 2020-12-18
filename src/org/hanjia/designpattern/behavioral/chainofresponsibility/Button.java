package org.hanjia.designpattern.behavioral.chainofresponsibility;

public class Button extends Widget{

    public Button(Widget successor, Topic topic) {
        super(successor, topic);
    }

    @Override
    public void handleHelp() {
        /**
         * If the class has a new implementation for handleHelp then execute it, otherwise let the superclass handle it
         */
        if (hasHelp()) {
            System.out.println("Here is the help from the button!");
        } else {
            super.handleHelp();
        }
    }
}
