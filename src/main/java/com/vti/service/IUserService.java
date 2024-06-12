package com.vti.service;



import com.vti.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(int id);

    User findByEmailAndPassword(String email, String password);

    int create(String fullName, String email);

    int deleteById(int id);
}