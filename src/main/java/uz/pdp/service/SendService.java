package uz.pdp.service;

import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.objects.InputFile;

public class SendService {
    public SendAudio nafsniPoklash(String chatId, int i) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setAudio(new InputFile("https://t.me/bot_uchun_nafsni_poklash/" + i));
        sendAudio.setChatId(chatId);
        return sendAudio;
    }
    public SendAudio qisqaDarsliklar(String chatId, int i) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setAudio(new InputFile("https://t.me/bot_uchun_qisqa_darsliklar/" + i));
        sendAudio.setChatId(chatId);
        return sendAudio;
    }
    public SendAudio siyrat(String chatId, int i) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setAudio(new InputFile("https://t.me/bot_uchun_siyrat_darslari/" + i));
        sendAudio.setChatId(chatId);
        return sendAudio;
    }
    public SendAudio asmaul_husna(String chatId, int i) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setAudio(new InputFile("https://t.me/bot_uchun_asmaul_xusna/" + i));
        sendAudio.setChatId(chatId);
        return sendAudio;
    }
    public SendAudio umarIbnHattob(String chatId, int i) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setAudio(new InputFile("https://t.me/bot_uchun_kino/" + i));
        sendAudio.setChatId(chatId);
        return sendAudio;
    }
    public SendAudio izzat_shukurov(String chatId, int i) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setAudio(new InputFile("https://t.me/bot_uchun_izzat_shukurov/" + i));
        sendAudio.setChatId(chatId);
        return sendAudio;
    }
    public SendAudio sami_yusuf(String chatId, int i) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setAudio(new InputFile("https://t.me/bot_uchun_sami_yusuf/" + i));
        sendAudio.setChatId(chatId);
        return sendAudio;
    }
    public SendAudio maher_zain(String chatId, int i) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setAudio(new InputFile("https://t.me/bot_uchun_maher_zain/" + i));
        sendAudio.setChatId(chatId);
        return sendAudio;
    }
    public SendAudio ahmed_bukhatir(String chatId, int i) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setAudio(new InputFile("https://t.me/bot_uchun_ahmed_bukhatir/" + i));
        sendAudio.setChatId(chatId);
        return sendAudio;
    }
    public SendAudio saodatAsri(String chatId, int i) {
        SendAudio sendAudio = new SendAudio();
        sendAudio.setAudio(new InputFile("https://t.me/bot_uchun_saodat_asri_qissalari/" + i));
        sendAudio.setChatId(chatId);
        return sendAudio;
    }

}
