package org.example;

import org.example.commandpattern.Light;
import org.example.commandpattern.Sterio;
import org.example.commandpattern.commands.LightOffCommand;
import org.example.commandpattern.commands.LightOnCommand;
import org.example.commandpattern.commands.SterioOffCommand;
import org.example.commandpattern.commands.SterioOnWithCdCommand;
import org.example.commandpattern.remotecontroller.SimpleRemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Sterio sterio = new Sterio();

        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.buttonWasPressed();

        remoteControl.setCommand(new SterioOnWithCdCommand(sterio));
        remoteControl.buttonWasPressed();

        remoteControl.setCommand(new SterioOffCommand(sterio));
        remoteControl.buttonWasPressed();

        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.buttonWasPressed();

    }
}