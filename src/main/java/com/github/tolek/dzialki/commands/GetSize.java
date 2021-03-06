package com.github.tolek.dzialki.commands;

import com.github.tolek.dzialki.plot.Plot;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class GetSize implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!sender.isOp()) {
            return false;
        }
        sender.sendMessage("Max size: " + Plot.MAX_SIZE + " Max plots: " + Plot.MAX_PLOTS);
        return false;
    }

}
