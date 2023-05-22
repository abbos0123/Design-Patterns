package org.example.command.commands;

public class ToastTurkeyCommand implements Command {

    @Override
    public void execute() {
        cleanTurkey();
        boilTurkey();
        toastTurkey();
        readyTurkey();
    }

    private void cleanTurkey(){
        System.out.println("Turkey is cleaned");
    }

    private void boilTurkey(){
        System.out.println("Turkey is boiled");
    }

    private void toastTurkey(){
        System.out.println("Turkey is toasted !");
    }

    private void readyTurkey(){
        System.out.println("Turkey is ready !");
    }
}
