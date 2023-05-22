package org.example.commandpattern.commands;

import org.example.commandpattern.Light;
import org.example.commandpattern.commands.Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }
}
