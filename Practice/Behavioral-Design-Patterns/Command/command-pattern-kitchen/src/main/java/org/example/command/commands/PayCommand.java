package org.example.command.commands;

public class PayCommand implements Command {
    @Override
    public void execute() {
        System.err.println("Cashier calculated total money!");
    }
}
