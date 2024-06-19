package com.vti.service;



import com.vti.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findEmployeeByProjectId(int projectId);

    List<User> findManager();

    User findManagerByEmailAndPassword(String email, String password);
}