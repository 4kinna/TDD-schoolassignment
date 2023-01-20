package org.example;

public interface Database {

    public void createUser(AppUser appUser);

    public AppUser getUserByUsername(String username);

}
