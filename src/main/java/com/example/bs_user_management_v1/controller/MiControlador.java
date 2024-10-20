package com.example.bs_user_management_v1.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiControlador {

    @GetMapping("/saludo")
    @Operation(
            summary = "Saludo",
            description = "Mensaje de bienvenida que puede ser usando en el FrontEnd",
            tags = {"Bienvenida"},
            requestBody = @RequestBody(
                    description = "Saludo de Bienvenida",
                    required = false,
                    content = @Content(
                            mediaType = "application/json"
                    )
            ),
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful message",
                            content = @Content(
                                    mediaType = "application/json"
                            )
                    )
            }
    )
    public String saludo() {
        return "Hola, mundo... User Service!!";
    }
}