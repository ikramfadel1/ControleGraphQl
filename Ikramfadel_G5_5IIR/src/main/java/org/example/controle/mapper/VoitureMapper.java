package org.example.controle.mapper;

import org.example.controle.dao.entities.Voiture;
import org.example.controle.dto.VoitureDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VoitureMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Voiture fromVoitureDtoToVoiture(VoitureDto voitureDto){
        return mapper.map(voitureDto, Voiture.class);
    }

    public VoitureDto fromVoitureToVoitureDto(Voiture voiture){
        return mapper.map(voiture, VoitureDto.class);
    }

}