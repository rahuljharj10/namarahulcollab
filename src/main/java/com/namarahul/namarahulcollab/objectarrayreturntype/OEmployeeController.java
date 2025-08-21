package com.namarahul.namarahulcollab.objectarrayreturntype;

import com.namarahul.namarahulcollab.dto.Response.EmployeeResponse;
import com.namarahul.namarahulcollab.dto.common.ErrorResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * OEmployeeController handles requests related to employee projections.
 * It provides endpoints to retrieve employee data using object array return types.
 */
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/object-array-return-type")
@Tag(name = "Object Array Return Type")
public class OEmployeeController {

    private final OEmployeeService employeeService;

    /**
     * Retrieves all employees' first names and last names as a list of OJuniorEmployee projections.
     *
     * @return List of OJuniorEmployee containing first and last names of all employees.
     */
    @Operation(summary = "Get all employees", description = "Retrieves a list of all employees.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = EmployeeResponse.class)))),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
    })
    @GetMapping("/get-all-employee-first-Name-and-last-name")
    public ResponseEntity<List<OJuniorEmployeeResponse>> getAllEmployeeFirstNameAndLastName() {

        log.info("Accessed /get-all-employees endpoint");

        List<OJuniorEmployeeResponse> responses = employeeService.getAllEmployeeFirstNameAndLastName();

        log.info("Returning employee responses: {}", responses);

        return ResponseEntity.ok().body(responses);
    }

    /**
     * Retrieves an employee's email by their ID.
     *
     * @param id The ID of the employee whose email is to be retrieved.
     * @return OEmployeeEmailResponse containing the email of the employee.
     */
    @Operation(summary = "Get employee by ID", description = "Retrieves an employee's details by their unique ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = EmployeeResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
    })
    @GetMapping("/get-email-by-id")
    public ResponseEntity<OEmployeeEmailResponse> getEmailById(@RequestParam Integer id) {

        log.info("Accessed /get-email-by-id endpoint with ID: {}", id);

        OEmployeeEmailResponse response = employeeService.getEmailById(id);

        log.info("Returning employee response: {}", response);

        return ResponseEntity.ok().body(response);
    }
}
