package com.trs.timereporting.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trs.timereporting.domain.User;
import com.trs.timereporting.domain.repository.UserRepository;
import com.trs.timereporting.service.UserService;

/**
 * Created by williamzappasodi on 12/29/15.
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    public User create(User user) {
        return userRepository.create(user);
    }

    //public User read(String userId) {
    //      return userRepository.read(userId);
    // }

    // public void update(String userId, User user) {
    //    userRepository.update(userId, user);
    // }

    //public void delete(String userId) {
//        userRepository.delete(userId);

//    }


}
