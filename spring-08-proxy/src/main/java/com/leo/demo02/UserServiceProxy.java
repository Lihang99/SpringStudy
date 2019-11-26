package com.leo.demo02;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
    }

    @Override
    public void delete() {
        userService.delete();

    }

    @Override
    public void update() {
        userService.update();

    }

    @Override
    public void query() {
        userService.query();

    }
}
