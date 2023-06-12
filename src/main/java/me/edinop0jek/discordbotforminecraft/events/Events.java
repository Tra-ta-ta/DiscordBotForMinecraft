package me.edinop0jek.discordbotforminecraft.events;



import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;


public class Events implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) throws InterruptedException {

        String msg = event.getMessage();
        event.getPlayer().sendMessage(msg);



    }

}
