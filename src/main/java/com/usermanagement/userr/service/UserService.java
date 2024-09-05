package com.usermanagement.userr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanagement.userr.model.Userinfo;
import com.usermanagement.userr.repository.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public Userinfo addUserId(Userinfo user){
        return userRepo.save(user);   
    }

    public List<Userinfo> getAllUser()
    {
        return userRepo.findAll();
    }

    public Optional<Userinfo> getById(int id)
    {
        return userRepo.findById(id);
    }

    public Userinfo updateUser(Long id,Userinfo user)
    {
        return userRepo.save(user);
    }

    public void delete(int id)
    {
        userRepo.deleteById(id);
    }
}
