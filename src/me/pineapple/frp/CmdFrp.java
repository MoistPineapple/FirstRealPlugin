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
					player.sendMessage(ChatColor.DARK_RED + "[[" + ChatColor.GREEN + "FRP" + ChatColor.DARK_RED + "]]" + ChatColor.GOLD + "So far, this seems to be working. Good going.");
				}else if{
					if(args[0].equalsIgnoreCase("help")){
						player.sendMessage(ChatColor.DARK_GREEN + "=========" + ChatColor.GOLD + "FRP Commands" + ChatColor.DARK_GREEN + "=========");
						player.sendMessage(ChatColor.GREEN + "/frp test        " + ChatColor.AQUA + "Shows if your plugin works.");
						player.sendMessage(ChatColor.GREEN + "/frp help" + ChatColor.AQUA + "Shows you this exact menu.");
					}
					
				}else{
					player.sendMessage(ChatColor.DARK_RED + "[[" + ChatColor.GREEN + "FRP" + ChatColor.DARK_RED + "]]" + ChatColor.GOLD + "Seems like you messed up. Check /frp help for commands..");
				}
			}
			}
				}
		return false;
	}

}
