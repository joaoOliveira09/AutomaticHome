package org.example.commands;

import org.example.devices.Door;

public class OpenDoorCommand implements Command {
    private Door door;

    public OpenDoorCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.open();
    }
}
