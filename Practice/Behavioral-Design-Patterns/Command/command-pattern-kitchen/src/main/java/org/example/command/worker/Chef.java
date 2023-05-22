package org.example.command.worker;

import org.example.command.Invoker;
import org.example.command.commands.Command;

import java.util.List;

public class Chef extends Thread {
    private final Invoker invoker;

    public Chef(Invoker invoker) {
        this.invoker = invoker;
    }

    @Override
    public void run() {
        while (true) {
            Command command = invoker.getMeal();
            if (command != null) {
                command.execute();
            }

            try {
                sleep(1000);
            } catch (InterruptedException e) {
             //   throw new RuntimeException(e);
            }
        }
    }
}
