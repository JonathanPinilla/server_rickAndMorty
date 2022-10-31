package com.jonathan.server.services;

import com.jonathan.server.entity.CharactersEntity;
import com.jonathan.server.repository.CharacterRepository;
import com.jonathan.server.services.interfaces.ICharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService implements ICharacter {

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public List<CharactersEntity> getAll(Integer page) {
        return characterRepository.selectAll(page);
    }

    @Override
    public String getOne(Integer id) {
        return characterRepository.selectName(id);
    }

    @Override
    public String charName(Integer param_id){
        return characterRepository.selectName(param_id);
    }
}
