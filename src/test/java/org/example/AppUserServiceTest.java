package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppUserServiceTest {

    @Test
    public void loginUser_correctUsernameAndPassword_shouldLogin() {
        //Given
        AppUser appUser = new AppUser("Ankan", "1234");
        //When
        boolean result = AppUserService.login(appUser.getUsername(), appUser.getPassword());
        //Then
        assertTrue(result);

    }

}
