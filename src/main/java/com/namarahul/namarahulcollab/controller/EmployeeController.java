package com.namarahul.namarahulcollab.controller;

import com.namarahul.namarahulcollab.dto.Response.EmployeeResponse;
import com.namarahul.namarahulcollab.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * EmployeeController handles requests related to employee operations.
 * It provides endpoints to retrieve employee data and a test endpoint for API verification.
 */
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping
public class EmployeeController {

    private final EmployeeService employeeService;

    /**
     * Test endpoint for verifying API functionality.
     *
     * @return ResponseEntity containing a test message string.
     */
    @Operation(summary = "Get test message", description = "Returns a test message for OpenAPI documentation.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "400", description = "Bad request - CustomException", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
    })
    @GetMapping("/test")
    public ResponseEntity<String> test() {

        log.info("Accessed /test endpoint");

        String messageResponse = "Hello, this is a test message!";

        log.info("Returning test message response: {}", messageResponse);

        return ResponseEntity.ok().body(messageResponse);
    }

    /**
     * Retrieves all employees as EmployeeResponse DTOs.
     *
     * @return List of EmployeeResponse objects.
     */
    @Operation(summary = "Get all employees", description = "Retrieves a list of all employees.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = EmployeeResponse.class))),
            @ApiResponse(responseCode = "400", description = "Bad request - CustomException", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
    })
    @GetMapping("/get-all-employees")
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {

        log.info("Accessed /get-all-employees endpoint");

        List<EmployeeResponse> responses = employeeService.getAllEmployees();

        log.info("Returning employee responses: {}", responses);

        return ResponseEntity.ok().body(responses);
    }

    /**
     * Retrieves an employee by their ID as EmployeeResponse DTO.
     *
     * @param id Employee ID to retrieve.
     * @return EmployeeResponse object for the given ID.
     */
    @Operation(summary = "Get employee by ID", description = "Retrieves an employee's details by their unique ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Employee found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = EmployeeResponse.class))),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "404", description = "Employee not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
    })
    @GetMapping("/get-employee-by-id")
    public ResponseEntity<EmployeeResponse> getEmployeesById(@RequestParam Integer id) {

        log.info("Accessed /get-employee-by-id endpoint with id: {}", id);

        EmployeeResponse response = employeeService.getEmployeesById(id);

        log.info("Returning employee response for id {}: {}", id, response);

        return ResponseEntity.ok().body(response);
    }
}
