package org.example.controle.sercices;

import org.example.controle.dto.VoitureDto;

import java.util.List;

public interface VoitureService {
    public VoitureDto saveVoiture(VoitureDto voitureDto);


    public List<VoitureDto> getVoitureByModel(String model);


    public List<VoitureDto> saveVoitures(List<VoitureDto> voitureDtos);

}
