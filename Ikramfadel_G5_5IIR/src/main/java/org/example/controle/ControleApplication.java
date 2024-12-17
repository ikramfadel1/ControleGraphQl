package org.example.controle;

import lombok.AllArgsConstructor;
import org.example.controle.dto.VoitureDto;
import org.example.controle.sercices.VoitureService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@SpringBootApplication
public class ControleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}

	@Bean
	CommandLineRunner start(VoitureService voitureService){
		return  args -> {
			voitureService.saveVoitures(
					List.of(
							VoitureDto.builder().model("model1").color("red").matricul("sdf64w6e").price(12345).build(),
							VoitureDto.builder().model("model2").matricul("ef6e+6").color("green").price(65489).build(),
							VoitureDto.builder().model("model3").matricul("ef64we8").color("yellow").price(89789).build(),
							VoitureDto.builder().model("model4").matricul("wrdqwqw").color("black").price(67489).build()
					)

			);
		};
	}
}
