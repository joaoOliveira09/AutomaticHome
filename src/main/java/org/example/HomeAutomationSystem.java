package org.example;

import org.example.commands.*;
import org.example.devices.Door;
import org.example.devices.Light;
import org.example.devices.SecuritySystem;
import org.example.devices.SoundSystem;
import org.example.routines.Routine;

public class HomeAutomationSystem {
    public static void main(String[] args) {
        // Criando objetos dos dispositivos
        Light livingRoomLight = new Light("Sala de Estar");
        Door mainDoor = new Door("Porta Principal");
        SoundSystem stereoSystem = new SoundSystem("Sistema de Som Stereo");
        SecuritySystem securitySystem = new SecuritySystem("Sistema de Segurança");

        // Criando objetos dos comandos e associando aos dispositivos
        Command TurnOfLivingRoomLight = new TurnOfLightCommand(livingRoomLight);
        Command turnOnLivingRoomLight = new TurnOnLightCommand(livingRoomLight);
        Command openMainDoor = new OpenDoorCommand(mainDoor);
        Command closeDoorCommand = new CloseDoorCommand(mainDoor);
        Command playMusic = new PlayMusicCommand(stereoSystem);
        Command startSecuritySystem = new StartSecuritySystemCommand(securitySystem);


        // Executando as rotinas personalizadas em sequência
        Routine morningRoutine = new Routine("Rotina da Manhã");
        morningRoutine.addCommand(turnOnLivingRoomLight);
        morningRoutine.addCommand(openMainDoor);
        morningRoutine.execute();

        System.out.println("=====================================================================");

        Routine partyRoutine = new Routine("Rotina de Festa");
        partyRoutine.addCommand(turnOnLivingRoomLight);
        partyRoutine.addCommand(playMusic);
        partyRoutine.addCommand(startSecuritySystem);
        partyRoutine.execute();

        System.out.println("=====================================================================");
        Routine nightRoutine = new Routine("Rotina Noturna");
        nightRoutine.addCommand(TurnOfLivingRoomLight);
        nightRoutine.addCommand(startSecuritySystem);
        nightRoutine.addCommand(closeDoorCommand);
        nightRoutine.execute();
    }
}

