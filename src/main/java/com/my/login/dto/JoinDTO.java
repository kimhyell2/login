package com.my.login.dto;

import com.my.login.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JoinDTO {
    private Long user_id;
    private String user_email;
    private String user_password;
    private String user_name;
    private String user_phone;
    private String user_address;

    // Entity -> Dto
    public static JoinDTO fromEntity(UserEntity user) {
        return new JoinDTO(
                user.getUser_id(),
                user.getUser_email(),
                user.getUser_password(),
                user.getUser_name(),
                user.getUser_phone(),
                user.getUser_address()
        );
    }

}
