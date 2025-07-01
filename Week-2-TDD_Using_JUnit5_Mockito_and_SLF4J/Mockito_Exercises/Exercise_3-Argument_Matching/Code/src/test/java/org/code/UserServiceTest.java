package org.code;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserServiceTest {
    @Test
    public void testArgumentMatching(){
        UserService mockService = mock(UserService.class);
        mockService.registerUser("Srijita123","test@gmail.com");

        verify(mockService).registerUser(eq("Srijita123"), contains("test@gmail.com"));
        verify(mockService, times(1)).registerUser(anyString(), anyString());
    }
}
