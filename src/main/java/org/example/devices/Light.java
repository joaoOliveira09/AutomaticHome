package org.example.devices;

public class Light extends Device {
    private String nome;

    public Light(String nome) {
        this.nome = nome;
    }

    public void turnOn() {
        System.out.println("Ligando a luz: " + nome);
    }

    public void turnOff() {
        System.out.println("Desligando a luz: " + nome);
    }
}



