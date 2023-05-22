package org.example.commandpattern.commands;

import org.example.commandpattern.Sterio;

public class SterioOnWithCdCommand implements Command{
    private Sterio sterio;

    public SterioOnWithCdCommand(Sterio sterio) {
        this.sterio = sterio;
    }

    @Override
    public void execute() {
        sterio.on();
        sterio.setCD();
        sterio.setVolume(12);
    }
}
