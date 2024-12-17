package org.example.controle.web;

import lombok.AllArgsConstructor;
import org.example.controle.dto.VoitureDto;
import org.example.controle.sercices.VoitureService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class VoitureGraphQlController {

    private VoitureService voitureService ;

    @MutationMapping
    public VoitureDto saveVoiture(@Argument VoitureDto voiture){
        return voitureService.saveVoiture(voiture);
    }



    @QueryMapping
    public List<VoitureDto> getVoitureByModel(@Argument String model){

        return voitureService.getVoitureByModel(model);
    }



}


