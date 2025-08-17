package com.namarahul.namarahulcollab.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.namarahul.namarahulcollab.dto.Response.EmployeeResponse;
import com.namarahul.namarahulcollab.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper; // for converting objects to JSON

    @MockitoBean
    private EmployeeService employeeService; // mocked service

    // ✅ 1. Test simple GET /test endpoint
    @Test
    void testEndpoint() throws Exception {

        mockMvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, this is a test message!"));
    }

    // ✅ 2. Test GET /get-all-employees
    @Test
    void getAllEmployees() throws Exception {

        //Given
        List<EmployeeResponse> employees = Arrays.asList(
                new EmployeeResponse(1, "John", "IT", "John@gmail.com", "1234567890"),
                new EmployeeResponse(2, "Alice", "HR", " alice@gmail.com", "0987654321")
        );
        when(employeeService.getAllEmployees()).thenReturn(employees);

        //When
        ResultActions response = mockMvc.perform(get("/get-all-employees"));

        //Then
        response.andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].firstName").value("John"))
                .andExpect(jsonPath("$[1].firstName").value("Alice"));
    }

    // ✅ 3. Test GET /get-employee-by-id?id=1
    @Test
    void getEmployeeById() throws Exception {
        EmployeeResponse employee = new EmployeeResponse(1, "John", "IT", "John@gmail.com", "1234567890");


        when(employeeService.getEmployeesById(1)).thenReturn(employee);

        mockMvc.perform(get("/get-employee-by-id").param("id", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.firstName").value("John"))
                .andExpect(jsonPath("$.lastName").value("IT"));
    }

//    // ✅ 4. Test POST /save-employee
//    @Test
//    void saveEmployee() throws Exception {
//        SaveEmployeeRequest request = new SaveEmployeeRequest(1,
//                "Rahul",
//                "Nama",
//                "rahul.nama@example.com",
//                "9999999999",
//                "Software Engineer",
//                new BigDecimal("75000.00"),
//                true);
//
//        // Mock service (void method in your code, so no return needed)
//        when(employeeService.saveEmployee(any(SaveEmployeeRequest.class))).thenReturn(null);
//
//        mockMvc.perform(post("/save-employee")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(request)))
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("$.message").value("Employee saved successfully"));
//    }
}
