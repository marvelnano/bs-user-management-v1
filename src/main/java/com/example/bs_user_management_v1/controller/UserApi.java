package com.example.bs_user_management_v1.controller;

import com.example.bs_user_management_v1.model.dto.RespuestaCreadoExito;
import com.example.bs_user_management_v1.model.dto.UserRequest;
import com.example.bs_user_management_v1.util.CommonApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api")
public interface UserApi {

    @Operation(
            summary = "Listar Usuarios",
            description = "Listar todos los usuarios registrados"
            //tags = {"student-controller"},
    )
    @CommonApiResponses
    @GetMapping("/v1/users")
    RespuestaCreadoExito getAllUsers();

    @Operation(
            summary = "Registrar Usuario",
            description = "Registrar usuario según lo requerido",
            //tags = {"student-controller"},
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Student request", required = false,
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserRequest.class))
            )
    )
    @CommonApiResponses
    @PostMapping("/v1/users")
    RespuestaCreadoExito addUser(@RequestBody UserRequest userRequest);

    @Operation(
            summary = "Actualizar Usuario",
            description = "Actualizar usuario según ID",
            //tags = {"student-controller"},
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Student request", required = false,
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserRequest.class))
            )
    )
    @CommonApiResponses
    @PutMapping("/v1/users")
    RespuestaCreadoExito updateUser(@PathVariable("id") Long idUser, @RequestBody UserRequest userRequest);

    @Operation(
            summary = "Eliminar Usuario",
            description = "Eliminar usuario según ID"
            //tags = {"student-controller"},
    )
    @CommonApiResponses
    @DeleteMapping("/v1/users/{id}")
    RespuestaCreadoExito deleteUser(@PathVariable("id") Long idUser);

}
