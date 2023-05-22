package org.example.commandpattern.remotecontroller;

import org.example.commandpattern.commands.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }


}
