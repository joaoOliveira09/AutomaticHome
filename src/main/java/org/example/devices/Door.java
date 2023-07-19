package org.example.devices;

import org.example.devices.Device;

public class Door extends Device {
    private String doorName;

    public Door(String doorName) {
        this.doorName = doorName;
    }

    public void open() {
        System.out.println("Abrindo a porta: " + doorName);
    }

    public void close() {
        System.out.println("Fechando a porta: " + doorName);

    }
}

