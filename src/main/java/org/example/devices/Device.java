package org.example.devices;

public abstract class Device {
    private boolean isOn;

    public Device() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Comando executado: Ligar " + getClass().getSimpleName());
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Comando executado: Desligar " + getClass().getSimpleName());
    }

    public boolean isOn() {
        return isOn;
    }
}
