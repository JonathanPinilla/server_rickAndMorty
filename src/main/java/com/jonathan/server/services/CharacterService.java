package com.jonathan.server.services;

import com.jonathan.server.domain.Character;
import com.jonathan.server.repository.CharacterRepository;
import com.jonathan.server.services.interfaces.ICharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService implements ICharacter {

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public List<Character> getAll() {
        return characterRepository.findAll();
    }

    @Override
    public Optional<Character> getOne(Integer id) {
        return characterRepository.findById(id);
    }

    @Override
    public String charName(Integer param_id){
        return characterRepository.selectName(param_id);
    }
}
