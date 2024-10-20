package com.example.bs_user_management_v1.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.bs_user_management_v1.model.dto.UserRequest;
import com.example.bs_user_management_v1.model.dto.RespuestaCreadoExito;
import com.example.bs_user_management_v1.service.UserService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/v1/users")
    @Operation(
            summary = "Listar Usuarios",
            description = "Listar todos los usuarios registrados",
            //tags = {"student-controller"},
            responses = {
                    @ApiResponse(
                            responseCode = "200", description = "Solicitud / Operación Exitosa",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "400", description = "La solicitud posee una sintaxis o falta de parámetros",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "401", description = "Problema de Autenticación",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "403", description = "Permisos incorrectos o el servidor está deshabilitado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "404", description = "Recurso de destino inexistente. Servicio no encontrado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "408", description = "Servidor no recibe la solicitud dentro del tiempo esperado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "500", description = "Servidor presenta una condición inesperada que impide completar la solicitud",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    )
            }
    )
    RespuestaCreadoExito getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/v1/users")
    @Operation(
            summary = "Registrar Usuario",
            description = "Registrar usuario según lo requerido",
            //tags = {"student-controller"},
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Student request", required = false,
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserRequest.class))
            ),
            responses = {
                    @ApiResponse(
                            responseCode = "200", description = "Solicitud / Operación Exitosa",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "400", description = "La solicitud posee una sintaxis o falta de parámetros",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "401", description = "Problema de Autenticación",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "403", description = "Permisos incorrectos o el servidor está deshabilitado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "404", description = "Recurso de destino inexistente. Servicio no encontrado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "408", description = "Servidor no recibe la solicitud dentro del tiempo esperado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "500", description = "Servidor presenta una condición inesperada que impide completar la solicitud",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    )
            }
    )
    RespuestaCreadoExito addUser(@RequestBody UserRequest userRequest) {        
        return userService.addUser(userRequest);
    }

    @PutMapping("/v1/users/{id}")
    @Operation(
            summary = "Actualizar Usuario",
            description = "Actualizar usuario según ID",
            //tags = {"student-controller"},
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Student request", required = false,
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserRequest.class))
            ),
            responses = {
                    @ApiResponse(
                            responseCode = "200", description = "Solicitud / Operación Exitosa",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "400", description = "La solicitud posee una sintaxis o falta de parámetros",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "401", description = "Problema de Autenticación",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "403", description = "Permisos incorrectos o el servidor está deshabilitado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "404", description = "Recurso de destino inexistente. Servicio no encontrado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "408", description = "Servidor no recibe la solicitud dentro del tiempo esperado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "500", description = "Servidor presenta una condición inesperada que impide completar la solicitud",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    )
            }
    )
    RespuestaCreadoExito updateUser(@PathVariable("id") Long idUser,
        @RequestBody UserRequest userRequest) {        
        return userService.updateUser(idUser, userRequest);
    }

    @DeleteMapping("/v1/users/{id}")
    @Operation(
            summary = "Eliminar Usuario",
            description = "Eliminar usuario según ID",
            //tags = {"student-controller"},
            responses = {
                    @ApiResponse(
                            responseCode = "200", description = "Solicitud / Operación Exitosa",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "400", description = "La solicitud posee una sintaxis o falta de parámetros",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "401", description = "Problema de Autenticación",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "403", description = "Permisos incorrectos o el servidor está deshabilitado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "404", description = "Recurso de destino inexistente. Servicio no encontrado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "408", description = "Servidor no recibe la solicitud dentro del tiempo esperado",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    ),
                    @ApiResponse(
                            responseCode = "500", description = "Servidor presenta una condición inesperada que impide completar la solicitud",
                            content = @Content(
                                    mediaType = "application/json", schema = @Schema(implementation = RespuestaCreadoExito.class)
                            )
                    )
            }
    )
    RespuestaCreadoExito deleteUser(@PathVariable("id") Long idUser) {        
        return userService.deleteUser(idUser);
    }

}
