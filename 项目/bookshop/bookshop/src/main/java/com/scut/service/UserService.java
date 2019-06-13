package com.scut.service;

import com.scut.entity.User;

public interface UserService {

    boolean checkUser(User user);

    User get(int id);

    User getByStudentid(String studnetid);

}
