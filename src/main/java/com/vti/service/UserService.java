package com.vti.service;

import com.vti.entity.User;
import com.vti.repository.IUserRepository;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserService implements IUserService {
    private IUserRepository repository;

    @Override
    public List<User> findAll() {
        try {
            return repository.findAll();
        } catch (SQLException | IOException exception) {
            return List.of();
        }
    }

    @Override
    public User findById(int id) {
        try {
            return repository.findById(id);
        } catch (SQLException | IOException exception) {
            return null;
        }
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        try {
            return repository.findByEmailAndPassword(email, password);
        } catch (SQLException | IOException exception) {
            return null;
        }
    }

    @Override
    public int create(String fullName, String email) {
        try {
            return repository.create(fullName, email);
        } catch (SQLException | IOException e) {
            return 0;
        }
    }

    @Override
    public int deleteById(int id) {
        try {
            return repository.deleteById(id);
        } catch (SQLException | IOException e) {
            return 0;
        }
    }
}