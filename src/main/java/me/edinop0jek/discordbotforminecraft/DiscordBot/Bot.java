package me.edinop0jek.discordbotforminecraft.DiscordBot;


import me.edinop0jek.discordbotforminecraft.DiscordBotForMinecraft;
import me.edinop0jek.discordbotforminecraft.Varibles;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

public class Bot {

    public static final Bot bot = new Bot();

    private JDA jda = JDABuilder.createDefault(Varibles.token).build();
    private Guild guild;
    private TextChannel textChannel;

    private Bot(){
        try{
            jda.awaitReady();
        }catch (InterruptedException ignored) {}

        guild = jda.getGuildById(DiscordBotForMinecraft.instance.getConfig().getLong("guild_id"));
    }

    public void messageToDiscord(String namePlayer, String msg){
        textChannel = jda.getTextChannelById(DiscordBotForMinecraft.instance.getConfig().getLong("sync_text_id"));
        assert textChannel != null;
        textChannel.sendMessage("<"+namePlayer+">"+": "+msg).queue();
    }

}
