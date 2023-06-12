package me.edinop0jek.discordbotforminecraft.DiscordBot;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class commands extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Message msg = event.getMessage();
        TextChannel tc = event.getChannel().asTextChannel();

        if(!event.getAuthor().isBot()){
            if(msg.getContentRaw().equals("/list")){
                String list = null;
                for (Player p: Bukkit.getOnlinePlayers()){
                    list = p.getName() + " ";
                }
                if(list == null){
                    tc.sendMessage("Сейчас никого на сервере нет").queue();
                }else {
                    tc.sendMessage(list).queue();
                }
            }
        }
    }
}
