package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AppUserServiceTest {

    @Mock
    private Database database;

    private AppUser appUser;
    private AppUserService appUserService;

    @BeforeEach()
    public void startUp() {
        appUser = new AppUser("Ankan", "1234");
    }

    @Test
    public void loginUser_correctUsernameAndPassword_shouldLogin() {
        //Given
        appUserService = new AppUserService(database);
        //When
        when(database.getUserByUsername(appUser.getUsername())).thenReturn(appUser);
        boolean result = appUserService.login(appUser.getUsername(), appUser.getPassword());
        //Then
        assertTrue(result);
    }

    @Test
    public void loginUser_wrongUsernameAndPassword_shouldThrowException() {
        //Given
        appUserService = new AppUserService(database);
        AppUser newAppUser = new AppUser("Tony", "123");

        //When
        when(database.getUserByUsername(newAppUser.getUsername())).thenReturn(newAppUser);

        //Then
        IllegalArgumentException error= assertThrows(IllegalArgumentException.class, ()->appUserService.login("Tony", "pass"));
        assertEquals("Either username or password was wrong",error.getMessage() );

    }
}
