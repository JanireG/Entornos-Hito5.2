package com.pruebas;

import com.example.demo.service.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test de clase SmartPhoneServiceImplTest")
class SmartPhoneServiceImplTest {

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("Iniciando test");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("Finalizando test");
    }

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Iniciando todos los tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Finalizando todos los tests");
    }

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