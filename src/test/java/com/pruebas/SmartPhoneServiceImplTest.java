package com.pruebas;

import com.example.demo.service.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SmartPhoneServiceImplTest {

    @Test
    void count() {
        SmartPhoneServiceImpl sp = new SmartPhoneServiceImpl();
        // assertNotNull(sp.count());
        // assertTrue(sp.count()>0);
        // assertEquals(3, sp.count());

        //assertEquals(2, sp.count());

    }

    void findOne() {
        SmartPhoneServiceImpl sp = new SmartPhoneServiceImpl();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            sp.findOne(null);
        });
        assertEquals("El ID no puede ser nulo !", exception.getMessage());
    }

}