package me.shabubby.Testing;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public final Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;
	 @Override
	 public void onEnable(){
		 PluginDescriptionFile pdfFile = this.getDescription();
		 this.logger.info(pdfFile.getName() + " Has Been Enabled");
	 } 
	 @Override
		 public void onDisable() {
		 PluginDescriptionFile pdfFile = this.getDescription();
		 this.logger.info(pdfFile.getName() + " Has Been Disabled");
		 }
	
	 public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		 Player player = (Player) sender;
		 if(commandLabel.equalsIgnoreCase("talk")){
			 player.sendMessage(ChatColor.GOLD + "Ok Hi");
			 
		 }
		return false;
	 }
	 
	 
	 
	 }
	

