package com.namarahul.namarahulcollab.controller;

import com.namarahul.namarahulcollab.dto.Response.MessageResponse;
import com.namarahul.namarahulcollab.service.TestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController is a REST controller that provides an endpoint for testing purposes.
 * It uses the TestService to return a test message.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping
@Tag(name = "Test API", description = "API for testing OpenAPI definition")
public class TestController {

    private final TestService testService;

    /**
     * This endpoint is used for testing purposes.
     *
     * @return A string message for testing purposes.
     */
    @Operation(summary = "Get test message", description = "Returns a test message for OpenAPI documentation.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MessageResponse.class))),
            @ApiResponse(responseCode = "400", description = "Bad request - CustomException", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
    })
    @GetMapping("/test")
    public ResponseEntity<MessageResponse> test() {

        return ResponseEntity.ok()
                .body(testService.getTestMessage());
    }
}
