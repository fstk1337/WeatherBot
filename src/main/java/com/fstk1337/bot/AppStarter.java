package com.fstk1337.bot;

import com.fstk1337.bot.core.WeatherBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class AppStarter {
    public static void main(String[] args) {
        TelegramBotsApi botsApi;
        try {
            botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new WeatherBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
