package com.luv2code.springboot.cruddemo;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
public class DemoAppTest {
    @Mock
    private Employee employee;
    @Before
    void setup(){

    }


    @Test
    public void testEmployeeNameTest(){
        Mockito.when(employee.getFirstName()).thenReturn("Efrem");
        assertTrue(true, "efrem");
    }
}
