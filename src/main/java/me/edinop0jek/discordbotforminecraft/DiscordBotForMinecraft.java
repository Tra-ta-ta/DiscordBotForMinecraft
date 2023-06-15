package me.edinop0jek.discordbotforminecraft;


import me.edinop0jek.discordbotforminecraft.MinecraftEvent.Events;
import me.edinop0jek.discordbotforminecraft.DiscordBot.Bot;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordBotForMinecraft extends JavaPlugin{

    public static DiscordBotForMinecraft instance;
    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new Events(), this);
        System.out.println(Bot.bot);
    }

    @Override
    public void onDisable() {

    }
}
