package com.ead.authuser.services.impl;

import com.ead.authuser.repository.UserRepository;
import com.ead.authuser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    /*************************************************************************/
    private final UserRepository userRepository;

    public UserServiceImpl(0UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    /*************************************************************************/
    /*
        // injecao de dependencia \\
        @Autowired
        UserRepository userRepositor
    */
    /*************************************************************************/

}
