package com.pruebas;

import com.example.demo.service.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SmartPhoneServiceImplTest {

    @Test
    void count() {
        SmartPhoneServiceImpl sp = new SmartPhoneServiceImpl();
        assertNotNull(sp.count());
    }
}