package com.example.examplemod.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;

import java.util.List;

public class ExampleCommand extends CommandBase {

    @Override
    public String getCommandName() {
        return "examplecommand";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/" + this.getCommandName();
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true; // return true otherwise you won't be able to use the command
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        // this code here runs when you use the command ingame
        sender.addChatMessage(new ChatComponentText("Hey your command is running!"));

        if (args.length > 0 && args[0].equalsIgnoreCase("option1")) {

            sender.addChatMessage(new ChatComponentText("Running option1!"));

        } else if (args.length > 0 && args[0].equalsIgnoreCase("option2")) {

            sender.addChatMessage(new ChatComponentText("Running option2!"));

        } else if (args.length > 0 && args[0].equalsIgnoreCase("option3")) {

            sender.addChatMessage(new ChatComponentText("Running option3!"));

        }

    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        // when you type the command and press tab complete,
        // this method will allow you to cycle through the words that match what you typed
        final String[] options = new String[]{"option1", "option2", "option3"};
        return getListOfStringsMatchingLastWord(args, options);
    }

}
