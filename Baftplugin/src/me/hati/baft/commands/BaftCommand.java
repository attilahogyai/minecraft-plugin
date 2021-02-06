package me.hati.baft.commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import me.hati.baft.Main;

public class BaftCommand implements CommandExecutor{
	private Main plugin;
	
	public BaftCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("creepspawn").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg3) {
		Player p = (Player) sender;
		Location loc = p.getLocation();
		World world = p.getWorld();
		for(int i = 0; i < 5; i++) {
			world.spawnEntity(loc, EntityType.CREEPER);
		}
			
		return false;
	}

}
