package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppUserTest {
private AppUser appUser;

@BeforeEach
public void startUp(){
    appUser=new AppUser("Ankan", "1234");
}

    @Test
    public void compareUsername_sameUsername_returnUsername(){
        //Given
//        appUser=new AppUser("Ankan", "1234");

        //When
        String username = appUser.getUsername();

        //Then
        assertEquals("Ankan", username);
    }

    //test för att gämföra två användare,
    @Test
    public void compareUserData_ifSameUser_returnUser(){
        //Given

        //When
        String username=null;
        String password=null;

        //Then
        assertAll(()->assertNotNull(appUser), ()->assertEquals("Annika",username),()->assertEquals("12345",password));
    }

}
