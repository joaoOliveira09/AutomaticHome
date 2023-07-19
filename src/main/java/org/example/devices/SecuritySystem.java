package org.example.devices;

import org.example.devices.Device;

public class SecuritySystem extends Device {
    private String securitySystemName;

    public SecuritySystem(String securitySystemName) {
        this.securitySystemName = securitySystemName;
    }

    public void start() {
        System.out.println("Iniciando o sistema de segurança: " + securitySystemName);
    }

    public void stop() {
        System.out.println("Parando o sistema de segurança: " + securitySystemName);
    }
}

