package org.example.commands;

import org.example.devices.Door;

public class CloseDoorCommand implements Command {
    private Door door;

    public CloseDoorCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.close();
    }
}
