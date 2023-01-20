package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

public class AppUserServiceTest {

    private AppUser appUser;

    @BeforeEach()
    public void startUp() {
        appUser = new AppUser("Ankan", "1234");
    }

    @Test
    public void loginUser_correctUsernameAndPassword_shouldLogin() {
        //Given
        AppUserService appUserService = new AppUserService(appUser);
        //When
        boolean result = appUserService.login(appUser.getUsername(), appUser.getPassword());
        //Then
        assertTrue(result);
    }

}
