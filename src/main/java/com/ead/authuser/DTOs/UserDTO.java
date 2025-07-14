package com.ead.authuser.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    public interface IUserView {
        public static interface Registration{}
        public static interface userPut {}
        public static interface PasswordPut {}
        public static interface ImagePut {}
    }
    /*************************************************************************/

    private UUID userId;
    private String username;
    private String email;
    private String password;
    private String oldPassword;
    private String fullName;
    private String phoneNumber;
    private String cpf;
    private String imageUrl;

    /*************************************************************************/

}
