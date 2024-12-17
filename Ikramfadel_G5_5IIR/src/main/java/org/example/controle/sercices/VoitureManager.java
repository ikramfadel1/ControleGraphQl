package org.example.controle.sercices;

import lombok.AllArgsConstructor;
import org.example.controle.dao.entities.Voiture;
import org.example.controle.dao.repositories.VoitureRepository;
import org.example.controle.dto.VoitureDto;
import org.example.controle.mapper.VoitureMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class VoitureManager implements VoitureService {

    private VoitureRepository voitureRepository;
    private VoitureMapper voitureMapper;

    @Override
    public VoitureDto saveVoiture(VoitureDto voitureDto) {
        Voiture voiture = voitureMapper.fromVoitureDtoToVoiture(voitureDto);
        voiture = voitureRepository.save(voiture);
        voitureDto = voitureMapper.fromVoitureToVoitureDto(voiture);
        return voitureDto;

    }



    @Override
    public List<VoitureDto> getVoitureByModel(String model) {
        List<Voiture> voitures = voitureRepository.findByModel(model);
        List<VoitureDto> voitureDtos = new ArrayList<>();
        for (Voiture voiture : voitures) {
            voitureDtos.add(voitureMapper.fromVoitureToVoitureDto(voiture));
        }
        return voitureDtos;
    }
    @Override
    public List<VoitureDto> saveVoitures(List<VoitureDto> voitureDtos) {

        List<Voiture> voitures = new ArrayList<>();
        for (VoitureDto voitureDto : voitureDtos) {
            voitures.add(voitureMapper.fromVoitureDtoToVoiture(voitureDto));
        }

        voitures = voitureRepository.saveAll(voitures);

        voitureDtos = new ArrayList<>();
        for (Voiture voiture : voitures) {
            voitureDtos.add(voitureMapper.fromVoitureToVoitureDto(voiture));
        }
        return voitureDtos;
    }




}
