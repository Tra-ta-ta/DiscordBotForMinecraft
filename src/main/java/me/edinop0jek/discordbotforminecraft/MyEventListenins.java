package me.edinop0jek.discordbotforminecraft;

import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;


public class MyEventListenins {

    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;

        TextChannel textChannel = event.getGuild().getTextChannelsByName("CHANNEL_NAME",true).get(0);
        textChannel.sendMessage("MESSAGE").queue();
    }
}
