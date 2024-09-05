package com.usermanagement.userr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagement.userr.model.Userinfo;

public interface UserRepo extends JpaRepository<Userinfo,Integer>{

}
