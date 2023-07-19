package org.example.commands;

import org.example.commands.Command;
import org.example.devices.SecuritySystem;

public class StartSecuritySystemCommand implements Command {
    private SecuritySystem securitySystem;

    public StartSecuritySystemCommand(SecuritySystem securitySystem) {
        this.securitySystem = securitySystem;
    }

    public void execute() {
        securitySystem.start();
    }
}
