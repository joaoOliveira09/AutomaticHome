package org.example.routines;

import org.example.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Routine {
    private String name;
    private List<Command> commands;

    public Routine(String name) {
        this.name = name;
        this.commands = new ArrayList<>();
    }
// metododo para adicionar os comandos
    public void addCommand(Command command) {
        commands.add(command);
    }

    public void execute() {
        System.out.println("Executando a rotina: " + name);
        for (Command command : commands) {
            command.execute();
        }
    }
}

