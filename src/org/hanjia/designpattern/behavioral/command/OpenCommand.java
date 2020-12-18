package org.hanjia.designpattern.behavioral.command;

public class OpenCommand extends Command {
    private Application application;
    private boolean response;

    public OpenCommand(Application application) {
        this.application = application;
    }

    protected String askUser() {
        return "";
    }

    @Override
    public void execute() {
        String name = askUser();
        if (name != null && !name.equals("")) {
            Document document = new Document(name);
            this.application.add(document);
            document.open();
        }
    }
}
