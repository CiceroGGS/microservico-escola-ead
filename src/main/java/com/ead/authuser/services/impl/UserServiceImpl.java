package com.ead.authuser.services.impl;

import com.ead.authuser.models.UserModel;
import com.ead.authuser.repository.UserRepository;
import com.ead.authuser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    /*************************************************************************/
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    /*************************************************************************/
    /*
        // injecao de dependencia \\
        @Autowired
        UserRepository userRepositor
    */
    /*************************************************************************/

    @Override
    public List<UserModel> findAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public Optional<UserModel> findById(UUID id)  {
        return userRepository.findById(id);
    }

    @Override
    public void delete(UserModel user) {
        userRepository.delete(user);
    }
}
