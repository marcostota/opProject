package com.marcostota.study.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CharacterDTO(

		@NotBlank(message = "Name cannot be blank") String name,

		@NotNull(message = "Age cannot be null") // Fixed for Integer
		Integer age,

		@NotBlank(message = "Email cannot be blank") String email

) {
}
