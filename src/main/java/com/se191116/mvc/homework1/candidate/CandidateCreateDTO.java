package com.se191116.mvc.homework1.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CandidateCreateDTO {

    @NotBlank
    @Size(min = 5, max = 50)
    private String fullName;

    @NotBlank
    @Email
    private String email;

    @Min(18)
    private Integer age;

    @Min(0)
    private Integer yearsOfExperience;
}
