package org.example;

public class AppUserService {
    private Database database;

    public AppUserService(Database database) {
       this.database=database;
    }

    public boolean login(String username, String password)  {

        return false;
        //appUser.getUsername().equals(username) && appUser.getPassword().equals(password);
    }
}
