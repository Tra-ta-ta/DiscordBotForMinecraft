package me.edinop0jek.discordbotforminecraft.DiscordBot;


import me.edinop0jek.discordbotforminecraft.DiscordBotForMinecraft;
import me.edinop0jek.discordbotforminecraft.Varibles;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.Server;

public class Bot {

    public static final Bot bot = new Bot();

    private JDA jda = JDABuilder.createDefault(Varibles.token).addEventListeners(new commands())
            .enableIntents(GatewayIntent.MESSAGE_CONTENT,GatewayIntent.GUILD_MEMBERS,GatewayIntent.GUILD_MESSAGES)
            .build();
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

    public void messageToMinecraft(String namePlayer, String msg){
        Server server = DiscordBotForMinecraft.instance.getServer();
        TextComponent text = Component.text().append(Component.text(namePlayer))
                .append(Component.text(": "))
                .append(Component.text(msg)).build();

        server.broadcast(text);
    }
}
