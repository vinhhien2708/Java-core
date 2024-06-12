package com.vti.entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Integer id;
    private String fullName;
    private String email;
    private String password;
    private Role role;
    private String proSkill;
    private Integer expInYear;

    public enum Role {
        EMPLOYEE, ADMIN
    }
}