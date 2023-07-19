package org.example.devices;

import org.example.devices.Device;

public class SoundSystem extends Device {
    private String soundSystemName;

    public SoundSystem(String soundSystemName) {
        this.soundSystemName = soundSystemName;
    }

    public void playMusic() {
        System.out.println("Reproduzindo música no sistema de som: " + soundSystemName);

    }

    public void stopMusic() {
        System.out.println("Parando a reprodução de música no sistema de som: " + soundSystemName);

    }
}

