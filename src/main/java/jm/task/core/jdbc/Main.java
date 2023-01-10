package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Petrov", (byte) 22);
        userService.saveUser("Ivan", "Ivanov", (byte) 40);
        userService.saveUser("Harry", "Potter", (byte) 18);
        userService.saveUser("Andrey", "Arshavin", (byte) 35);
        userService.removeUserById(1l);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
