package com.example.bs_user_management_v1.model.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {

    private Long id;
    private String nombres;
    private String apellidos;
    private Long edad;
    
}
