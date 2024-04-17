package com.pruebas;

import com.example.demo.service.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test de clase SmartPhoneServiceImplTest")
class SmartPhoneServiceImplTest {

    @Test
    @DisplayName("Test método count")
    void count() {
        SmartPhoneServiceImpl sp = new SmartPhoneServiceImpl();
        // assertNotNull(sp.count());
        // assertTrue(sp.count()>0);
        // assertEquals(3, sp.count());

        //assertEquals(2, sp.count());
        assertAll(() -> assertNotNull(sp.count()),
                () -> assertTrue(sp.count()>0),
                () -> assertEquals(3, sp.count()));

    }

    @DisplayName("Test método findOne")
    void findOne() {
        SmartPhoneServiceImpl sp = new SmartPhoneServiceImpl();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            sp.findOne(null);
        });
        assertEquals("El ID no puede ser nulo !", exception.getMessage());
    }

}