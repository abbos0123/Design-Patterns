package org.example.command.worker;

import org.example.command.Invoker;
import org.example.command.commands.Command;
import org.example.command.commands.PayCommand;
import org.example.command.commands.PrepareFriedBeef;
import org.example.command.commands.ToastTurkeyCommand;

import java.util.List;
import java.util.Scanner;

public class Waitress extends Thread {
    private Invoker invoker;

    public Waitress(Invoker invoker) {
        this.invoker = invoker;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Get Order: ");
            System.out.println("1 -> Toasted Turkey");
            System.out.println("2 -> Fry Beef");
            System.out.println("3 -> Result");
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();

            if (k == 1) {
                ToastTurkeyCommand toastTurkeyCommand = new ToastTurkeyCommand();
                invoker.addMeal(toastTurkeyCommand);
            } else if (k == 2){
                PrepareFriedBeef beef = new PrepareFriedBeef("fat", 200);
                invoker.addMeal(beef);
            }else if (k == 3){
                PayCommand payCommand = new PayCommand();
                invoker.addCashierCommand(payCommand);
            }

            System.out.println("-------------------------------------------------------");
        }
    }
}
