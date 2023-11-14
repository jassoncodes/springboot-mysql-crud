package com.api.crud.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    /**
     * Lists users
     * 
     * @return Users array list
     */
    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) this.userRepository.findAll();
    }

    /**
     * List user by Id
     * 
     * @param id
     * @return user data
     */
    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }

    /**
     * Save user
     * 
     * @param user
     * @return
     */
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    /**
     * Update user data
     * 
     * @param request user data to update
     * @param id      user to update
     * @return user data updated
     */
    public UserModel updateUserById(UserModel request, Long id) {
        UserModel user = userRepository.findById(id).get();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());

        return user;
    }

    public Boolean deleteUserById(Long Id) {
        try {
            userRepository.deleteById(Id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
