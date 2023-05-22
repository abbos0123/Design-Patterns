package org.example.command;

import org.example.command.commands.Command;

import java.util.ArrayDeque;
import java.util.Queue;

public class Invoker {
    private Queue<Command> chefQueue;
    private Queue<Command> cashierQueue;

    public Invoker() {
        cashierQueue = new ArrayDeque<>();
        chefQueue = new ArrayDeque<>();
    }

    public void addMeal(Command command) {
        chefQueue.add(command);
    }

    public Command getMeal() {
        return chefQueue.poll();
    }

    public void addCashierCommand(Command command) {
        cashierQueue.add(command);
    }

    public Command getCashier() {
        return cashierQueue.poll();
    }
}
