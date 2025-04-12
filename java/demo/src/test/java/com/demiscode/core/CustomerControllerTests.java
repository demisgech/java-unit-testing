package com.demiscode.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Customer Controller Tests")
public class CustomerControllerTests {

    private CustomerController controller;

    @BeforeEach
    public void setUp() {
        controller = new CustomerController();
    }

    @AfterEach
    public void tearDown() {
        controller = null;
    }

    @Test
    public void getCustomer_whenIdIsZero_thenReturnNotFound() {

        var result = controller.getCustomer(0);

        assertThat(result).isInstanceOf(NotFound.class);

    }

    @Test
    public void getCustomer_whenIdIsNotZero_thenReturnOk() {
        var result = controller.getCustomer(1);

        assertThat(result).isInstanceOf(Ok.class);
    }
}
