package org.hanjia.designpattern.behavioral.chainofresponsibility;

public class Application extends HelpHandler{

    public Application(Topic topic) {
        super(null, topic);
    }

    @Override
    public void handleHelp() {
        System.out.println("Here is a list of help topics from application: a) XXX; b) XXX. ");
    }

}
