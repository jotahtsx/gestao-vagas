package com.jotahdev.job_development.modules.candidate.Entities;

import java.util.UUID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CandidateEntity {
    
    private UUID id;
    private String name;

    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "O nome de usuário deve conter apenas letras, números e underscores. Não é permitido o uso de espaços ou caracteres especiais, como acentos ou símbolos.")
    private String username;
    
    @Email(message = "Por favor, insira um email válido.")
    private String email;
    @Size(min = 8, max = 16, message = "A senha deve ter entre 8 e 12 caracteres.")
    private String password;
    private String description;
    private String curriculum;

}