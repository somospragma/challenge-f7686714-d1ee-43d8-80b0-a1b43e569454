package com.fintech.application;

import com.fintech.domain.FintechDTO;
import com.fintech.domain.FintechEntity;
import com.fintech.infrastructure.FintechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FintechService {

    @Autowired
    private FintechRepository fintechRepository;

    public FintechDTO createFintechEntity(FintechDTO fintechDTO) {
        FintechEntity entity = new FintechEntity();
        entity.setName(fintechDTO.getName());
        fintechRepository.save(entity);
        return fintechDTO;
    }

    public FintechDTO getFintechEntityById(Long id) {
        FintechEntity entity = fintechRepository.findById(id).orElse(null);
        if (entity!= null) {
            FintechDTO dto = new FintechDTO();
            dto.setName(entity.getName());
            return dto;
        }
        return null;
    }
}