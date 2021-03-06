package org.hanjia.designpattern.behavioral.command;

public class PasteCommand extends Command {
    private Document document;

    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.paste();
    }
}
