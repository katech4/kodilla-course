package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(ints ={})
    public void shouldReturnUser(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {})
    public void shouldReturnEmail(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

}