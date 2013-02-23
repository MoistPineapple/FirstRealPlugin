package me.pineapple.frp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdFrp implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if(sender instanceof Player){
			Player player = (Player) sender;
			if(player.hasPermission("frp.admin") || player.hasPermission("frp.*") || player.isOp()){
				if(args[0].equalsIgnoreCase("test")){
					player.sendMessage(ChatColor.);
				}
			}
				}
		return false;
	}

}
