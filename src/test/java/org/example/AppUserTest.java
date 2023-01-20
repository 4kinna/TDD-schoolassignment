package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppUserTest {
    private AppUser appUser;

    @BeforeEach
    public void startUp() {
        appUser = new AppUser("Ankan", "1234");
    }

    @Test
    public void compareUsername_sameUsername_returnUsername() {
        //Given
//        appUser=new AppUser("Ankan", "1234");

        //When
        String username = appUser.getUsername();

        //Then
        assertEquals("Ankan", username);
    }

    @Test
    public void compareUserData_ifSameUser_returnUser() {
        //Given

        //When
        String username = appUser.getUsername();
        String password = appUser.getPassword();

        //Then
        assertAll(
                () -> assertNotNull(appUser),
                () -> assertEquals("Ankan", username),
                () -> assertEquals("1234", password),
                () -> assertEquals(new AppUser("Ankan", "1234"), appUser));

    }

}
