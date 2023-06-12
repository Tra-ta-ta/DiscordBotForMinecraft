package me.edinop0jek.discordbotforminecraft;


import me.edinop0jek.discordbotforminecraft.MinecraftEvent.ChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
import me.edinop0jek.discordbotforminecraft.DiscordBot.Bot;

public final class DiscordBotForMinecraft extends JavaPlugin{

    public static DiscordBotForMinecraft instance;
    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
        System.out.println(Bot.bot);
    }

    @Override
    public void onDisable() {

    }
}
