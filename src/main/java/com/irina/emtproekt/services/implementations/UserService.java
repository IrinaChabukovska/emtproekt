package com.irina.emtproekt.services.implementations;

import com.irina.emtproekt.models.User;
import com.irina.emtproekt.repositories.UserRepository;
import com.irina.emtproekt.services.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String addUser(User user) {
        if(userRepository.findByEmail(user.getEmail()).isPresent())
            return "EMAIL_TAKEN";
        userRepository.save(user);
        return "SUCCESS";
    }
}
