package com.raus.petTeleport;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		// Listeners
		getServer().getPluginManager().registerEvents(new UnloadListener(), this);
	}

	@Override
	public void onDisable()
	{

	}
}