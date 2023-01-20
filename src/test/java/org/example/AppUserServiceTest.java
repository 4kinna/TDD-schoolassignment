package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
public class AppUserServiceTest {

    @Mock
    private Database database;

    private AppUser appUser;

    @BeforeEach()
    public void startUp() {
        appUser = new AppUser("Ankan", "1234");
        database.createUser(appUser);
    }

    @Test
    public void loginUser_correctUsernameAndPassword_shouldLogin() {
        //Given
        AppUserService appUserService = new AppUserService(database);
        //When
        boolean result = appUserService.login(appUser.getUsername(), appUser.getPassword());
        //Then
        assertTrue(result);
    }

}
