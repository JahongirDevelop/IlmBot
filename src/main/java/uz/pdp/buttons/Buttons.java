package uz.pdp.buttons;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import java.util.ArrayList;
import java.util.List;

public class Buttons {
    public SendMessage register(String chatId) {
        SendMessage sendMessage = new SendMessage(
                chatId, "Please share your number"
        );
        sendMessage.setReplyMarkup(shareContact());
        return sendMessage;
    }

    public ReplyKeyboardMarkup shareContact() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton("Share number");

        button.setRequestContact(true);
        row.add(button);

        replyKeyboardMarkup.setKeyboard(List.of(row));
        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup baseButton(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add("Ma'ruzalar 🎙️");
        row.add("Nashidalar 🎵️");
        rows.add(row);

        row = new KeyboardRow();
        row.add("Audio kitoblar \uD83C\uDFA7\uD83D\uDCDA");
        row.add("Kinolar \uD83D\uDCFA");
        rows.add(row);

        row = new KeyboardRow();
        row.add("📩 Biz bilan bog'lanish");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup firstButton() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add("1-15");
        row.add("16-30");
        rows.add(row);

        row = new KeyboardRow();
        row.add("31-45");
        row.add("46-60");
        rows.add(row);

        row = new KeyboardRow();

        row.add("GO BACK");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup secondButton(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add("1. Nafsni poklash");
        row.add("2. Nafsni poklash");
        rows.add(row);

        row = new KeyboardRow();
        row.add("GO BACK");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup maruzalarButton() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add("Asma'ul Husna");
        row.add("Nafsni poklash");
        rows.add(row);

        row = new KeyboardRow();
        row.add("Qisqa darsliklar");
        row.add("Siyrat darslari ");
        rows.add(row);

        row = new KeyboardRow();
        row.add("Main Menu");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup kinolarButton(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add("Umar Ibn Hattob");
        rows.add(row);

        row = new KeyboardRow();
        row.add("Main Menu");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup audioKitoblarButton(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add("Saodat asri qissalari");
        rows.add(row);

        row = new KeyboardRow();
        row.add("Main Menu");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup nashidalarButton(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add("Sami Yusuf");
        row.add("Maher Zain");
        rows.add(row);

        row = new KeyboardRow();
        row.add("Izzat Shukurov");
        row.add("Ahmed Bukhatir");
        rows.add(row);

        row = new KeyboardRow();
        row.add("Main Menu");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }



    public ReplyKeyboardMarkup thirdButton(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add("1-10 darsliklar");
        row.add("11-20 darsliklar");
        rows.add(row);

        row = new KeyboardRow();
        row.add("GO BACK");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup fourthButton(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add("Siyrat 1-15");
        row.add("Siyrat 16-30");
        rows.add(row);

        row = new KeyboardRow();
        row.add("Siyrat 31-45");
        row.add("Siyrat 46-60");
        rows.add(row);


        row = new KeyboardRow();
        row.add("Siyrat 61-63 😥");
        row.add("GO BACK");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;

    }

    public ReplyKeyboardMarkup tenButton(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add("(1-10) qismlar");
        row.add("(11-20) qismlar");
        row.add("(21-30) qismlar");
        rows.add(row);

        row = new KeyboardRow();
        row.add("GO BACK");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup saodatAsriButton(){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add("(1-25) qismlar");
        row.add("(26-50) qismlar");
        rows.add(row);

        row = new KeyboardRow();
        row.add("(51-75) qismlar");
        row.add("(76-100) qismlar");
        rows.add(row);

        row = new KeyboardRow();
        row.add("(101-125) qismlar");
        row.add("(126-150) qismlar");
        rows.add(row);

        row = new KeyboardRow();
        row.add("(151-175) qismlar");
        row.add("(176-200) qismlar");
        rows.add(row);

        row = new KeyboardRow();
        row.add("(201-204) qismlar");
        row.add("GO BACK");
        rows.add(row);

        replyKeyboardMarkup.setKeyboard(rows);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboardRemove replyKeyboardRemove() {
        return new ReplyKeyboardRemove(true);

    }
}
