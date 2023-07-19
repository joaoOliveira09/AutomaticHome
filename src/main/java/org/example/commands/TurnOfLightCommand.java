package org.example.commands;

import org.example.devices.Light;

public class TurnOfLightCommand implements Command {
    private Light light;

    public TurnOfLightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}
