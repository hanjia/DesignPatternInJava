package org.hanjia.designpattern.behavioral.chainofresponsibility;

public class Demo {
    final static Topic PRINT_TOPIC = new Topic(1);
    final static Topic PAPER_ORIENTATION_TOPIC = new Topic(2);
    final static Topic APPLICATION_TOPIC = new Topic(3);

    public static void main(String[] args) {
        Application application = new Application(APPLICATION_TOPIC);
        Dialog dialog = new Dialog(application, PRINT_TOPIC);
        Button button = new Button(dialog, PAPER_ORIENTATION_TOPIC);

        button.handleHelp();
        dialog.handleHelp();
        application.handleHelp();
    }
}
