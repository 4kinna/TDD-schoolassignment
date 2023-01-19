package org.example;

public class AppUserService {
    private AppUser appUser;

    public AppUserService(AppUser appUser) {
        this.appUser=appUser;
    }

    public boolean login(String username, String password)  {
        return appUser.getUsername().equals(username) && appUser.getPassword().equals(password);
    }
}
