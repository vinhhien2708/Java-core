package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService service;

    public List<User> findEmployeeByProjectId(int projectId) {
        return service.findEmployeeByProjectId(projectId);
    }

    public List<User> findManager() {
        return service.findManager();
    }

    /**
     * @param email Email của manager
     * @param password Mật khẩu của manager
     * @return Thông tin manager tương ứng với email và password,
     * hoặc null nếu đăng nhập thất bại
     */
    public User findManagerByEmailAndPassword(String email, String password) {
        return service.findManagerByEmailAndPassword(email, password);
    }
}