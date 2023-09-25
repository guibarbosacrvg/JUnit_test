package tests;
import model.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;


class UserTest {
   @BeforeAll
    public static void before(){
       System.out.println("Iniciando casos tests User");
   }

   @Test
   void testUserExist(){
       User user = new User("Luca","123");
       assertEquals(true,user.verifyLogin("Luca","123"));
   }

}