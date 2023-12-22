package uz.pdp.bot;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.*;
import uz.pdp.Utils;
import uz.pdp.model.User;
import uz.pdp.model.UserState;
import java.util.logging.Level;
import static uz.pdp.Utils.*;
public class IlmBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "t.me/listening_ilm_bot";
    }
    @Override
    public String getBotToken() {
        return "6190904345:AAGz_WksheER-RPiL__ZNKN6rGHHexEA4OY";
    }
    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        Long chatId = message.getChatId();
        String text = message.getText();
        User currentUser = userService.getByChatId(chatId);
        UserState userState = UserState.START;
        if (currentUser != null) {
            userState = currentUser.getState();
            switch (userState){
                case REGISTERED, MAIN_MENU,MARUZALAR,KINOLAR, AUDIO_KITOBLAR, NASHIDALAR,ASMAUL_HUSNA,NAFSNI_POKLASH,
                        QISQA_DARSLIKLAR, SIYRAT_DARSLARI, UMAR_IBN_HATTOB_SERIALI, IZZAT_SHUKUROV, SAMI_YUSUF,
                        MAHER_ZAIN, AHMED_BUKHATIR, SAODAT_ASRI_QISSALARI, ALOQA-> {
                    switch (text) {
                        case "Ma'ruzalar 🎙️" ->{
                            userService.updateState(chatId, UserState.MARUZALAR);
                            userState = UserState.MARUZALAR;
                        }

                        case "Nashidalar 🎵️" ->{
                            userService.updateState(chatId, UserState.NASHIDALAR);
                            userState = UserState.NASHIDALAR;
                        }
                        case "Audio kitoblar \uD83C\uDFA7\uD83D\uDCDA" ->{
                            userService.updateState(chatId, UserState.AUDIO_KITOBLAR);
                            userState = UserState.AUDIO_KITOBLAR;
                        }
                        case "Kinolar \uD83D\uDCFA" -> {
                            userService.updateState(chatId, UserState.KINOLAR);
                            userState = UserState.KINOLAR;
                        }
                        case "\uD83D\uDCE9 Biz bilan bog'lanish" -> {
                            userService.updateState(chatId, UserState.ALOQA);
                            userState = UserState.ALOQA;
                        }
                        case "Asma'ul Husna" -> {
                            userService.updateState(chatId, UserState.ASMAUL_HUSNA);
                            userState = UserState.ASMAUL_HUSNA;
                        }
                        case "Nafsni poklash" -> {
                            userService.updateState(chatId, UserState.NAFSNI_POKLASH);
                            userState = UserState.NAFSNI_POKLASH;
                        }
                        case "Qisqa darsliklar" -> {
                            userService.updateState(chatId, UserState.QISQA_DARSLIKLAR);
                            userState = UserState.QISQA_DARSLIKLAR;
                        }
                        case "Siyrat darslari" ->  {
                            userService.updateState(chatId, UserState.SIYRAT_DARSLARI);
                            userState = UserState.SIYRAT_DARSLARI;
                        }
                        case "Izzat Shukurov" ->{
                            userService.updateState(chatId, UserState.IZZAT_SHUKUROV);
                            userState = UserState.IZZAT_SHUKUROV;
                        }
                        case "Sami Yusuf" ->{
                            userService.updateState(chatId, UserState.SAMI_YUSUF);
                            userState = UserState.SAMI_YUSUF;
                        }
                        case "Maher Zain" ->{
                            userService.updateState(chatId, UserState.MAHER_ZAIN);
                            userState = UserState.MAHER_ZAIN;
                        }
                        case "Ahmed Bukhatir" ->{
                            userService.updateState(chatId, UserState.AHMED_BUKHATIR);
                            userState = UserState.AHMED_BUKHATIR;
                        }
                        case "Main Menu", "Go back" -> {
                            userService.updateState(chatId, UserState.MAIN_MENU);
                            userState = UserState.MAIN_MENU;
                        }
                        case "1-15" -> {
                            userService.updateState(chatId, UserState.FIRST);
                            userState = UserState.FIRST;
                        }
                        case "16-30"->{
                            userService.updateState(chatId, UserState.SECOND);
                            userState = UserState.SECOND;
                        }
                        case "31-45"->{
                            userService.updateState(chatId, UserState.THIRD);
                            userState = UserState.THIRD;
                        }
                        case "46-60"->{
                            userService.updateState(chatId, UserState.FOURTH);
                            userState = UserState.FOURTH;
                        }
                        case "GO BACK" -> {
                            userService.back(chatId, userState);
                            UserState userState1 = userService.backUser(chatId, userState);
                            userState = userState1;
                        }
                        case "1. Nafsni poklash" -> {
                            userService.updateState(chatId, UserState.NAFSNI_POKLASH_1);
                            userState = UserState.NAFSNI_POKLASH_1;
                        }
                        case "2. Nafsni poklash" -> {
                            userService.updateState(chatId, UserState.NAFSNI_POKLASH_2);
                            userState = UserState.NAFSNI_POKLASH_2;
                        }
                        case "1-10 darsliklar" -> {
                            userService.updateState(chatId, UserState.QISQA_DARSLIKLAR_1);
                            userState = UserState.QISQA_DARSLIKLAR_1;
                        }
                        case "11-20 darsliklar" -> {
                            userService.updateState(chatId, UserState.QISQA_DARSLIKLAR_2);
                            userState = UserState.QISQA_DARSLIKLAR_2;
                        }
                       case  "Siyrat 1-15" ->{
                            userService.updateState(chatId, UserState.SIYRAT_1_15);
                           userState = UserState.SIYRAT_1_15;
                       }
                        case  "Siyrat 16-30" -> {
                            userService.updateState(chatId, UserState.SIYRAT_16_30);
                            userState = UserState.SIYRAT_16_30;
                        }
                        case  "Siyrat 31-45" -> {
                            userService.updateState(chatId, UserState.SIYRAT_31_45);
                            userState = UserState.SIYRAT_31_45;
                        }
                        case  "Siyrat 46-60" -> {
                            userService.updateState(chatId, UserState.SIYRAT_46_60);
                            userState = UserState.SIYRAT_46_60;
                        }
                        case  "Siyrat 61-63 😥" -> {
                            userService.updateState(chatId, UserState.SIYRAT_61_63);
                            userState = UserState.SIYRAT_61_63;
                        }
                        case "Umar Ibn Hattob" ->{
                            userService.updateState(chatId, UserState.UMAR_IBN_HATTOB_SERIALI);
                            userState = UserState.UMAR_IBN_HATTOB_SERIALI;
                        }

                        case "(1-10) qismlar" ->{
                            userService.updateState(chatId, UserState.UMAR_IBN_HATTOB_SERIALI_1);
                            userState = UserState.UMAR_IBN_HATTOB_SERIALI_1;
                        }
                        case "(11-20) qismlar" ->{
                            userService.updateState(chatId, UserState.UMAR_IBN_HATTOB_SERIALI_2);
                            userState = UserState.UMAR_IBN_HATTOB_SERIALI_2;
                        }
                        case "(21-30) qismlar" ->{
                            userService.updateState(chatId, UserState.UMAR_IBN_HATTOB_SERIALI_3);
                            userState = UserState.UMAR_IBN_HATTOB_SERIALI_3;
                        }

                        case "Saodat asri qissalari" ->{
                            userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI);
                            userState = UserState.SAODAT_ASRI_QISSALARI;
                        }
                        case "(1-25) qismlar" ->{
                            userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI_1_25);
                            userState = UserState.SAODAT_ASRI_QISSALARI_1_25;
                        }case "(26-50) qismlar" ->{
                            userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI_26_50);
                            userState = UserState.SAODAT_ASRI_QISSALARI_26_50;
                        }case "(51-75) qismlar" ->{
                            userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI_51_75);
                            userState = UserState.SAODAT_ASRI_QISSALARI_51_75;
                        }case "(76-100) qismlar" ->{
                            userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI_76_100);
                            userState = UserState.SAODAT_ASRI_QISSALARI_76_100;
                        }case "(101-125) qismlar" ->{
                            userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI_101_125);
                            userState = UserState.SAODAT_ASRI_QISSALARI_101_125;
                        }case "(126-150) qismlar" ->{
                            userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI_126_150);
                            userState = UserState.SAODAT_ASRI_QISSALARI_126_150;
                        }case "(151-175) qismlar" ->{
                            userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI_151_175);
                            userState = UserState.SAODAT_ASRI_QISSALARI_151_175;
                        }case "(176-200) qismlar" ->{
                            userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI_176_200);
                            userState = UserState.SAODAT_ASRI_QISSALARI_176_200;
                        }case "(201-204) qismlar" ->{
                            userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI_201_204);
                            userState = UserState.SAODAT_ASRI_QISSALARI_201_204;
                        }
                    }
                }
            }

            } else if(message.hasContact()) {
            Contact contact = message.getContact();
            User user = User.builder()
                    .chatId(chatId)
                    .firstName(contact.getFirstName())
                    .lastName(contact.getLastName())
                    .phoneNumber(contact.getPhoneNumber())
                    .state(UserState.REGISTERED)
                    .build();
            userService.add(user);
            userState = UserState.REGISTERED;
        }


        switch (userState) {
            case START -> {
                execute(buttons.register(chatId.toString()));
                userState = UserState.START;
            }
            case REGISTERED, MAIN_MENU ->  {
                execute(botService.mainButtonMenu(chatId.toString()));
                userState = UserState.MAIN_MENU;
            }
            case MARUZALAR -> {
                execute(botService.maruzalarButtonMenu(chatId.toString()));
            }
            case KINOLAR -> {
                execute(botService.kinolarButtonMenu((chatId.toString())));
                userState = UserState.KINOLAR;
            } case AUDIO_KITOBLAR -> {
                execute(botService.audioKitoblarButtonMenu((chatId.toString())));
                userState = UserState.AUDIO_KITOBLAR;
            }
            case NASHIDALAR -> {
                execute(botService.nashidalarButtonMenu((chatId.toString())));
                userState = UserState.NASHIDALAR;
            }
            case SAODAT_ASRI_QISSALARI -> {
                execute(botService.saodatAsriButtonMenu(chatId.toString()));
                userState = UserState.SAODAT_ASRI_QISSALARI;
            }

            case SAODAT_ASRI_QISSALARI_1_25 -> {
                for (int i = 2; i <=26; i++) {
                    execute(sendService.saodatAsri(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI);
            }
            case SAODAT_ASRI_QISSALARI_26_50 -> {
                for (int i = 27; i <=51; i++) {
                    execute(sendService.saodatAsri(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI);
            }
            case SAODAT_ASRI_QISSALARI_51_75 -> {
                for (int i = 52; i <=76; i++) {
                    execute(sendService.saodatAsri(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI);
            }
            case SAODAT_ASRI_QISSALARI_76_100 -> {
                for (int i = 77; i <=101; i++) {
                    execute(sendService.saodatAsri(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI);
            }
            case SAODAT_ASRI_QISSALARI_101_125 -> {
                for (int i = 102; i <=126; i++) {
                    execute(sendService.saodatAsri(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI);
            }
            case SAODAT_ASRI_QISSALARI_126_150 -> {
                for (int i = 127; i <=151; i++) {
                    execute(sendService.saodatAsri(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI);
            }
            case SAODAT_ASRI_QISSALARI_151_175 -> {
                for (int i = 152; i <=176; i++) {
                    execute(sendService.saodatAsri(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI);
            }
            case SAODAT_ASRI_QISSALARI_176_200 -> {
                for (int i = 177; i <=201; i++) {
                    execute(sendService.saodatAsri(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI);
            }
            case SAODAT_ASRI_QISSALARI_201_204 -> {
                for (int i = 202; i <=205; i++) {
                    execute(sendService.saodatAsri(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SAODAT_ASRI_QISSALARI);
            }
            case IZZAT_SHUKUROV -> {
                for (int i = 2; i <=9; i++) {
                    execute(sendService.izzat_shukurov(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.IZZAT_SHUKUROV);
            }
            case SAMI_YUSUF -> {
                for (int i = 2; i <=25; i++) {
                    execute(sendService.sami_yusuf(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SAMI_YUSUF);
            }

            case MAHER_ZAIN -> {
                for (int i = 2; i <=23; i++) {
                    execute(sendService.maher_zain(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.MAHER_ZAIN);
            }
            case AHMED_BUKHATIR -> {
                for (int i = 2; i <=14; i++) {
                    execute(sendService.ahmed_bukhatir(chatId.toString(),i));

                }
                userService.updateState(chatId, UserState.AHMED_BUKHATIR);
            }

            case UMAR_IBN_HATTOB_SERIALI -> {
                execute(botService.tenButtonMenu(chatId.toString()));
                userState = UserState.UMAR_IBN_HATTOB_SERIALI;
            }
            case ASMAUL_HUSNA -> {
                execute(botService.firstButtonMenu(chatId.toString()));
                userState = UserState.ASMAUL_HUSNA;
            }
            case FIRST -> {
                for (int i = 2; i <=16 ; i++) {
                    execute(sendService.asmaul_husna(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.ASMAUL_HUSNA);
            }
            case SECOND -> {
                for (int i = 17; i <=31 ; i++) {
                    execute(sendService.asmaul_husna(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.ASMAUL_HUSNA);
            }
            case THIRD -> {
                for (int i = 32; i <=46 ; i++) {
                    execute(sendService.asmaul_husna(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.ASMAUL_HUSNA);
            }
            case FOURTH -> {
                for (int i = 47; i <=61 ; i++) {
                    execute(sendService.asmaul_husna(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.ASMAUL_HUSNA);
            }
            case NAFSNI_POKLASH -> {
                execute(botService.secondButtonMenu(chatId.toString()));
                userState = UserState.NAFSNI_POKLASH;

                SendMessage sendMessage  =new SendMessage();
                sendMessage.setText(nafsniPoklashText);

                sendMessage.setChatId(chatId);
                execute(sendMessage);

            }
            case NAFSNI_POKLASH_1 -> {
                for (int i = 2; i <=9 ; i++) {
                execute(sendService.nafsniPoklash(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.NAFSNI_POKLASH);
            }

            case NAFSNI_POKLASH_2 -> {
                for (int i = 10; i<= 17; i++){
                    execute(sendService.nafsniPoklash(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.NAFSNI_POKLASH);
            }
            case QISQA_DARSLIKLAR -> {
                execute(botService.thirdButtonMenu(chatId.toString()));
                userState = UserState.QISQA_DARSLIKLAR;

                SendMessage sendMassage = new SendMessage();
                sendMassage.setText(qisqaDarsliklarText);
                sendMassage.setChatId(chatId);
                execute(sendMassage);
            }
            case QISQA_DARSLIKLAR_1 -> {
                for (int i = 2; i<= 11; i++){
                    execute(sendService.qisqaDarsliklar(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.QISQA_DARSLIKLAR);
            }
            case QISQA_DARSLIKLAR_2 -> {
                for (int i = 12; i<= 21; i++){
                    execute(sendService.qisqaDarsliklar(chatId.toString(),i));

                }
                userService.updateState(chatId, UserState.QISQA_DARSLIKLAR);
            }

            case SIYRAT_DARSLARI -> {
                execute(botService.fourthButtonMenu((chatId.toString())));
                userState = UserState.SIYRAT_DARSLARI;

                SendMessage sendMassage = new SendMessage();
                sendMassage.setText(siyratDarslariText);
                sendMassage.setChatId(chatId);
                execute(sendMassage);

            }
            case SIYRAT_1_15 -> {
                for (int i = 2; i <=16 ; i++) {
                    execute(sendService.siyrat(chatId.toString(),i));

                }
                userService.updateState(chatId, UserState.SIYRAT_DARSLARI);
            }

            case SIYRAT_16_30 -> {
                for (int i = 17; i <=31 ; i++) {
                    execute(sendService.siyrat(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SIYRAT_DARSLARI);
            }
            case SIYRAT_31_45 -> {
                for (int i = 32; i <=46 ; i++) {
                    execute(sendService.siyrat(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SIYRAT_DARSLARI);
            }
            case SIYRAT_46_60 -> {
                for (int i = 47; i <=61 ; i++) {
                    execute(sendService.siyrat(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SIYRAT_DARSLARI);
            }

            case SIYRAT_61_63 -> {
                for (int i = 62; i <=64 ; i++) {
                    execute(sendService.siyrat(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.SIYRAT_DARSLARI);
                SendMessage sendMessage = new SendMessage();
                sendMessage.setText("Eey barakalloh.  Siyrat darslari ham o'z nihoyasiga yetdi. Alloh manfaatli qilsin, barchamizni Rosulimizga muhabbatli qilsin🤲🏻\n" + "Ilm olishda davom eting!");
                sendMessage.setChatId(chatId);
                execute(sendMessage);
            }

            case UMAR_IBN_HATTOB_SERIALI_1 -> {
                for (int i = 2; i <=11 ; i++) {
                    execute(sendService.umarIbnHattob(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.UMAR_IBN_HATTOB_SERIALI);
            }
            case UMAR_IBN_HATTOB_SERIALI_2 -> {
                for (int i = 12; i <=21 ; i++) {
                    execute(sendService.umarIbnHattob(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.UMAR_IBN_HATTOB_SERIALI);
            }
            case UMAR_IBN_HATTOB_SERIALI_3 -> {
                for (int i = 22; i <=31 ; i++) {
                    execute(sendService.umarIbnHattob(chatId.toString(),i));
                }
                userService.updateState(chatId, UserState.UMAR_IBN_HATTOB_SERIALI);
            }

            case ALOQA -> {
                userState = UserState.ALOQA;
                SendMessage sendMessage  =new SendMessage();
                sendMessage.setText(aloqaText);
                sendMessage.setChatId(chatId);
                execute(sendMessage);
            }

        }


        //Logger
        Chat chat = message.getChat();
        String userPhoneNumber = message.getContact().getPhoneNumber();
        System.out.println("chat.getFirstName() = " + chat.getFirstName());
        System.out.println("chat.getUserName() = " + chat.getUserName());
        System.out.println("chat.getId() = " + chat.getId());
        System.out.println("userPhoneNumber = " + userPhoneNumber);

         Utils.logger.log(Level.INFO,chat.getFirstName()+" entered , message " + text);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(text);
        sendMessage.setChatId(chatId.toString());
        execute(sendMessage);

    }


}


