package org.hanjia.designpattern.behavioral.chainofresponsibility;

public class Widget extends HelpHandler{
    private Widget parent;

    public Widget(Widget parent, Topic topic) {
        super(parent, topic);
        this.parent = parent;
    }
}
