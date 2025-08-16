package com.expensetracker.smartsplitter.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {


    @Email
    @NotBlank
    private String email;
    @Size(min = 6)
    private String password;
    @NotBlank
    private String username;
    private String mobile;
}
