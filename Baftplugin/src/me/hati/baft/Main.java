package me.hati.baft;

import org.bukkit.plugin.java.JavaPlugin;

import me.hati.baft.commands.BaftCommand;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
		new BaftCommand(this);
		super.onEnable();
	}
	
}
