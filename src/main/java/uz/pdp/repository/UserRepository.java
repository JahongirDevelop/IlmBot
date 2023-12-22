package uz.pdp.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import uz.pdp.model.User;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class UserRepository {
    static String userPath = "D:\\Users\\HP\\java G23\\IlmBot\\src\\main\\resources\\users.json";
    static ObjectMapper objectMapper = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT)
            .enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)
            .enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
    public ArrayList<User> usersReadFromFile() {
        try {
            return objectMapper.readValue(new File(userPath), new TypeReference<ArrayList<User>>() {});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void usersWriteToFile(ArrayList<User> users) {
        try {
            objectMapper.writeValue(new File(userPath), users);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
