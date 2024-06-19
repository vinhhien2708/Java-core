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
    public List<User> findEmployeeByProjectId(int projectId) {
        try {
            return repository.findEmployeeByProjectId(projectId);
        } catch (SQLException | IOException exception) {
            return List.of();
        }
    }

    @Override
    public List<User> findManager() {
        try {
            return repository.findManager();
        } catch (SQLException | IOException exception) {
            return List.of();
        }
    }

    @Override
    public User findManagerByEmailAndPassword(String email, String password) {
        try {
            return repository.findManagerByEmailAndPassword(email, password);
        } catch (SQLException | IOException exception) {
            return null;
        }
    }
}