package com.ead.authuser.services;

import com.ead.authuser.DTOs.UserDTO;
import com.ead.authuser.models.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface UserService {

    /*************************************************************************/

    List<UserModel> findAllUsers();

    Optional<UserModel> findById(UUID id);

    void delete(UserModel user);

    UserModel save(UserModel userModel);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    /*************************************************************************/

}
