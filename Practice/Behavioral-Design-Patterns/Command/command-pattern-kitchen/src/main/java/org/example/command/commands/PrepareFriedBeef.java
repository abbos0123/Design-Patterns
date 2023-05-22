package org.example.command.commands;

public class PrepareFriedBeef implements Command {
    private final String beefType;
    private final int beefWeight;

    public PrepareFriedBeef(String beefType, int beefWeight) {
        this.beefType = beefType;
        this.beefWeight = beefWeight;
    }

    @Override
    public void execute() {
        System.out.println("Started to prepare beef !");
        sliceBeef();
        freeBeef();
        readyBeef();
    }

    private void sliceBeef() {
        System.out.println(beefWeight + " is chopped !");
    }

    private void freeBeef() {
        System.out.println(beefType + " with " + beefWeight + "g is fried!");
    }


    private void readyBeef(){
        System.out.println(beefWeight + "g " + beefType +" is ready!");
    }
}
