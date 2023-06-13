package me.edinop0jek.discordbotforminecraft;


import io.papermc.paper.event.player.ChatEvent;
import me.edinop0jek.discordbotforminecraft.DiscordBot.Bot;
import me.edinop0jek.discordbotforminecraft.MinecraftEvent.ChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordBotForMinecraft extends JavaPlugin{

    public static DiscordBotForMinecraft instance;
    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new ChatEvent(),
                this);
        System.out.println(Bot.bot);
    }

    @Override
    public void onDisable() {

    }
}
