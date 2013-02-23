package me.pineapple.frp;

import org.bukkit.plugin.java.JavaPlugin;

public class FirstRealPlugin extends JavaPlugin {
	
	public void onEnable() {
		
		this.getCommand("frp").setExecutor(new CmdFrp());
		
		this.getServer().getPluginManager().registerEvents(new FrpListener(), this);
		
		System.out.println("[[FRP]] by Pastor Pineapple v" + getDescription().getVersion()+ " is now enabled!");
	
	}

	public void onDisable() {
		System.out.println("[[FRP]] by Pastor Pineapple is now disabled!");
	}
}
