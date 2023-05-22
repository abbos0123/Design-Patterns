package org.example;

import org.example.command.Invoker;
import org.example.command.worker.Cashier;
import org.example.command.worker.Chef;
import org.example.command.worker.Waitress;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Invoker invoker = new Invoker();
        Waitress waitress = new Waitress(invoker);
        Chef chef = new Chef(invoker);
        Cashier cashier = new Cashier(invoker);

        waitress.start();
        chef.start();
        cashier.start();

        waitress.join();
        cashier.join();
        chef.join();
    }
}