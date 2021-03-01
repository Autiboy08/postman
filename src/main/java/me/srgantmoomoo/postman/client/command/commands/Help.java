package me.srgantmoomoo.postman.client.command.commands;

import com.mojang.realmsclient.gui.ChatFormatting;

import me.srgantmoomoo.Main;
import me.srgantmoomoo.Reference;
import me.srgantmoomoo.postman.client.command.Command;
import me.srgantmoomoo.postman.client.module.ModuleManager;

public class Help extends Command {
	
	public Help() {
		super("help", "helps lol.", "bind <name> <key> | clear", "h");
	}

	@Override
	public void onCommand(String[] args, String command) {
		ModuleManager.addChatMessage(ChatFormatting.BOLD + Reference.NAME + " " + Reference.VERSION + "!");
		ModuleManager.addChatMessage("toggle" + " - toggles modules on and off" + " -> "  + Main.commandManager.prefix + "toggle <module>");
		ModuleManager.addChatMessage("bind" + " - allows you to set keybinds" + " -> " + Main.commandManager.prefix + "bind <module> <key>");
	}

}
