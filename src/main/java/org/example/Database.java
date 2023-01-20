package org.example;

public interface Database {

    public void createUser(AppUser appUser);

    public void getUserByUsername(String username);

}
