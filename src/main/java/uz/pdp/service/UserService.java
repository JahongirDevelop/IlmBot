package uz.pdp.service;
import uz.pdp.model.User;
import uz.pdp.model.UserState;
import java.util.ArrayList;
import java.util.Objects;
import static uz.pdp.Utils.userRepository;
import static uz.pdp.model.UserState.*;

public class UserService {
    public User getByChatId(Long chatId) {
        for (User user : userRepository.usersReadFromFile()) {
            if(Objects.equals(user.getChatId(), chatId)) {
                return user;
            }
        }
        return null;
    }

    public void add(User user) {
        ArrayList<User> users = userRepository.usersReadFromFile();
        users.add(user);
        userRepository.usersWriteToFile(users);
    }

    public void updateState(Long chatId, UserState userState) {
        ArrayList<User> users = userRepository.usersReadFromFile();
        for (User user : users) {
            if(Objects.equals(user.getChatId(), chatId)) {
                user.setState(userState);
                break;
            }
        }
        userRepository.usersWriteToFile(users);
    }
    public void back(Long chatId, UserState userState) {
         for (User u: userRepository.usersReadFromFile()){
            if (Objects.equals(u.getChatId(), chatId)){
                switch (userState){
                    case MARUZALAR, NASHIDALAR, AUDIO_KITOBLAR, KINOLAR -> updateState(chatId, MAIN_MENU);
                    case ASMAUL_HUSNA,SIYRAT_DARSLARI,QISQA_DARSLIKLAR,NAFSNI_POKLASH-> updateState(chatId, MARUZALAR);
                    case UMAR_IBN_HATTOB_SERIALI -> updateState(chatId, KINOLAR);
                    case SAMI_YUSUF, IZZAT_SHUKUROV, MAHER_ZAIN, AHMED_BUKHATIR -> updateState(chatId, NASHIDALAR);
                    case SAODAT_ASRI_QISSALARI -> updateState(chatId, AUDIO_KITOBLAR);

                }
            }
        }
    }
    public UserState backUser(Long chatId, UserState userState) {
        for (User u: userRepository.usersReadFromFile()){
            if (Objects.equals(u.getChatId(), chatId)){
                switch (userState){
                    case MARUZALAR, NASHIDALAR, AUDIO_KITOBLAR, KINOLAR -> {
                        return MAIN_MENU;
                    }
                    case ASMAUL_HUSNA,SIYRAT_DARSLARI,QISQA_DARSLIKLAR,NAFSNI_POKLASH -> {
                        return MARUZALAR;
                    }
                    case UMAR_IBN_HATTOB_SERIALI -> {
                        return KINOLAR;
                    }
                    case SAMI_YUSUF, IZZAT_SHUKUROV, MAHER_ZAIN, AHMED_BUKHATIR -> {
                        return NASHIDALAR;
                    }
                    case SAODAT_ASRI_QISSALARI -> {
                        return AUDIO_KITOBLAR;
                    }
                }
            }
        }
        return userState;
    }

}
