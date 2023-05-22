package org.example.commandpattern.commands;

import org.example.commandpattern.Light;
import org.example.commandpattern.commands.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }
}
