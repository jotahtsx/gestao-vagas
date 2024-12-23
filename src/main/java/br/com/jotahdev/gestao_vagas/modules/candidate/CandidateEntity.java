package br.com.jotahdev.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {
    
    private UUID id;
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "O nome de usuário não pode conter espaços.")
    private String username;

    @Email(message = "Insira um e-mail válido para continuar.")
    private String email;

    @Length(min = 8, max = 100, message = "A senha deve ter entre 8 e 100 caracteres.")
    private String password;
    private String description;
    private String curriculum;
}
