package uz.pdp.bot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import static uz.pdp.Utils.buttons;

public class BotService {
    public SendMessage mainButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, "Base Button Menu");
        sendMessage.setReplyMarkup(buttons.baseButton());
        return sendMessage;
    }

    public SendMessage maruzalarButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, " Maruzalar Button Menu");
        sendMessage.setReplyMarkup(buttons.maruzalarButton());
        return sendMessage;
    }

    public SendMessage kinolarButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, " Kinolar Menu");
        sendMessage.setReplyMarkup(buttons.kinolarButton());
        return sendMessage;
    }
    public SendMessage audioKitoblarButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, " Audio kitoblar Menu");
        sendMessage.setReplyMarkup(buttons.audioKitoblarButton());
        return sendMessage;
    }

    public SendMessage nashidalarButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, " Nashidalar Menu");
        sendMessage.setReplyMarkup(buttons.nashidalarButton());
        return sendMessage;
    }


    public SendMessage firstButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, "Choose ");
        sendMessage.setReplyMarkup(buttons.firstButton());
        return sendMessage;
    }

    public SendMessage secondButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, "Choose ");
        sendMessage.setReplyMarkup(buttons.secondButton());
        return sendMessage;
    }

    public SendMessage thirdButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, "Choose ");
        sendMessage.setReplyMarkup(buttons.thirdButton());
        return sendMessage;
    }

    public SendMessage fourthButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, "Choose ");
        sendMessage.setReplyMarkup(buttons.fourthButton());
        return sendMessage;
    }


    public SendMessage tenButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, "Choose ");
        sendMessage.setReplyMarkup(buttons.tenButton());
        return sendMessage;
    }
    public SendMessage saodatAsriButtonMenu(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, "Choose ");
        sendMessage.setReplyMarkup(buttons.saodatAsriButton());
        return sendMessage;
    }



}
