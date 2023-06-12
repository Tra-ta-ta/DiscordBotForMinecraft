package me.edinop0jek.discordbotforminecraft.MinecraftEvent;

import io.papermc.paper.event.player.AsyncChatEvent;
import me.edinop0jek.discordbotforminecraft.DiscordBot.Bot;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;


public class ChatEvent implements Listener {
    @EventHandler
    public void onChat(AsyncChatEvent event){

        Player player = event.getPlayer();
        String namePlayer = player.getName();

        TextComponent msg = (TextComponent) event.message();

        Bot.bot.messageToDiscord(namePlayer, msg.content());

    }
}
