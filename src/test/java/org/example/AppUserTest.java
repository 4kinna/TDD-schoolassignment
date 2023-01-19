package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppUserTest {


    @Test
    public void compareUsername_sameUsername_returnUsername(){
        //Given
        AppUser appUser;

        //When
        appUser=new AppUser("CrazyDoris", "1234");
        String username = appUser.getUsername();
        String password = appUser.getPassword();


        //Then
        assertEquals("CrazyDoris", username);
    }

}
