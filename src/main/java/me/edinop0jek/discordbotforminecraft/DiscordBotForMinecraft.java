package me.edinop0jek.discordbotforminecraft;


import me.edinop0jek.discordbotforminecraft.events.Events;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordBotForMinecraft extends JavaPlugin{

    @Override
    public void onEnable() {
        JDA jda = JDABuilder.createDefault("OTY0ODk2MjY0MTM3MzUxMTk4.GTDdl1.Y8HfPyy5bcl3ba4WcBr5GiSa5FnWAhLevIAfns")
                .build();

        Bukkit.getPluginManager().registerEvents(new Events(), this);

    }

    @Override
    public void onDisable() {

    }
}
