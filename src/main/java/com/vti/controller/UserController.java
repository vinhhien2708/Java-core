package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService service;

    /**
     * @return Danh sách user trong database
     * */
    public List<User> findAll() {
        return service.findAll();
    }

    /**
     * @param id Định danh của user
     * @return Thông tin user tương ứng với id, hoặc null nếu không tồn tại
     */
    public User findById(int id) {
        return service.findById(id);
    }

    /**
     * @param email Email của user
     * @param password Mật khẩu của user
     * @return Thông tin user tương ứng với email và password,
     * hoặc null nếu đăng nhập thất bại
     */
    public User findByEmailAndPassword(String email, String password) {
        return service.findByEmailAndPassword(email, password);
    }

    /**
     * Cách dùng:
     * <pre>{@code
     * controller.create("Nguyễn Văn Khoa", "khoa.nv@gmail.com")
     * }
     * @param fullName Họ và tên của user
     * @param email Email của user
     * @return Số bản ghi được tạo thành công
     */
    public int create(String fullName, String email) {
        return service.create(fullName, email);
    }

    public int deleteById(int id) {
        return service.deleteById(id);
    }
}