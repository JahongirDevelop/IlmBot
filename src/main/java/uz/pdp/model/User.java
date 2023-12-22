package uz.pdp.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter

public class User {
    private Long chatId;
    private String firstName;
    private String lastName;
    private String username;
    private String phoneNumber;
    private UserState state;
}
