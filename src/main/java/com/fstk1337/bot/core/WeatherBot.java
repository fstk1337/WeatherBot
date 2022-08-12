package com.fstk1337.bot.core;

import com.fstk1337.bot.util.PropertiesLoader;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.BotOptions;
import org.telegram.telegrambots.meta.generics.LongPollingBot;

public class WeatherBot implements LongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public BotOptions getOptions() {
        return new DefaultBotOptions();
    }

    @Override
    public void clearWebhook() throws TelegramApiRequestException {

    }

    @Override
    public String getBotUsername() {
        return PropertiesLoader.getProperty("telegram.bot.username");
    }

    @Override
    public String getBotToken() {
        return PropertiesLoader.getProperty("telegram.bot.api.token");
    }
}
