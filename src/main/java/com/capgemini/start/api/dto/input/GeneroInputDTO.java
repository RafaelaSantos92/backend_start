package com.capgemini.start.api.dto.input;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(name = "GeneroInput", description = "Objeto de entrada para inclusão e alteração da entidade Genero")
@Getter @Setter
public class GeneroInputDTO {
		
	@NotNull
	@Length(max = 100)
	private String descricao;

}