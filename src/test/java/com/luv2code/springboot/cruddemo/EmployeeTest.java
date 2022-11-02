package com.luv2code.springboot.cruddemo;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeTest {

    @Test
    void testEmployeeEmail(){
        Employee employee = new Employee();
        employee.setEmail("test@gmail.com");
        String email = employee.getEmail();
        String name = employee.getFirstName();
        assertEquals(email,"test@gmail.com", "Failed");
        assertNotEquals(email,"Test@gmail.com", "Failed");
        assertNotNull(email);
        assertNull(name);
    }
    @Test
    void testEmployeeName(){
        Employee employee = new Employee();
        employee.setEmail("test@gmail.com");
        String email = employee.getEmail();
        String name = employee.getFirstName();
        assertNull(name);
    }
}
