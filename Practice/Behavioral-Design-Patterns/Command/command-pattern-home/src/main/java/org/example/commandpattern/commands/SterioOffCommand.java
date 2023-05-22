package org.example.commandpattern.commands;

import org.example.commandpattern.Sterio;

public class SterioOffCommand implements Command{
    private Sterio sterio;

    public SterioOffCommand(Sterio sterio) {
        this.sterio = sterio;
    }

    @Override
    public void execute() {
        sterio.off();
    }
}
