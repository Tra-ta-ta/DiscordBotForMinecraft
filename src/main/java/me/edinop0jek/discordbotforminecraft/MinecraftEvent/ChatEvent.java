package me.edinop0jek.discordbotforminecraft.MinecraftEvent;

import io.papermc.paper.event.player.AsyncChatEvent;
import me.edinop0jek.discordbotforminecraft.DiscordBot.Bot;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;


public class ChatEvent implements Listener {
    @EventHandler
    public void onChat(AsyncChatEvent event){

        Player player = event.getPlayer();
        String namePlayer = player.getName();

        TextComponent msg = (TextComponent) event.message();

        Bot.bot.messageToDiscord(namePlayer, msg.content());

    }

    @EventHandler
    public void onJoin(AsyncPlayerPreLoginEvent event){
        String namePlayer = event.getName();
        String msg = "присоединился к игре";
        AsyncPlayerPreLoginEvent.Result result = event.getLoginResult();
        if(String.valueOf(result).equals("ALLOWED")){
            Bot.bot.messageToDiscord(namePlayer, msg);
        }
    }

    @EventHandler
    public void onLeave(){

    }
}
