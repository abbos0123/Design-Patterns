package org.example.command.worker;

import org.example.command.Invoker;
import org.example.command.commands.Command;

import java.util.Queue;

public class Cashier extends Thread{
   private final Invoker invoker;

    public Cashier(Invoker invoker) {
      this.invoker = invoker;
    }

    @Override
    public void run() {
        while (true){
            Command command = invoker.getCashier();
            if (command != null){
                command.execute();
            }

            try {
                sleep(3000);
            } catch (InterruptedException e) {
                //todo something
            }
        }
    }
}
