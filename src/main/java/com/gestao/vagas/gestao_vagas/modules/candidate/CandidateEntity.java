package com.gestao.vagas.gestao_vagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data //getters and setters
public class CandidateEntity {

    private UUID id;
    private String name;

    //validations
    @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço!")
    private String username;

    @Email(message = "O campo [e-mail] deve conter um e-mail válido!")
    private String email;

    @Length(min = 10, max = 100) //password
    private String password;
    private String description;
    private String curriculum;


}
