package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Stepan", "Razin", (byte) 18);
        userService.saveUser("Victor", "Petrov", (byte) 17);
        userService.saveUser("Oleg", "Reznik", (byte) 27);
        userService.saveUser("Vladimir", "Lenin", (byte) 99);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }

    void logger(User user){

    }
}
