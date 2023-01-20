package org.example;

import java.util.Objects;

public class AppUserService {
    private Database database;

    public AppUserService(Database database) {
       this.database=database;
    }

    public boolean login(String username, String password)  {
        AppUser requesterAppUser=  database.getUserByUsername(username);

        if(!Objects.equals(requesterAppUser.getPassword(), password) || !Objects.equals(requesterAppUser.getUsername(), username)){
            throw new IllegalArgumentException("Either username or password was wrong");
        }

        return Objects.equals(requesterAppUser.getPassword(), password);
    }
}
