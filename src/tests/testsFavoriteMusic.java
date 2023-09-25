package tests;
import model.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testsFavoriteMusic {
    User user;
    Music music;
    @BeforeEach
    void setup(){
        user = new User("Luca","123");
        music = new Music("We are the world");
    }

    @Test
    void testFavoritarComSucesso(){
        boolean result = user.favouriteMusic(music);
        assertEquals(true,result);
    }
}
