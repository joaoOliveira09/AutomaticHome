package org.example.commands;

import org.example.commands.Command;
import org.example.devices.SoundSystem;

public class PlayMusicCommand implements Command {
    private SoundSystem soundSystem;

    public PlayMusicCommand(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    public void execute() {
        soundSystem.playMusic();
    }
}
